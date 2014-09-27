/*
 * 家を書くプログラム (変数は複数作れる）
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class MultiVariableHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MultiVariableHouse());
	}

	// タートルを動かす処理
	public void start() {

		int length;// 1辺の長さ
		int rightAngle;// 直角

		length = 50;// 1辺の長さを50に設定する
		rightAngle = 90;// 直角を90度に設定する

		{// 屋根を書く
			rt(30); // 30度右に回る
			fd(length); // x歩前に進む
			rt(120);
			fd(length);
			rt(120);
			fd(length);
		}

		{// 本体を書く
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
			lt(rightAngle);
			fd(length);
		}
	}

}