/*
 * 家を書くプログラム (プロンプト付き)
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class PromptHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new PromptHouse());
	}

	// タートルを動かす処理
	public void start() {

		int length;// 1辺の長さ
		int rightAngle = 90;// 直角

		{// 入力を受け取る
			print("1辺の長さを入力してください");
			length = input();// 1辺の長さを入力値に設定する
		}

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