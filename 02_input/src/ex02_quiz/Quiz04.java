package ex02_quiz;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Quiz04 {

	public static void main(String[] args) {
		// 문제. 매출액(정수)과 등급("VIP", "일반")을 입력받아서
		// "VIP" 등급은 매출액의 20% 할인
		// "일반" 등급은 매출액의 5% 할인하여 실제 매출액을 출력하시오

		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액을 입력하시오 >>> ");
        int money = sc.nextInt(); //10000 입력 후 엔터 치면 sales는 10000 저장, 엔터는 스트림에 남아있다...
									// 10000\n으로 인식 (\n: 엔터)
        sc.nextLine(); //스트림의 엔터 제거용, 저장할 필요 없으므로 변수 생성 따로 안함 
        
		System.out.print("등급 VIP/일반 을 입력하시오 >>> ");
		String level = sc.nextLine(); //nextLine으로 만들면 스트림에 남아있는 엔터가 level로 입력됨
		
		// money에 0.8을 곱하면 더블 캐스팅 필요함
		double rmoney = level.equalsIgnoreCase("VIP") ? money*0.8 : money*0.95 ;
		//double r2money = level == "VIP" ? money*0.8 : money*0.95 ; 무조건 false
		//equlasIgnoreCase : 대소문자를 구분하지 않음
		
		//money / 100 * 80 으로 만들면 캐스팅할 필요 없지
		//소수점이 없으므로 정확한 값은 아님
		//money = level.equals("VIP") ? money / 100 * 80 : money / 100 * 95;
		
		System.out.println("실제 매출액 " + rmoney + "원"); //(int)rmoney 하면 소수점 없애고 볼 수 있음
		sc.close(); 
		/*
		
		String strmoney2 = JOptionPane.showInputDialog("매출액을 입력하시오");
		double money2 = Double.parseDouble(strmoney2);
		
		String strlevel = JOptionPane.showInputDialog("등급을 입력하시오");
		
		money2 = strlevel.equals("VIP") ? money2*0.8 : money2*0.95 ;
		JOptionPane.showMessageDialog(null, money2); // */
		
		
	}

}
