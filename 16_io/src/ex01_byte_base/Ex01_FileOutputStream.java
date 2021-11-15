package ex01_byte_base;

import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream 클래스 (fos)
 * - byte기반 파일 출력 스트림을 생성하는 클래스
 * 		1)byte기반: 출력 단위가 byte이다 (byte: bit가 모여서 만들어지는 단위), 
 * 					텍스트 파일의 경우 깨질 가능성 있음(특히 한글 등) ->char base 사용
 * 		2)파일 출력 스트림: 파일을 생성할 수 있는 스트림
 * 
 * 스트림: 데이터가 지나다니는 통로 
 * 			   ┌fos
 * first.txt <------ 소스코드(*.java): 데이터 보내기
 * 
 * 
 * - 출력 메소드: write() 메소드
 * - 반드시 예외처리 필요 (try - catch)
 * 
 * (텍스트)파일에 소스코드를 보낼 때 fos 사용, write() 메소드 써서 보냄! 
 */
public class Ex01_FileOutputStream {

	public static void main(String[] args) {
		//자바로 파일 만들기
		
		//FileOutputStream 객체 선언
		FileOutputStream fos = null; //java.io 패키지. main메소드에서 선언되었으므로 변수, 초기화안하면 쓰레기값.
		
		//객체 생성(new)은 try 내부에서 처리한다 : 예외처리한다.
		try { //대부분의 소스코드 작업
			//first.txt를 만들 수 있는 fos 객체.
			fos = new FileOutputStream("first.txt");
			//first.txt 파일에 보낼 데이터
			int ch1 = 'A'; //영어는 1바이트
			int ch2 = 'Z';
			/* int 타입 4바이트: 한ㄱ
			 * char은 2바이트로 int타입에 char 저장할 수 있음
			 * 문자가 아스키코드로 저장되어 정수의 형태로 int에 저장됨
			 */
			//first.txt 파일에 데이터를 보내기(출력)
			//1) write(int)
			fos.write(ch1);
			fos.write(ch2); 			//현재 AZ 까지 작업됨
			fos.write('\n'); //줄바꿈 \n
			
			String str1 = "Hello";
			String str2 = "Nice to meet you";
			
			//2) write(byte[]
			//String 타입 데이터를 byte 배열로 바꾼 뒤 보냄: getBytes() 메소드 사용
			fos.write(str1.getBytes());
			fos.write('\n');
			fos.write(str2.getBytes());
			
			//메시지 - 위에 전부 성공하면 메시지 출력 가능, 중간에 실패하면 catch로 넘어가므로 실행안됨
			System.out.println("first.txt 파일에 데이터가 기록되었습니다.");
			
		}catch (IOException e) { //exception. 문제가 발생했을 때에만 작동하는 영역
			System.out.println("first.txt 파일에 데이터가 기록되지 않았습니다.");
		}finally { //결과 상관 없이 항상 실행되는 영역
			//생성된 모든 파일 스트림에 대한 작업
			//FileOuputStream 객체 fos는 반드시 close 처리해야함
			//close() 메소드를 호출하려면 별도의 예외처리가 필요함
			
			try {
				if (fos != null) {
				fos.close();
				}
			}catch (Exception e){
				e.printStackTrace();
			}
			
		}

	}

}
