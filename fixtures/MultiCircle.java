/*
 * 複数の円を書くプログラム
 * (角度を増やしていく版)
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class MultiCircle extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MultiCircle());
	}

	// タートルを動かす処理
	public void start() {

		{ // （円を）10個描く
			int j = 1;
			while (j <= 10) {
				{ // 円を描く
					int i = 1;
					while (i <= 360) {
						fd(1);
						rt(j);
						i = i + j;
					}
				}
				j = j + 1;
			}
		}

	}

}