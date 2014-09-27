/*
 * 家を右に動かすプログラム(其の1: 右に向けて動かす方法)
 * 
 * 2003/06/16 Yoshiaki Matsuzawa
 * 2012/10/31 改訂 Yoshiaki Matsuzawa
 */
public class MoveRightHouse1 extends Turtle {

	// 起動処理
	public static void main(String[] args) {
		Turtle.startTurtle(new MoveRightHouse1());
	}

	// タートルを動かす処理
	public void start() {
		House house = new House();
		house.rt(90);
		{ // アニメーションループ
			while (true) {
				sleep(0.1);
				{ // 1コマの処理を行う
					house.fd(5);
				}
				update();
			}
		}
	}

}