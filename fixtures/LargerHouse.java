/*
 * 家を大きくするプログラム(其の1: 大きくしていく)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class LargerHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new LargerHouse());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 1コマの処理を行う
					int width = house.getWidth();
					int height = house.getHeight();
					house.size(width + 2, height + 2);
				}
				update();
			}
		}
	}

}