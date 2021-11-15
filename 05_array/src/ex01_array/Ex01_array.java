package ex01_array;

public class Ex01_array {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		/*TODO는 내가 나중에 해야할 일을 보통 적음... 나중에 ctrl + f 로 검색함
		 *NOTE라고 하거나... FIX라고 하거나... 본인 마음대로 하면 됨
		 * 
		 * 배열(Array)
		 * 
		 * 1. 변수가 여러 개 필요할 때 배열을 대신 사용할 수 있음 - 변수 여러 개를 한 번에 만듬
		 * 2. 선언 방법
		 *    1) int[] a = new int[5]; //int 타입 변수 5개를 만들고 그 배열의 이름은 a라고 한다
		 *    2) int a[] = new int[5]; //지금은 안 쓰는 방법. 추천하지 않음
		 *    3) int[] a;
		 *       a = new int[5];
		 * 3. 초기화 방법
		 *    1) int[] a = {10, 20, 30, 40, 50}; //정해진 값이 있으면 이 방법이 최고
		 *    2) int[] a = new int[]{10, 20, 30, 40, 50}; //추천하지 않음
		 *    3) int[] a; //이미 초기화는 물건너갔음...
		 *       a = {10, 20, 30, 40, 50}; //당연히 안 되는 코드 
		 *       {중괄호} 를 이용해서 값을 입력하는 것은 초기화할 때에만 가능하다...
		 *       초기화: 선언과 값이 함께 있는 것
		 * 4. int[] a = new int[5];
		 *    a[0] == 0 //대괄호 안 숫자: 인덱스
		 *    a[1] == 0
		 *    a[2] == 0
		 *    a[3] == 0
		 *    a[4] == 0 - 의 5개 변수 생성
		 *    각 변수들은 모두 자동으로 '0'으로 초기화가 된다.
		 * 5. 인덱스
		 *    1) 배열의 각 변수(=요소, element)를 구분하는 번호
		 *    2) 인덱스는 0부터 시작함 a[0] 의 0 ^^;
		 *    3) 사용할 수 없는 인덱스를 사용하면 'ArrayIndexOutOfBoundsException' 예외 발생
		 *       Exception: 개발자가 처리해야 하는 모든 예외
		 *        int[] a = new int[5];
		 *        a[5] -> 예외. a[0] ~ a[4] 까지밖에 없음
		 * 6. 길이
		 *    1) 배열의 전체 요소 개수를 의미
		 *    2) length라는 필드 값을 사용함
		 *   
		 */

		//선언
		int[] a = new int[5];
		//모든 요소가 자동으로 0으로 초기화
		
		//확인 - 전부 0 나옴
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//배열의 길이가 길 경우 확인할 때 반복문을 통해서 확인하면 간단하다.
		
		//인덱스: 0부터 배열의 길이 바로 전까지 (0 <= 인덱스 < 길이)
//		for (int n = 0; n < 5; n++) { // n <= 4 로 작성하지 않음
		//선언에서 배열의 크기를 변화시키면 위 for문의 n < 5도 변경시켜야 함 - 코드의 종속
		//종속은 없으면 없을 수록 좋다. 수정이 일어나면 개발자가 일일이 수정해야하기 때문
		//인덱스 호출
		for (int n = 0; n < a.length; n++) {
			System.out.println("인덱스: " + n);
		} //얼마든지 배열의 크기를 변경해도 for문을 새로 수정할 필요 없음
			
		//요소: 배열이름[인덱스] 로 표현
		for (int i = 0; i < a.length; i++ ) {
			System.out.println("배열 요소: " + a[i]);
		} //배열의 내용 확인하기 - 위의 확인 코드와 동일함
	
		//벗어난 인덱스
//		System.out.println(a[5]); //예외는 개발자가 수정할 수 있는 수준의 오류를 말함
		
		
	}

}
