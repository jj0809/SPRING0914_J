package ex01_byte_base;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex06_BufferedInputStream {

	public static void main(String[] args) {
		//BufferedInputScream
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("second.txt")); //파일명 대소문자 구분X
			StringBuffer sb = new StringBuffer();
			
			while(true) {
				byte[] bytes = new byte[10]; //바이트 배열에는 어디부터 어디까지가 한 글자인지 알 수 없음..
				int state = bis.read(bytes); //그냥 10바이트 씩 문자로 바꾸는거라 결과가 이상할 수 있음..
				if (state == -1 ) {
					break;
				}
				sb.append(new String(bytes));
			}
			System.out.println(sb.toString());
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try{
				if(bis != null) {
				}
				bis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//결과가 이상하게 나오지만 이건 char base에서 해결할 수 있다.. 너무 신경쓰지 말아라..
	}

}
