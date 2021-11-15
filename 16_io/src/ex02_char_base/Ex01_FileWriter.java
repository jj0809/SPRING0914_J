package ex02_char_base;

import java.io.FileWriter;

//FilreWriter, FileReader: 메인 스트림
//BufferedWriter, BufferedReader: 보조스트림. 사용 방법은 byte 방식과 동일함

/* FileWriter 클래스
 * : 문자 기반의 파일 출력 스트림을 생성하는 클래스이다.
 * - byte[] 대신 char[], String을 사용한다.
 * - 출력 메소드: write() 메소드
 * - 나머지 특성은 FileOutputStream 클래스와 동일함
 */

public class Ex01_FileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("text1.txt");
					//write: string이나 char배열 보낼 수 있음
			fw.write("안녕하세요.");
			fw.write('\n'); //줄바꿈
			fw.write("반갑습니다.");
			
			System.out.println("text1.txt 파일을 생성하였습니다.");
		}catch(Exception e) { // catch도 자동완성이 됩니다.
			e.printStackTrace();
		}finally {
			try { //try - catch블록도 자동완성이 됩니다요
				if (fw!=null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
