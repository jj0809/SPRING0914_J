package ex01_exception;

//Stack의 추적 결과를 print하라!
//Stack은 일기장과 같다.. 이거 햇구 그담에 이거햇구 이거햇다..

/* 개발단계에서 추적 메소드는 버릇처럼 넣어야 한다..!*/

public class Ex06_printStackTrace {
	
	/* 개발 중 -> e.printStackTrace() 넣어줌
	 * 개발 완료 -> e.printStackTrace 없애고 적절한 예외처리를 해준다 
	 * 
	 */

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		}catch(Exception e) {
			e.printStackTrace(); //개발단계에서 문제를 확인하기 위한 메소드^ㅁ^!
		}

	}

}
