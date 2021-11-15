package ex01_Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//openStream 메소드~

public class Ex04_openStream {

	public static void main(String[] args) {
		//파일이 안된대요... 
//		String host = "http://springlec.cafe24.com/lecture/notice.txt";
//		String host = "http://www.naver.com"; 
		String host = "http://m.naver.com"; //이번엔 모바일 전체 출력 해보자
		URL url = null;
		
		//char 기반은 reader나 writer가 들어간다.... 
		//이거 지금 charset 이라서... 이얘기가 나오는건가요?? ㅎㅎ...
		
		BufferedReader br = null;
		String line = "";
		StringBuffer sb = new StringBuffer(); //line 누적할 버퍼
		try {
			url = new URL(host);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
				//inputstream을 reader로 바꾼다..
				//byte인 url을 ISR이 char로 바꿔주고 그거를 BR이 사용한다...
			
//			String line = br.readLine(); //readLine: 한 줄 그냥 읽어오기 -> String line에 저장
			while (true) {
			line = br.readLine(); //연결된 파일에서 라인 한 줄씩 가져오기
			if (line == null) { //읽어들인 라인이 없을 경우
				break;
			}
			sb.append(line); //sb에 추가해주기
			}
//			System.out.println(line); //웹naver 했을 떄 결과: <html> 
			System.out.println(sb.toString());  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
