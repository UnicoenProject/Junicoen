/*
 * 家を大きくするプログラム(大きさを測る)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class LargeHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new LargeHouse());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 1コマの処理を行う
					house.size(200, 200);
				}
				update();
			}
		}
	}

}