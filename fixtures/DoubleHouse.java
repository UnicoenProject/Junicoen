/*
 * 家を2つ書くプログラム (計算させるプログラムの例)
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class DoubleHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new DoubleHouse());
	}

	// タートルを動かす処理
	public void start() {

		int length = 100;// 1辺の長さ
		int smallHouseLength;// 小さい家の1辺の長さ
		int rightAngle = 90;// 直角
		smallHouseLength = length / 2;

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

		{// 小さい家を書く位置まで移動する
			up();
			lt(rightAngle * 2);
			fd(length * 2);
			lt(rightAngle);
			down();
		}

		{// 小さい家の屋根を書く
			rt(30);
			fd(smallHouseLength);
			rt(120);
			fd(smallHouseLength);
			rt(120);
			fd(smallHouseLength);
		}

		{ // 小さい家の本体を書く
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
			lt(rightAngle);
			fd(smallHouseLength);
		}
	}

}