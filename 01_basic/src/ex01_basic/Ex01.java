// 주석: 설명, 안내를 작성 (//설명,/*설명블라블라*/)


package ex01_basic; //패키지 (폴더의 수준. 폴더와 유사: 모든 클래스의 이름 충돌을 방지하기 위해 패키지 만듬)
//최소 3수준 권장, 현재 수업의 편의상 1수준의 패키지 만듦
public class Ex01 { //클래스(소스코드명과 같음: Ex01.java)
							//소스코드: 컴퓨터 sw 및 hw를 만들 때 쓰는 설계도, 단순한 개념이 아니라
							// 당장 컴퓨터에 입력하면 프로그램 실행가능한 세밀, 구체적인 설계도
	public static void main(String[] args) { //main 메소드(JVM:java virtual machine이 실행을 위해 찾는 메소드)
									//메소드: 클래스 내부에 정의됨, 객체 지향 프로그래밍에서 객체와 관련된 함수
		//소스코드를 작성하는 장소
		
		//콘솔 출력(모니터 출력)하는 기본적인 방식
		System.out.println("Hello World"); //문장의 마지막: 세미콜론
		//System.out.println 자동완성하기
		//syso(sysout) 입력 후 ctrl+ spacebar 		
		System.out.println("Hello World");
		//이클립스가 표준격으로 쓰이는데 혁혁한 공을 세운 단축키이다~

		/*실행하기
		  실행을 위해서는 저장이 필수!
		 1. Menu - Run - Run(ctrl+f11)
		 2. Run - Run As - Java Application
		 */ 
	
	}

}
