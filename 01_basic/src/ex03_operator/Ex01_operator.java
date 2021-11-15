package ex03_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		/*
		 * 1. 산술 연산자
		 *    1) + 
		 *    2) -
		 *    3) *
		 *    4) /: 정수 - 몫, 실수 - 나누기
		 *    5) %: 정수 - 나머지
		 *    
		 * 2. 증감 연산자
		 *    1) a++ : a를 사용하고 1 증가
		 *    2) ++a : a에 1 증가하고 사용
		 *    3) a-- : a를 사용하고 1 감소
		 *    4) --a : a에 1 감소하고 사용
		 *    
		 * 3. 대입 연산자 (오른쪽 항을 왼쪽에 대입!)
		 * 	  1) = : 오른쪽 값을 왼쪽 변수에 대입
		 *    2) += : 왼쪽 변수가 오른쪽 값 만큼 증가한다 (a += 5  == a = a + 5)
		 *       왼쪽 변수에 오른쪽 값을 더한 결과를 왼쪽 변수에 대입함
		 *    3) -= : 왼쪽 변수가 오른쪽 값 만큼 감소한다
		 *    4) *=
		 *    5) /=
		 *    6) %=
		 *    
		 */
		
		int a = 7;
		int b = 2;
		
		//라인 복사: 커서를 두고 ctrl + alt + 방향키(↓)
		
		System.out.println(a + "+" + b + "=" + (a + b)); // 7 + 2 = 9
		System.out.println(a + "-" + b + "=" + (a - b)); 
		System.out.println(a + "*" + b + "=" + (a * b)); 
		System.out.println(a + "/" + b + "=" + (a / b)); 
		System.out.println(a + "%" + b + "=" + (a % b)); 
		
		int c = 10;
		int d = c++; //c를 d에 저장하고/ c에 1을 더함
		System.out.println(c); // 11
		System.out.println(d); // 10

		
		int e = 10;
		int f = ++e; // e를 1 증가시키고 e를 f에 저장
		System.out.println(e); // 11
		System.out.println(f); // 11

		
		int piggy_bank = 0;
		piggy_bank += 1000; //돼지저금통에 1000원 넣기
		piggy_bank -= 500; //돼지저금통에서 500원 빼기
		System.out.println(piggy_bank);   //변수도 ctrl + spacebar를 통해 찾을 수 있음
		
		//문제 1. 45를 1의 자리와 10의 자리로 분리해서 출력
		int n = 45;
		int units; // 1의 자리
		int tens; //10의 자리
		units = n % 10;
		tens = n / 10;
		System.out.println("일의 자리: " + units);
		System.out.println("십의 자리: " + tens);
	
		//문제 2. 1분은 60초, 1시간은 60분 = 3600초
		//3690초를 1시간  1분 30초로 변환하여 출력하시오
		int totalSecond=3690;
		int hour=totalSecond / 3600;
		int minute=(totalSecond % 3600) / 60;
		int second=(totalSecond % 3600) % 60; //totalSecond % 60과 같음

		System.out.println(hour +"시간 " + minute +"분 "+ second+"초");
		
		//문제3. 두 변수 x와 y 에 저장된 값을 서로 교환하시오
		int x = 10;
		int y = 20;
		int temp; //임시 변수
		System.out.println("x값 "+ x +", y값 "+ y);

		temp = y; //y->temp
		y=x; // x->y
		x=temp; //temp->x
		
		//라인 이동 단축키: 커서를 두고 alt+방향키(↓)
		System.out.println("x값 "+ x +", y값 "+ y);
		
		
	}

}
