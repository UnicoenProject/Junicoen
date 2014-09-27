/*
 * 家を右に動かすプログラム(其の2: 上に向いたまま右に動かす)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class MoveRightHouse2 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse2());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 1コマの処理を行う
					house.rt(90);
					house.fd(5);
					house.lt(90);
				}
				update();
			}
		}
	}

}