package ex02_char_base;

import java.io.PrintWriter;

/* PrintWriter
 * : print() 메소드를 쓸 수 있는 writer
 * : 문자 기반의 파일 출력 스트림을 생성하는 클래스
 * - 출력메소드
 *   1) write() 메소드
 *   2) print() 메소드
 *   3) println() 메소드
 *   
 *   문자, 문자열을 다루다보니 print 기능이 가능하게 만들은 듯..
 */
public class Ex02_PrintWriter {

	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			out = new PrintWriter("webpage.html");
			//out은 write, print, println을 지원함
			out.write("<html>");
			out.write('\n');
			
			out.print("안녕");
			out.print('\n');
			
			out.println("</html>"); //출력+줄바꿈
			
			System.out.println("webpage.html 파일이 생성되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
