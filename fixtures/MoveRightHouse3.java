/*
 * 家を右に動かすプログラム(其の3: 上に向いたまま右に動かす(ワープを使う))
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class MoveRightHouse3 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse3());
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
					house.warp(x + 5, y);
				}
				update();
			}
		}
	}

}