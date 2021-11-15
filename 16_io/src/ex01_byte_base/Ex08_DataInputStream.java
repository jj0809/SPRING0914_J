package ex01_byte_base;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

public class Ex08_DataInputStream {

	public static void main(String[] args) {
		DataInputStream dis = null; 
		int total = 0; //읽어들인 값의 합계
		
		try {
			dis = new DataInputStream(new FileInputStream("score.bin"));
			
			//readInt() 메소드 사용. score에 저장된 정보가 정수이므로
			//1. int타입의 값을 하나 읽음 - score에서 총 5번 읽음
			//2. 파일의 종료로 읽을 데이터가 없으면 EOFException(end of file) 예외 발생
			while(true) {
				total += dis.readInt();
				}
		}catch(EOFException e) {
			//score이 파일을 모두 읽으면 여기로 옴..
			System.out.println("전체 합 : " + total);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis != null) {
				dis.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			
			}
		}
	}

}
