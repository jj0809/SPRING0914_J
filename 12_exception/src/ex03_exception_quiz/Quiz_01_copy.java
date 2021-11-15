package ex03_exception_quiz;
/*UpDown Game
 * 컴퓨터가 1 ~ 100 사이 난수를 생성하면 사용자가 난수를 맞히는 게임
 * 몇 번 만에 맞췄는지 게임 종료 시 출력
 * 1 ~ 100 범위 내 값이 아닌 경우 NumberOutOfBoundsException 예외 발생
 * 예외 메시지: 1 ~ 100 사이 정수만 입력할 수 있습니다.
 */

//샘코드

import java.util.InputMismatchException; //java util에서 Import 해오기
import java.util.Scanner;

class UpDownGame{
	//field
	private int answer; //발생된 난수
	private int count; //시도 횟수
	private Scanner sc; //입력 받을 sc (모든 메소드에서 sc 객체를 사용할 수 있음)
	//constructor
	public UpDownGame() {
		answer = (int)(Math.random()*100)+1;
		count =  0; //생략 가능한 문장
		sc = new Scanner(System.in);
		
	}
	//method
	/*사용자가 1 - 100 값 입력
	 * 사용자가 입력한 값을 리턴
	 * NumberOutOfBoundsException 예외 발생 가능
	 */
	public int challenge() throws InputMismatchException, NumberOutOfBoundsException{
		//입력받기
		System.out.print("숫자를 입력하세요 >>> ");
		int x = sc.nextInt(); //InputMismatchException 발생 가능: 정수가 아닌 실수나 문자 입력 시
		count++;
		//예외 발생
		if (x < 1 || x > 100) { //NumberOutOfBoundsException 발생
			//사용자 예외는 throw 문으로 직접 던져야 한다
			throw new NumberOutOfBoundsException("1 ~ 100 사이 정수만 입력할 수 있습니다."); 
		}
		return x;
	}
	public void play() {
		while(true) {//맞힐 때까지 계속
			try {
				int n = challenge(); //x는 challenge의 결과 x가 넘어올 수도, 예외가 넘어올 수도 있음
				if (n > answer) {
					System.out.println("Down");
				}else if (n < answer) {
					System.out.println("Up");
				}else {
					System.out.println("정답: " + answer + "(" + count + "번 시도)"); 
					sc.close(); //끝나기 전 sc 종료, 안 넣어도 자동으로 닫힘
					break; //여기서 while (true) 마침, play 메소드 종료됨
				//	return; // play 메소드를 종료함
				}
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력할 수 있습니다.");//언제 발생하는 오류인지 알고 있으므로 메시지 지정 입력
				/*정수가 아닌 입력은 int n에 저장되지 않아 전달되지 못하고 
				 * 계속 입력 스트림에 남아 있어 제거가 필요
				 */
				sc.next(); //입력받아 저장하는 곳 없음. 스트림에서 제거하는 용도
			}catch(NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class NumberOutOfBoundsException extends Exception{
	//예외 클래스가 되려면 Exception의 자식이어야 한다
	//생성자
	public NumberOutOfBoundsException(String message) {
		super(message); //Exception에 메시지를 전달
	}
}

public class Quiz_01_copy {

	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		game.play();

	}

}
