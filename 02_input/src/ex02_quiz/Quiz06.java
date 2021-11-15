package ex02_quiz;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Quiz06 { 
	public static void main(String[] args) {
		
		// 문제. 주민등록번호를 - 없이 입력받아
		//"남자" "여자" 구별하기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 - 없이 입력하시오 >>> ");
		String strnum = sc.next();
		char num = strnum.charAt(6);
		//int 변환을 하지 않아도 계산이 되더라..?

		// num -> 정수
		// '1'     49(문자 코드값) 
		// '2'     50
		// '3'     51
		// '4'     52
		//대표코드값
		// '0' : 48 
		// 'A' : 65
		// 'a' : 97

		
		//System.out.println((int)num%2 == 0 ? "여자" : "남자");
		System.out.println(num == '2' || num == '4' ? "여자" : "남자");
		// 이 때 num은 코드 값으로 계산된다
		
		sc.close();
		/*	
		 * 정수로 입력받는 방법   - 애초에 00년생 등이 있어서 주민등록번호를 정수로 받으면 안됌
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 - 없이 입력하시오 >>> ");
		//주민등록번호는 13자리로 int 대신 long을 사용해야함
		long numm = sc.nextLong(); 
		//어떻게 7번째 자리만 빼오지..?
		numm = (numm /1000000) % 10;
		System.out.println(numm%2 == 0 ? "여자" : "남자");
				
		
		JOptionpane 쓰는 법
		String n3 = JOptionPane.showInputDialog("주민등록번호 입력");
		char n4 = n3.charAt(6);
		JOptionPane.showMessageDialog(null, (int)n4%2 == 0 ? "여자" : "남자");
		*/
		
		System.out.println('1'+'2');
		
		
	}

}
