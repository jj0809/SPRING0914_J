package ex01_byte_base;

import java.io.FileInputStream;

public class Ex04_FileInputStream {

	public static void main(String[] args) {
	//read() 메소드에 매개변수가 없는 타입 만들어 first.txt 파일 읽기
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("first.txt");
			//read() 메소드는 int(4바이트)만큼 읽어들인다.
			// ㄴ : 파일이 종료되면 -1을 반환함..
			StringBuffer sb = new StringBuffer(); //data를 저장하기 위함.
			while (true) {
				int data = fis.read();
				
				if(data == -1) {
					break; //라인 14..
				}
				sb.append((char)data); //append로 int 넣어주기 ... casting해서 넣어주기
			}
			System.out.println(sb.toString()); //캐스팅 안하면 숫자로만 주루룩 나옴 아스키코드..
				
		} catch ( Exception e) {
			e.printStackTrace();
		}finally {
			try {

			}catch (Exception e) {
				e.printStackTrace(); 
			}
		}
		
		
	}

}
