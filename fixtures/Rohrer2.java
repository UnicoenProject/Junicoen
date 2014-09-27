/*
 * 健康管理プログラム
 * （身長と体重からローレル指数を計算し、体型に対するコメントを表示する）
 * 2003/05/08  Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class Rohrer2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Rohrer2());
	}

	// タートルを動かす処理
	public void start() {

		int height; // 身長
		int weight; // 体重
		int rohrer; // ローレル指数

		{// ユーザの入力を受け取る
			print("身長を入力してください");
			height = input();
			print("体重を入力してください");
			weight = input();
		}

		{// ローレル指数を求める
			rohrer = weight * 10000000 / height / height / height;
			print("ローレル指数は" + rohrer + "です。");
		}

		{// 体型に対するコメントを提示する
			if (rohrer < 100) {
				print("やせすぎですね。");
			}
			if (rohrer >= 100 && rohrer < 115) {
				print("やせていますね。");
			}
			if (rohrer >= 115 && rohrer < 145) {
				print("普通ですね。");
			}
			if (rohrer >= 145 && rohrer < 160) {
				print("太っていますね。");
			}
			if (rohrer >= 160) {
				print("太りすぎですね。");
			}
		}
	}
}