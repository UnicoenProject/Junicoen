package net.unicoen.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * BufferedReader specialization to hold scanf.
 *
 * commented portions of this code where an attempt to parse integer number
 * "by hand". It actually worked though, the gain of doing things that way was
 * close to 5 microsseconds. (practically nothing).
 * https://gist.github.com/ppanhoto/82773
 * @author Paulo Rogério Panhoto
 *
 *         Created on 21/03/2009
 */
public class FormatReader extends BufferedReader
{
    /**
     * Line separator
     */
    private static String ls = System.getProperty("line.separator");

    // /**
    // * A table to hold numbers.
    // */
    // private static int[] symbolTable;

    public FormatReader(Reader in)
    {
        super(in);
        setup();
    }

    /**
     * remaining character from last string capture.
     */
    private int remain = -1;

    public FormatReader(Reader in, int sz)
    {
        super(in, sz);
        setup();
    }

    /**
     * scanf itself: matches the input from the reader to the format passed as
     * argument. The character input will be checked against the format string for
     * exact matches until an escape sequence is found. Escape sequences, as usual
     * are formed by the '%' sign followed by one format specifier.
     * <p>
     * A format specifier can be one of: <BR>
     * % = an exact match of the percent sign <br>
     * n = an exact match of a system specific newline <br>
     * s,S = fetches a string from input <br>
     * d = fetches an integer value (returned as long) from input <br>
     * o = fetches an integer value (represented as octal) from input <br>
     * c = fetches a single character from input <br>
     * x,X = fetches an integer value (represented as hex) from input <br>
     * f = fetches a floating point value (double) from input <br>
     *
     * @param format
     *          Format string.
     * @return an array containing all the fetched elements from input
     * @throws IOException
     *           {@link Reader#read()}
     * @throws ParseException
     *           When a character read from the {@link Reader} differs from
     *           expected in the format string.
     */
    public Object[] scanf(String format) throws IOException, ParseException
    {
        List<Object> data = new ArrayList<Object>();

        TapeReader fmt = new TapeReader(format.replace("%n", ls));
        int c = read();
        if(c == -1)
            return null;

        parse(c, fmt, data);

        while(!fmt.end())
        {
            if(remain != -1)
            {
                parse(remain, fmt, data);
                remain = -1;
            }
            parse(read(), fmt, data);
        }
        return data.toArray();
    }

    private void parse(int c, TapeReader fmt, List<Object> data)
            throws IOException, ParseException
    {
        int f;
        f = fmt.next();
        if(c == -1 || fmt.end()) return;
        if(f == '%')
        {
            char t = (char)fmt.next();
            switch(t)
            {
                case 's':
                case 'S':
                    data.add(getString(c, fmt));
                    break;
                case 'd':
                    data.add(getInteger(c, fmt, 10));
                    break;
                case 'o':
                    data.add(getInteger(c, fmt, 8));
                    break;
                case 'x':
                case 'X':
                    data.add(getInteger(c, fmt, 16));
                    break;
                case 'f':
                    data.add(getDouble(c, fmt));
                    break;
                case 'c':
                    if(c != -1)
                        data.add((char) c);
                    break;
                case '%':
                    test(c, '%', fmt.head());
                    break;
                default:
                    throw new ParseException("Invalid format specifier: " + t, fmt
                            .head());
            }
            return;
        }
        test(f, c, fmt.head());
    }

    /**
     * Checks the expected and read character.
     *
     * @param actual
     *          character got from the {@link BufferedReader}
     * @param expected
     *          expected character from the format string
     * @param n
     *          position in the format string (for debugging purposes)
     * @throws ParseException
     *           the actual and expected characters do not match.
     */
    private void test(int actual, int expected, int n) throws ParseException
    {
        if(expected != actual)
            throw new ParseException((char) expected + " expected, got "
                    + (char) actual, n);
    }

    /**
     *
     * @param fmt
     *          format string "browser"
     * @return a string from the reader that gets read until the next character
     *         (after the s) comes in.
     * @throws IOException
     *           {@link #read()}
     */
    private String getString(int c, TapeReader fmt) throws IOException
    {
        StringBuilder b = new StringBuilder();
        int end = fmt.next();
        for(; c != end && c > -1; c = read())
            b.append((char) c);
        fmt.prev();
        remain = c;
        return b.toString();
    }

