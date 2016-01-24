/**
 * プログラム名： 作成者： 作成日： Wed Oct 03 21:54:44 JST 2012
 */
public class _15ListTurtleTest extends Turtle {
	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new _15ListTurtleTest(), args);
	}

	// タートルを動かす処理
	public void start() {
		ListTurtle<Turtle> turtles = new ListTurtle<Turtle>();
		ListTurtle<CardTurtle> turtles1 = new ListTurtle<CardTurtle>();
		ListTurtle<CardTurtle> turtles12 = new ListTurtle<CardTurtle>(true, "hoge");
		ListTurtle<ImageTurtle> turtles2 = new ListTurtle<ImageTurtle>();
		ListTurtle<CardTurtle> turtles3 = new ListTurtle<CardTurtle>();
		ListTurtle<ImageTurtle> turtles4 = new ListTurtle<ImageTurtle>();
		turtles.add(new Turtle());
		Turtle t = new Turtle();
		turtles.add(new Turtle());
		turtles.add(t);
		turtles.get(0).fd(50);
		turtles.get(turtles.getCursor()).fd(50);
		turtles2 = turtles4;
		int i = turtles.getSize();
	}

}
