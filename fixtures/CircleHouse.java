/*
 * 家で円を描くプログラム
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class CircleHouse extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new CircleHouse());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		{ // 赤い軌跡を描く準備
			house.color(java.awt.Color.red);
			house.down();
		}
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // c//1コマの処理を行う
					house.rt(5);
					house.fd(5);
				}
				update();
			}
		}
	}

}