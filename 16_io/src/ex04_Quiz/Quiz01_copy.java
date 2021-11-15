package ex04_Quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*문제. 파일복사
 * Cave.mp4 파일을 복사하시오
 * 1. Cave.mp4 파일에서 적당히 데이터를 읽는다.. 	FileInputStream
 * 2. 읽어둔 데이터를 Cave2.mp3 파일로 보낸다.		FileOutputStream
 */
public class Quiz01_copy {

	public static void main(String[] args) {
		BufferedInputStream bis = null; //cave2.mp4 파일 읽기
		BufferedOutputStream bos = null; //cave.mp4 파일 만들기
		try {
			bis = new BufferedInputStream(new FileInputStream("Cave.mp4"));
			bos = new BufferedOutputStream(new FileOutputStream("Cave2.mp4"));
			
			//int 단위로 읽고 쓰기
//	읽기		int data = bis.read(); 
//	쓰기		bos.write(data); 
			//byte[]단위
// 			byte[] bytes = new byte[1024]; //1024바이트: 1KB
//	읽기		bis.read(bytes);
//	쓰기		bos.write(bytes);
			//여러 번 해야하므로 다 반복문 필요함 : 반복문의 기준은 bis이다.
			long start = System.currentTimeMillis(); //나노초만큼 빠르진 않으므로 밀리초로 만듬
			while(true) {
				byte[] bytes = new byte[1024]; //1바이트씩 복사하면 소요시간 더 오래걸림
				int state = bis.read(bytes); //cave.mp4 읽기
			//	bos.write(bytes); 여기잇으면 state가 -1이어도 저장이 된 다음에 멈춰서 안되는듯
				if(state == -1) {
					break;
				}
				bos.write(bytes); //cave2.mp4 만들기(쓰기)
			}
			long end = System.currentTimeMillis();
			double copyTime = (end - start)/ 1000.0;
			System.out.println("파일 복사 완료. 소요 시간: "+ copyTime + "초");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bos!=null) {bos.close();}
				if(bis !=null) {bis.close();} //꼭 둘 다 닫아줄 것
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
