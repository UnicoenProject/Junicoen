/**
 * 星を書くプログラム
 * 
 * Yoshiaki Matsuzawa
 * 2003/06/17
 */
public class Star extends Turtle {

	//起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Star());
	}

	//タートルを動かす処理
	public void start() {

		int i;

		rt(18);
		i = 0;
		while (i < 5) {
			fd(100);
			rt(144);
			i++;
		}

	}

}