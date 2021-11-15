package ex01_exception;

public class Ex05_getMessage {

	public static void main(String[] args) {
		/*
		 * 자바는 모르는데 사용자는 아는 문제.......... 
		 * int age = 1000; <- 사람 나이는 1000살이 될 수 없는데..
		 * 			인간은 아는데 자바는 알지 못하는 문제이다...
		 * 
		 *  getMessage()
		 *  1. 정의: 예외의 메시지를 반환하는 메소드
		 *  2. 용도: 이미 작성된 예외 메시지를 확인하거나
		 *  		개발자가 정의한 예외 메시지를 확인할 때 사용한다..
		 *  
		 *  
		 *  
		 *  
		 */	
		
		try {
			int[] a = new int[5];
			System.out.println(a[10]); //ArrayOutOfBoundsException
			Integer.parseInt("1.5"); //1.5를 정수로 바꿀 수 없음!!  NumberFormatException
			System.out.println(2 / 0); //AtithemeticException
			
		}catch(Exception e) {
			//예외 메시지 확인
			System.out.println(e.getMessage()); //getMessage!
		}
	
	
	
	}

}
