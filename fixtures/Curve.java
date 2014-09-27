/*
 * 曲線を書くプログラム
 * 2003/05/08
 * Yoshiaki Matsuzawa
 */
public class Curve extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Curve());
	}

	// タートルを動かす処理
	public void start() {

		{// 右円弧
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
			rt(5);
			fd(5);
		}

		{// 左円弧
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
			lt(5);
			fd(5);
		}

	}

}