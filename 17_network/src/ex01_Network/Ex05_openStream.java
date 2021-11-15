package ex01_Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class Ex05_openStream {

	public static void main(String[] args) {
		//서버의 파일 내 PC로 다운로드하기
		
		//모든 타입을 커버할 수 있는 byte 기반을 사용하자
		
		String host = "http://www.naver.com";
		URL url = null;
		
		BufferedInputStream bis = null; //서버의 파일을 읽는 스트림 
		BufferedOutputStream bos = null; //로컬pc에 파일을 생성하는 스트림
		
		int data = 0; //읽어서 옮기는 단위 //int: 기본단위
		try {
			url = new URL(host);
//			String fileName = url.getFile(); //파일 이름을 알아내기..(정식 아님, 유사품)
			//현재 naver.com은 파일이 없어서.. 막아둔다..웅앵
			
			bis = new BufferedInputStream(url.openStream()); //서버의 파일을 읽는 bis
			//openStream이 바이트기반이므로 char로 바꿀 필요없어서 Ex04와 달리 코드가 짧음
			
//			bos = new BufferedOutputStream(new FileOutputStream("fileName")); 
//22라인과 같은 이유로 삭제	//서버에 올라가있던 이름으로 bos/로컬 pc에 생성할 파일 이름/을 만들어라 
			bos = new BufferedOutputStream(new FileOutputStream("다운받은파일.txt")); 
				//로컬 PC에 파일을 생성하는 bos.. 작업단위 int
			while ((data = bis.read()) != -1) { //bis 값 종료되지 않았다면
				//bis.read(): int 4바이트씩 읽어옴
				//4바이트를 채웠을 경우 4바이트 들어감
				//4바이트 못읽으면 끝났다는 얘기고 -1이 들어감: 종료 조건
				bos.write(data); //서버에서 읽ㅇ느 data를 로컬 PC '다운받은 파일.txt' 로 보냄
			}
			
			System.out.println("다운로드가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//닫을 때는 생성된 순서의 반대로 닫는다.
				if(bos != null) {bos.close();} 
				if(bis != null) {bis.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
