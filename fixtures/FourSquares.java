/*
 * 四つの四角を描くプログラム
 * 2012/10/21 Yoshiaki Matsuzawa
 */
public class FourSquares extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourSquares());
	}

	// タートルを動かす処理
	public void start() {
		{ // 窓を描く
			int j = 1;
			while (j <= 4) {
				{ // 四角形を描く
					int i = 1;
					while (i <= 4) {
						fd(50);
						rt(90);
						i++;
					}
				}
				rt(90);
				j++;
			}
		}
	}

}
