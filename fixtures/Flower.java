/*
 * 花を書くプログラム
 * 2003/06/08 Yoshiaki Matsuzawa
 * 2012/10/16 改訂 Yoshiaki Matsuzawa
 */
public class Flower extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new Flower());
	}

	// タートルを動かす処理
	public void start() {

		{// 花をかく（6枚の花びらを書く）
			int j = 1;
			while (j <= 6) {

				{// 花びらを描く
					{// 円弧を描く
						int i = 1;
						while (i <= 120) {
							rt(1);
							fd(1);
							i++;
						}
					}

					{// 次の円弧の角度へ
						rt(60);
					}

					{// 円弧を描く
						int i = 1;
						while (i <= 120) {
							rt(1);
							fd(1);
							i++;
						}
					}

				}

				j++;
			}
		}
	}
}