    /**
     *
     * @param fmt
     * @param base
     *          base for the number conversion.
     * @return Number returned from the stream
     * @throws IOException
     *           {@link #read()}
     * @throws ParseException
     *           {@link #test(int, int, int)}
     * @see #getString(TapeReader)
     */
    private long getInteger(int c, TapeReader fmt, int base) throws IOException,
            ParseException
    {
        // long value = 0;
        // int digit;
        // int c;
        // for(c = read(); c > -1 && c < symbolTable.length
        // && (digit = symbolTable[c]) != -1; c = read())
        // {
        // if(digit >= base)
        // throw new NumberFormatException();
        // value = (value * base) + digit;
        // }
        // test(c, fmt.next(), fmt.head());
        // return value;
        return Long.parseLong(getString(c, fmt), base);
    }

    /**
     *
     * @param fmt
     * @return floating point value converted from incoming {@link Reader}
     * @throws IOException
     *           {@link #read()}
     * @see #getString(TapeReader)
     */
    private double getDouble(int c, TapeReader fmt) throws IOException
    {
        return Double.parseDouble(getString(c, fmt));
    }

    private void setup()
    {
        // if(symbolTable == null)
        // {
        // symbolTable = new int[128];
        // Arrays.fill(symbolTable, -1);
        // int i;
        // for(i = '0'; i <= '9'; ++i)
        // symbolTable[i] = i - '0';
        // for(i = 'A'; i <= 'F'; ++i)
        // symbolTable[i] = i - 'A' + 0xa;
        // for(i = 'a'; i <= 'f'; ++i)
        // symbolTable[i] = i - 'a' + 0xa;
        // }
    }

    /**
     * Class that implements a "browser" of the format string.
     *
     * @author Paulo Rogério Panhoto
     *
     *         Criado em 21/03/2009
     */
    private class TapeReader
    {
        /**
         * Character sequence
         */
        private char[] tape;

        /**
         * Current character
         */
        private int head;

        /**
         * Constructs a {@link TapeReader} from a {@link String}
         *
         * @param str
         *          String to be checked.
         */
        public TapeReader(String str)
        {
            tape = str.toCharArray();
            head = 0;
        }

        /**
         * @return current character pointed by the head.
         */
        public int current()
        {
            return tape[head];
        }

        /**
         *
         * @return current character and advances the head or -1 when end of string
         *         is reached
         */
        public int next()
        {
            if(head == tape.length)
                return -1;
            return tape[head++];
        }

        /**
         *
         * @return current character and rewinds the head.
         */
        public int prev()
        {
            if(head == -1)
                ++head;
            --head;
            return tape[head];
        }

        /**
         *
         * @return <code>true</code> if the tape (string) gets to its end.
         */
        public boolean end()
        {
            return head == tape.length;
        }

        public int head()
        {
            return head;
        }

        @Override
        public String toString()
        {
            return String.valueOf(tape[head]);
        }
    }

//    /**
//     * Test sequence.
//     *
//     * @param args
//     * @throws Throwable
//     */
//    public static void main(String[] args) throws Throwable
//    {
//        String[][] testPair = {
//                { "this is a test.", "%s is a %s." },
//                { "line 1" + ls + "line 2", "%s%n%s" },
//                { "command(arg)", "%s(%s)" },
//                { "A test has been completed within 03:24 min",
//                        "A test has been completed within %d:%d min" },
//                { "pi = 3.14159", "pi = %f" },
//                { "testing octal = 2634%", "testing octal = %o%%" },
//                { "testing hex = baadf00d", "testing hex = %x" },
//                { "2009-03-21 13:28:32 [INFO] Trying to log anything",
//                        "%d-%d-%d %d:%d:%d [%s] %s" },
//                {"the character A", "the character %c"} };
//
//        double[] avg = new double[testPair.length];
//
//        int attempts = 1000;
//        for(int n = 0; n < attempts; ++n)
//        {
//            for(int t = 0; t < testPair.length; ++t)
//            {
//                String[] pair = testPair[t];
//                long start = System.nanoTime();
//                Object[] ret = new FormatReader(new StringReader(pair[0]))
//                        .scanf(pair[1]);
//                long end = System.nanoTime();
//                if(n > 0)
//                    avg[t] += (end - start) / 1e6;
//                if(n + 1 == attempts)
//                {
//                    for(Object r : ret)
//                        System.out.println(r);
//                    System.out.printf("%f%n", avg[t] / (n - 1));
//                }
//            }
//        }
//    }
}