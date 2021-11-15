package ex03_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
		/*
		 * 4. 관계 연산자
		 *    1) > : 초과
		 *    2) >=: 이상
		 *    3) < : 미만
		 *    4) <=: 이하
		 *    5) !=: 같지 않다
		 *    6) ==: 같다 (primitive type, 기본 자료형)
		 *       equals: 같다 (reference type, 참조 자료형의 내용 비교)
		 *       !equals: 같지 않다
		 *    7) 연산 결과: true 또는 false
		 * 
		 * 5. 논리 연산자
		 *    1) && : 모든 조건식의 결과가 true 이면 true, 아니면 false 반환 (and)
		 *    2) || : 조건식의 결과가 하나라도 true이면 true, 아니면 false (or)
		 *    3) ! : 조건식의 결과를 무조건 반대로 변경 (not)
		 *       느낌표는 잘 보이지 않아서 지양하는 경우가 종종 있음
		 *    4) short circuit evaluation 지원
		 *       (1) && : 조건식의 결과에서 false가 나타나면 더 이상 진행하지 않음
		 *          	  어차피 결과가 false이기 때문
		 *       (2) || : 조건식의 결과에서 true가 나타나면 더 이상 진행하지 않음
		 *       		  어차피 결과가 true이기 때문
		 * 
		 * 6. 조건 연산자
		 *    1) 조건식의 결과가 true일 때와 false일 때 모두 한 번에 처리하는 연산자
		 *    2) 조건식 ? true일 때 실행문 : false일 때 실행문 
		 *    3) 항이 3개 필요하기 떄문에 삼항 연산자라고도 부름
		 *    4) 조건문인 if - else문의 대신 널리 사용됨
		 * 
		 * 
		 */

		int a = 10;
		int b = 11;
		
		System.out.println(a>b); //false
		System.out.println(a>=b); //false
		System.out.println(a<b); //true		
		System.out.println(a<=b); //true
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		String str1 = new String("Hello"); 
		//str1에는 Hello가 있지 않고 Hello가 저장된 새(new) 스트링의 주소가 저장되어 있음
		String str2 = new String("Hello"); 
		//str1에서 만든 Hello와 다른 위치에 새로 만든 Hello의 주소
		
		//str1과 str2는 다르다
		System.out.println(str1 == str2); //false 두 Hello가 저장된 위치 비교, 거의 안씀
		System.out.println(str1.equals(str2)); //true, 두 Hello의 내용 비교
		
		int c = 10;
		int d = 11;
		
		boolean r1 = c > d && c == 10; //false
		boolean r2 = c > d || c == 10; //true
		boolean r3 = !r1; //true
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		String str3 = "Hello"; //문자열은 new를 사용하지 않아도 가능하다
		String str4 = "Hello";
		boolean r4 = !str3.equals(str4); //str3과 str4가 다른지 물어봄(앞에 느낌표), false 정답
		System.out.println(r4);
		
		//Short circuit Evaluation
		int x = 10;
		int y = 10;
		boolean r5 = x > 10 && y++ > 10; //false
		System.out.println(r5); 
		System.out.println(y); 
		//10, x>10 && 의 결과 false이므로 그 뒤에 코드는 실행하지 않았음(쳐다보지두안해), y 증가 안함
		
		
		int score = 50; //80점 이상은 "합격", 80 미만은 "불합격"
		String pass = score >= 80 ? "합격" : "불합격";
		System.out.println(pass);
		
		
		
		
		
		// 문제1. 국어와 영어 점수 모두 80점 이상이고, 평균이 85점 이상이면 true 아니면 false를 출력하시오
		int kor = 80;
		int eng = 90;
		boolean result1 = kor >= 80 && eng >= 80 && (kor+eng)/2 >= 85 ; 
		// 앞 조건이 false일경우 평균을 안 구해도 되니까 효율적임
		boolean result2 = (kor+eng)/2 >= 85 && kor >= 80 && eng >= 80 ; 
		//비효울적임, 연산이 cost를 더 잡아먹으니 뒤로 뺄 것
		// 우선순위 따져서 순서 짜기 / 리팩토링(순서를 따져 다시짜는것)
		System.out.println(result1);
		System.out.println(result2);
		
		
		// 문제2. 나이가 20살 이상이면 요금 5000원, 20살 미만이면 요금 2500원을 출력하시오
		int age = 13;
		int fee = age >= 20 ? 5000 : 2500 ;
		System.out.println("요금 " + fee + "원");
		
		// 문제3. 아이디가 "admin" 이면 "관리자", 'admin"이 아니면 "일반 유저"를 출력하시오
		String id = "admin";// ★string은 equals로 비교★
		System.out.println(id.equals("admin") ? "관리자" : "일반 유저"); //세상에.. ★★★
		String idd = id == "admin" ? "관리자" : "일반 유저"; // 했는데 나왔단말야..... 뭐냐고요오..
		System.out.println(idd); //"admin" 을 직접 입력해서 그런거같은데..
		
		// 문제4. 2자리 정수(10 ~ 99) 중 하나를 선언하고, 
		// 그 수가 '카프리카수' 인지 판단하여 맞으면 "맞다" 아니면 "아니다" 출력
		//45, 55, 99
		// 45 -> 45 * 45 -> 2025 -> 20 + 25 = 45
		int k = 47;
		int ka = (k*k)/100 + (k*k)%100;
		System.out.println(k == ka ? "맞다" : "아니다"); 
		//String kd = k== 45 | k == 55 | k == 99 ? "맞다" : "아니다"; // 앞사람 코드
		//System.out.println(kd);
		/*
		 * 샘코드
		 * boolean isKaprekar = ka == k;
		 * syso( k + isKaprekar ? "는 카프리카수이다" : "는 카프리카수가 아니다");
		 * 
		 */
	}

}
