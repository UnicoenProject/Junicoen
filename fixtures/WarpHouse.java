/*
 * 4つの家をワープを使って配置するプログラム
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class WarpHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new WarpHouse());
	}

	// タートルを動かす処理
	public void start() {
		House house1 = new House();
		House house2 = new House();
		House house3 = new House();
		House house4 = new House();
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 処理を行う
					house1.warp(100, 100);
					house2.warp(100, 200);
					house3.warp(200, 100);
					house4.warp(200, 200);
				}
				update();
			}
		}
	}

}