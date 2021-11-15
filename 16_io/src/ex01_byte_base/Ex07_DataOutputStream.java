package ex01_byte_base;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/* DataOutputStream 클래스
 * : 데이터 자체를 그대로 파일에 출력하는 클래스
 * - 데이터에 따라 사용하는 메소드가 다르다.
 *   writeByte, writeInt, writeLong ...
 * 
 */


public class Ex07_DataOutputStream {

	public static void main(String[] args) {
		int[] score = {50, 60, 70, 80, 90};
					//정수 자체를 파일로 옮기고 싶다.. 
		//값 그대로 파일 형성: DataOutputStream
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("score.bin"));
//			DataOutputStream도 보조적인 역할을 한다..Buffered처럼/  *.bin: binary 파일, 이진수로 저장한다
			//bin 파일은 원본 데이터를 그대로 저장하므로 실제로 20바이트의 크기를 가진다.
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			System.out.println("score.bin 파일이 생성되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos !=null) {
					dos.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
