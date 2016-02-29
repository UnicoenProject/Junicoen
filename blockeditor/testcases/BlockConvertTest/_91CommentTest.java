/**
* プログラム名：
* 作成者： 
* 作成日： Thu Nov 15 10:21:19 JST 2012
*/
public class _91CommentTest extends Turtle{
		
	private int hoge = 0;//hogehoge@block (100,100) @comment (100,70)
	private int hoge2 = 0;//@block (100,70)
	/*
	 	@comment(300,50)
	 	@block(310,110)
	 */
	public void run() {
		fd(50);//カメが前に進む@comment (350,120)
		rt(90);
	}
	
	/*
		run1
		@comment (300,250)
		@block (300,300)
	 */
	public void run1() {
		
		{//四角形を書く[close]
			fd(50);
			rt(90);
		}
	}
	
	/*run2[close]
		@comment (500,250)
		@block (500,300)
	 */
	public void run2() {
		int i = 0;
		fd(50);
		rt(90);
	}

	
	/*
	  run3は非表示[close]
	  @comment (500,250)
	  @block (500,300)
	  @invisible
	 */
	public void run3() {
		int i = 0;
		fd(50);
		rt(90);
	}

	
	
}			