package ex03_array_quiz;

public class Quiz07 { 
	public static void main(String[] args) {
		/*
		 * 문제. 윷 던지기 
		 * 실행 예)
		 * "도" 1칸 이동한다.
		 * "개" 2칸 이동한다.
		 * "걸" 3칸 이동한다.
		 * "윷", "도" 5칸 이동한다.
		 * "모", "윷", "도" 10칸 이동한다.
		 */
		
		/* 망함
		String[] y = {"도", "개", "걸", "윷", "모"};
		int a = (int)(Math.random()*5);
		int c;
		int[] x = {1, 2, 3, 4, 5};
		int total;
		total = x[a];
		
		System.out.print(y[a]);
		while (a == 3 || a == 4) {
		System.out.print(", " + y[a]);
		a = (int)(Math.random()*5);
			total += x[a];
		}
		
		System.out.println(total + "칸 이동함");
		*/
		
		String[] yut = {"", "도", "개", "걸", "윷", "모"}; 
		//0번 인덱스가 불편할 때 안쓰는 방법.... 메모리 공간을 불필요하게 쓰긴 함...
		int totalMove = 0;
		
		
		//윷이나 모가 계속 나올 경우 끝없으므로 무한 루프로 작성하고 도, 개, 걸에서 break;를 주어야 함
		while (true) {
			//던지고, (1 ~ 5 중 하나를 랜덤 생성)
			int move = (int)(Math.random()*5) + 1; //1부터 시작하기 위함
			System.out.print("\"" + yut[move] + "\"");
			totalMove += move;
			
			//도, 개, 걸 이면 보여주고 break;
			if (move <= 3) {
				System.out.print(", " + totalMove + "칸 이동");
				break;
			}
			//윷, 모 이면 while 처음부터 다시 돌리기
			else {
				
				System.out.print(", ");
			}
		}
		
		
		
		
}//end

}
