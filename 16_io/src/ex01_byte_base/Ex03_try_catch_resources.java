package ex01_byte_base;

import java.io.FileInputStream;

/* try-catch-resources
 * : 자원을 사용할 때 생성과 소멸을 함께 처리할 수 있는 구문
 * 자원 사용시 close() 메소드가 필요한데 이를 자동으로 호출하는 try문
 * finally 영역을 작성할 필요가 없어짐ㅎㅎ
 * - 형식
 * try (스트림 생성){ }catch( ){ }
 * 		 ㄴ괄호 안 : resource / (',' 로  스트림 여러 개 사용 가능)
 * 
 * close 안써두 된다~! 근데 실무에서는 많이 안씀.. 명시해서 닫는 것을 사람들은 좋아한다...
 */

public class Ex03_try_catch_resources {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("first.txt")){
			StringBuffer sb = new StringBuffer();
			while(true) {
				byte[] bytes = new byte[10];
				int state = fis.read(bytes);
				if (state == -1) {
					break;
				}
				sb.append(new String(bytes));
			}
			System.out.println(sb.toString()); //결과 출력
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
