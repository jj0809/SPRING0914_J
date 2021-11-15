package ex01_branch;

public class Ex05_switch {

	public static void main(String[] args) {

		/*
		 * switch의 장점,, 역할,, 
		 */
		
		int cmd = (int)(Math.random()*5)+1; //math.random() * 5 : 1~5 사이 랜덤 cmd 생성
		switch (cmd) {
		case 1: System.out.println("삽입"); break;
		case 2: System.out.println("수정"); break;
		case 3: System.out.println("검색"); break;
		case 4: System.out.println("삭제"); break;
		case 5: System.out.println("종료"); 
		
		//어떤 명령에 의해 처리하고자 하는 동작이 달라질 떄.. switch는 선택지로 생각하면 편할듯
		
		//controller 역할을 한다...
		
		}
	}

}
