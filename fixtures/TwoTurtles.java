/*
 * タートルを2匹使って、2つの円を書くプログラム
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class TwoTurtles extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new TwoTurtles());
	}

	// タートルを動かす処理
	public void start() {
		Turtle kameTaro = new Turtle();
		Turtle kameJiro = new Turtle();
		{ // アニメーションをする
			int i = 0;
			while (i < 360) {
				{ // 亀太郎は右回り
					kameTaro.rt(1);
					kameTaro.fd(1);
				}
				{ // 亀次郎は左回り
					kameJiro.lt(1);
					kameJiro.fd(1);
				}
				i++;
			}
		}
	}

}