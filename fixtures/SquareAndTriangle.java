/*
 * 四角と三角を並べていくプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class SquareAndTriangle extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new SquareAndTriangle());
	}

	// タートルを動かす処理
	public void start() {

		int length = 50;// １辺の長さ

		{// 図形を描く　（8回繰り返す）
			int i = 1;
			while (i <= 8) {

				if (i % 2 == 0) {// 偶数なら
					{// 四角形を書く
						int j = 1;
						while (j <= 4) {
							fd(length);
							lt(90);

							j++;// jを1増やす([j = j + 1] の省略形)
						}
					}
				} else {// 奇数なら
					{// 三角形を書く
						int j = 1;
						while (j <= 3) {
							fd(length);
							lt(120);

							j++;// jを1増やす([j = j + 1] の省略形)
						}
					}
				}

				{// 次の図形を書く位置に移動する
					up();
					rt(135);
					fd(length);
					rt(180);
					down();
				}

				i++;// jを1増やす([i = i + 1] の省略形)
			}
		}

	}

}