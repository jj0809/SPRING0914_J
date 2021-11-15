package ex03_exception_quiz;

class Game{
	public int challenge() throws Exception {
		return 0;
	}
	public void play() throws Exception {
		int a = challenge();
	}
}



public class Quiz_02 {

	/* 방법 1
	 * public static void main(String[] args) { Game game = new Game(); try {
	 * game.play(); }catch(Exception e) {
	 * 
	 * } }
	 */
	
//	방법 2 - 아무도 처리하지 않는다..
	public static void main(String[] args) throws Exception{ //JVM에게 예외처리를 넘김
		Game game = new Game();
		game.play();
	}
}
