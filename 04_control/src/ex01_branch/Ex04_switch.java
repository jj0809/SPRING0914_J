package ex01_branch;

public class Ex04_switch {

	public static void main(String[] args) {

		/*
		 * switch 문
		 * 1. 표현식의 결과에 따라 실행을 구분함 (조건식 아님)
		 * 2. 형식
		 *    switch (표현식) {
		 *    case 표현식의 결과 1 : 실행문 1;
		 *                  break;
		 *    case 표현식의 결과 2 : 실행문 2;
		 *                  break;
		 *    case 표현식의 결과 3 : 실행문 3;
		 *                  break;
		 *    default : 실행문 4; // 나머지 모든 결과는 default로 처리함, break문 없음, 생략 가능
		 *   
		 *    }
		 *    
		 * 3. 주의사항
		 *    1) 표현식의 결과는 정수, 문자, 문자열 가능
		 *    2) 표현식의 결과가 논리나 실수일 경우 switch 문 사용 불가
		 *    
		 * 
		 */
		
		int genderNum = 2;
		String gender = null;
		//String gender = "";
		
		switch (genderNum % 2) {
		case 0: gender = "여자";
		        break;
		case 1: gender = "남자";
				break; //필요하지 않은 break(마지막 case 또는 default 에서는 break 생략가능)
		}
		
		System.out.println(gender);
		
	}

}
