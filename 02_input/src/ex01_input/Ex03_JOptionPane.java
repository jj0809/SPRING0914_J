package ex01_input;

import javax.swing.JOptionPane;

public class Ex03_JOptionPane {
	public static void main(String[] args) {
		/*
		 * JOptionPane 클래스
		 * 
		 * 1. GUI 컴포넌트를 통한 입력과 출력을 지원
		 *    (별도의 화면이 따로 나타남)
		 * 2. swing 컴포넌트 이용
		 *    1) javax.swing 패키지에 저장되어 있음(import 필요)
		 *    2) javax.swing.JOptionPane - 풀네임 (import 안할 때 풀네임 사용)
		 * 3. 입력 메소드 
		 *    1) showInputDialog() //Dialog: 대화상자
		 *    2) 반환되는 값(메소드의 결과, =입력되는 값)의 타입은 언제나 String!
		 *    3) 사용법
		 *       String 변수 = JOptionPane.showInputDialog("입력 대화상자에 나타날 메시지") 
		 * 
		 * //일반적으로 클래스를 사용할 때는 new를 통해서 만들고 사용하지만, JOptionPane은 아니다
		 * 
		 * 4. 출력 메소드
		 *    1) showMessageDialog()
		 *    2) 사용법
		 *       JOptionPane.showMessageDialog(null, "출력D할 메시지 메소드");
		 *    //null: 레퍼런스 타입의 값이 없을 때 사용하는 키워드
		 *   
		 */
		
		//이름, 나이, 키, 성별을 입력받아 출력하기
		
		// 1) 입력
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		String strAge = JOptionPane.showInputDialog("나이를 입력하세요.");
		String strHeight = JOptionPane.showInputDialog("키를 입력하세요.");
		String strGender = JOptionPane.showInputDialog("성별을 입력하세요.");
		
		// 2) 각 변수의 타입에 맞게 변환
		// strAge -> int, strHeight -> double [parsing] 사용
		// strGender -> char [charAt(0)] 사용
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		char gender = strGender.charAt(0); //첫번째 글자 = 0
		
		// 3) 출력
		String message = "이름: " + name + 
				", 나이: " + age +
				", 키: " + height +
				", 성별" + gender;
			
		// 한 번에 dialog에 출력하기
		JOptionPane.showMessageDialog(null, message);
		
		
		
	}

}
