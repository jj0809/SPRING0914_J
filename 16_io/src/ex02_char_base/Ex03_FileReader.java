package ex02_char_base;

import java.io.FileReader;

/* FileReader 클래스
 * : 문자 기반의 파일 입력 스트림을 생성하는 클래스
 * - 입력 메소드: read() 메소드
 * 
 * - 문자기반의 스트림이기 때문에 바이트배열대신 캐릭터배열, 스트링으로 처리하면됨..
 * 
 * 항상 입출력의 기본 단위는 int임..ㅎ
 */
public class Ex03_FileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("text1.txt"); //안녕하세요 반갑습니다 들어있는 파일
			
			//1. 한 글자씩 읽기 - int 사용. char 사용 불가
			int ch = 0; 
			while ( (ch = fr.read()) != -1 ) { //ch에는 fr로 읽은 글자나 -1 둘 중 하나가 들어감
				//while문.. 조건에 해당하면 계속 반복함
				System.out.print((char)ch); //하나도 안깨지고 잘 나타남(char기반이니까)
			}
			//2. 여러 글자 읽기 - char[] 사용 -> 여기서 못함, Ex04로 이동
//			while (true) {
//				char[] cbuf = new char[2]; //한 번에 2글자씩
//				int state = 0;
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
