/*
 * じゃんけんプログラム
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class Janken extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Janken());
	}

	// タートルを動かす処理
	public void start() {

		int handNumber;// じゃんけんの手

		// じゃんけんの手は　1をグー,2をチョキ,3をパーとする
		handNumber = random(3) + 1;// random(3)は0から2までの値を発生するので1を足す

		if (handNumber == 1) {
			{// c//グーを書く
				fd(30);

				lt(30);
				fd(25);
				rt(60);
				fd(25);
				rt(150);
				fd(30);
				lt(180);
				fd(20);

				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);

				fd(65);
			}

		} else if (handNumber == 2) {
			{// c//チョキを書く

				fd(30);

				lt(30);
				fd(25);
				rt(60);
				fd(25);
				rt(150);
				fd(30);
				lt(180);
				fd(30);

				lt(15);
				fd(80);
				rt(105);
				fd(20);
				rt(75);
				fd(80);
				lt(75);

				lt(75);
				fd(80);
				rt(75);
				fd(20);
				rt(105);
				fd(80);
				fd(20);
				lt(105);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);
				lt(90);
				fd(5);

				lt(90);
				fd(20);
				rt(90);
				fd(20);
				rt(90);
				fd(20);

				fd(65);
			}

		} else if (handNumber == 3) {
			{// c//パーを書く

				fd(30);

				lt(30);
				fd(80);
				rt(120);
				fd(20);
				rt(60);
				fd(40);
				lt(150);
				fd(15);

				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);
				lt(90);
				fd(5);

				lt(90);
				fd(80);
				rt(90);
				fd(20);
				rt(90);
				fd(80);

				fd(75);
			}

		} else { // 1,2,3以外の場合

			print("不正な数です。");

		}

	}

}