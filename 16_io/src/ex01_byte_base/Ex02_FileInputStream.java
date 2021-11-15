package ex01_byte_base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* FileInputStream 클래스
 * - 바이트 기반 파일 입력 스트림을 생성하는 클래스
 * 				ㄴ 파일을 읽어들이는 스트림 
 * - 입력 메소드: read() 메소드
 * 
 *  * (텍스트)파일에서 내용을 읽어올 때 fis 사용, read() 메소드 써서 가져옴! 
 */
public class Ex02_FileInputStream {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("first.txt");
			//읽어들일 단위: 10byte
//			byte[] bytes = new byte[10]; //byte: 1바이트의 크기를 가진 정수형 자료형 
			
			StringBuffer sb = new StringBuffer(); //읽어들인 10바이트들을 저장할 장소
			//10바이트씩 여러번 읽어야 하므로 loop 반복문이 필요함
			while(true) {
				byte[] bytes = new byte[10]; //byte: 1바이트의 크기를 가진 정수형 자료형 
				/* 새로 생성 안하면 덮어쓰기를 하는데 
				 * 만약 공간이 남는 경우 기존의 바이트가 사라지지 않고 같이 읽혀서
				 * 이상해짐..
				 * 25바이트짜리를 10바이트씩 읽으면
				 * 10, 10, 5 + 앞에 읽어온 10의 뒷부분 5 가 읽힌다
				*/
				/* 10바이트씩 생성하여 모으는데 while 문 반복이라
				 * 반복문을 지나면 사라져버림... 저장을 해주어야 함!
				 */
				//first.txt 파일에서 10 바이트 읽어 bytes 배열에 저장
				//read 메소드 사용: fis.read(bytes);
				//read 메소드의 기본값?이 -1이 아니면 계속 읽고 -1이면 그만 읽음
				//read() 메소드는 파일이 종료되면 -1을 반환한다.
				int state = fis.read(bytes);
				if(state == -1 ) {
					break; //무한 루프 종료
				}
				//sb에 만들어진 bytes 배열 추가하기
				//sb.append에서는 bytes 배열을 바로 넣을 수 없어서 변환한 다음 넣어야 함..
				//byte[] -> String 변환해서 넣기
				sb.append(new String(bytes));
			}//while
			System.out.println(sb.toString());
		} catch(FileNotFoundException e) {
			System.out.println("first.txt 파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("first.txt 파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			}catch (Exception e) {
				e.printStackTrace(); //stack추적 결과를 출력하라, 개발자용 코드. 문제가 어디서 발생했니?
			}
		}

	}

}
