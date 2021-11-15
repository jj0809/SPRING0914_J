package ex01_byte_base;

/* BufferedOutputStream 클래스
 * : FileOuputStream 클래스에 부착하는 보조스트림
 * 
 * - Buffer(임시 기억장소, 모아서 한번에 입출력) 를 추가하여 속도가 빠르다.
 *   : 항상 버퍼를 쓰면 성능이 좋아진다.
 * - BufferedOutputStream 객체만 close()처리하면 메인도 함께 닫힘.
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex05_BufferedOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos = null; //파일 만들기
		BufferedOutputStream bos = null;
		
		try {
			//1. 메인 스트림 fos 생성
			fos = new FileOutputStream("second.txt");
			//2. 보조 스트림 bos 생성 - fos에 부착하는 형태
			bos = new BufferedOutputStream(fos); //fos에 부착
			
			//1+2.
		//	bos = new BufferedOutputStream(new FileOutputStream("second.txt")); 
			//한 번에 붙여서 처리할 수 있음, fos 생성안됨-> 나중에 bos만 close하면 됨
			
			//이 이후로는  fos 사용 안함
			
			//3. second.txt로 보낼 데이터 생성
			int ch1 = '한'; //바이트기반: 한글은 2-3바이트가 필요해서 처리가 정상적으로 안될 수 있다..
			int ch2 = '글';
			String str1 = "안녕하세요";
			String str2 = "반갑습니다";
			//4. 데이터 보내기 - bos 객체 사용
			bos.write(ch1);
			bos.write(ch2);
			bos.write('\n');
			bos.write(str1.getBytes());
			bos.write('\n');
			bos.write(str2.getBytes());
			
			System.out.println("second.txt 파일이 생성되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//fos는 close가 필요하지 않음 
				if (bos != null){
					bos.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
