package ex02_variable;

public class Ex05_parsing {

	public static void main(String[] args) {
		//parsing: casting의 일종, 문장을 분석하는 것(문자열을 분석)
		
		/*
		 * 문자열 타입 변환은 casting이 아니라 parsing이다
		 * 
		 * 1. String -> int
		 *    String s = "100";
		 *    int a = Integer.parseInt(s); <-parsing
		 *    
		 * 2. String -> double
		 *    String s = "1.5";
		 *    double a = Double.parseDouble(s);
		 *    
		 * 3. String -> boolean
		 *    String s = "true";
		 *    boolean a = Boolean.parseBoolean(s);
		 *------------------------------------------    
		 * 4. int -> String
		 *    int a = 100;
		 *    String s = String.valueOf(a); //a의 값을 String으로
		 *    
		 * 5. double -> String
		 *    double a = 1.5;
		 *    String s = String.valueOf(a);
		 *    
		 * 6. boolean -> String
		 *    boolean a = true;
		 *    String s = String.valueOf(a);
		 *    
		 * 4 - 6번: 어떤 타입 a -> String
		 *    1) String s = String.valueOf(a);
		 *    2) String s = a + "문자~";
		 *  
		 *      
		 *      1+1 = 2, 1.5+1.5=3.0, "1"+"2" = 12, "1"+2=>"1"+"2"=12
		 */

		
		String strAge="25";
		String strHeight="175.5";
		
		int age = Integer.parseInt(strAge); //숫자 25 등장
		double height = Double.parseDouble(strHeight);
		System.out.println("나이는 " + age + "살입니다"); //age가 String으로 변환??
		System.out.println("키는 " + height + "cm입니다");
	}

}
	