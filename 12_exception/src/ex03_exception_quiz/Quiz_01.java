/*내꺼임
 * package ex03_exception_quiz;
 * 
 * UpDown Game
 * 
 * 컴퓨터가 1 ~ 100 사이 난수를 생성하면 사용자가 난수를 맞히는 게임 몇 번 만에 맞췄는지 게임 종료 시 출력 1 ~ 100 범위 내
 * 값이 아닌 경우 NumberOutOfBoundsException 예외 발생 예외 메시지: 1 ~ 100 사이 정수만 입력할 수 있습니다.
 * 
 * 
 * import java.util.Scanner;
 * 
 * class UpDownGame{ 
 * //field 
 * private int answer; //발생된 난수 
 * private int count;//시도 횟수 
 * private Scanner sc; //입력 받을 sc (모든 메소드에서 sc 객체를 사용할 수 있음) 
 * private intx; //constructor 
 * 
 * public UpDownGame() { 
 * answer = (int)(Math.random()*100)+1;
 * count = 0; //생략 가능한 문장 
 * sc = new Scanner(System.in);
 * 
 * } //method 사용자가 1 - 100 값 입력 사용자가 입력한 값을 리턴 NumberOutOfBoundsException 예외 발생
 * 가능
 * 
 * public int challenge() throws NumberOutOfBoundsException { //입력받기 
 * 	do{
	 * System.out.print("숫자를 입력하세요 >>> "); 
	 * x = sc.nextInt();
	 * //InputMismatchException 발생 가능: 정수가 아닌 실수나 문자 입력 시 
	 * count++; 
	 * //예외 발생 
	 * if (x < 1|| x > 100) { 
			 * NumberOutOfBoundsException e = new NumberOutOfBoundsException("1 ~ 100 사이 정수만 입력할 수 있습니다."); 
			 * throw e; 
			 * }else if(x > answer) { 
			 * System.out.println("Down"); continue; 
			 * }else if (x < answer) {
			 * System.out.println("Up"); continue; 
		} 
*  * } while(x != answer);
	 * System.out.println("정답! 총 시도 횟수: " + count); return x; 
 * } 
 * public void play() {
	 * //challenge 호출 
	 * //try catch 필요 
	 * try { 
	 * 	challenge(); 
	 * }catch(Exception e){
	 * 	System.out.println(e.getMessage()); } //필요 
	 * sc.close(); } 
 * }
 * 
 * class NumberOutOfBoundsException extends Exception{ 
 * //예외 클래스가 되려면 Exception의 자식이어야 한다 
 * //생성자 
 * public NumberOutOfBoundsException(String message) {
 * super(message); //Exception에 메시지를 전달 ; 
 * } 
 * }
 * 
 * public class Quiz_01 {
 * 
 * public static void main(String[] args) { 
 * UpDownGame game = new UpDownGame();
 * game.play();
 * 
 * }
 * 
 * }
 */
