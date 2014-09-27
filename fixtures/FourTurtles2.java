/*
 * タートルを4匹使って、4つの円を書くプログラム (同時に動くバージョン)
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class FourTurtles2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new FourTurtles2());
	}

	// タートルを動かす処理
	public void start() {

		// 4匹のカメを生成
		Turtle kameTaro = new Turtle();
		Turtle kameJiro = new Turtle();
		Turtle kameSaburo = new Turtle();
		Turtle kameShiro = new Turtle();

		{// 亀三郎と亀四郎は後ろに下がる
			kameSaburo.bk(100);
			kameShiro.bk(100);
		}

		{// アニメーションする
			int i = 0;
			while (i < 360) {

				{// 亀太郎は右回り
					kameTaro.rt(1);
					kameTaro.fd(1);
				}

				{ // 亀次郎は左回り
					kameJiro.lt(1);
					kameJiro.fd(1);
				}

				{ // 亀三郎は右回り
					kameSaburo.rt(1);
					kameSaburo.fd(1);
				}

				{// 亀四郎は左回り
					kameShiro.lt(1);
					kameShiro.fd(1);
				}

				i++;
			}
		}

	}

}