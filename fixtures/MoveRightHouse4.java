/*
 * 家を右に動かすプログラム(其の4: 右端に行ったら左端に戻す(ワープを使う))
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class MoveRightHouse4 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse4());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 1コマの処理を行う
					int x = house.getX();
					int y = house.getY();
					{ // 右に移動
						house.warp(x + 5, y);
					}
					{ // 右端だったら左端にワープ
						if (x >= 300) {
							house.warp(0, y);
						}
					}
				}
				update();
			}
		}
	}

}