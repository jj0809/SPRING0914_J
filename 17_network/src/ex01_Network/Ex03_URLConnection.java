package ex01_Network;

import java.net.URL;
import java.net.URLConnection;

public class Ex03_URLConnection {

	public static void main(String[] args) {

		String host = "http://springlec.cafe24.com/lecture/notice.txt";
		URL url = null;
		URLConnection conn = null;
		
		try {
			url = new URL(host);
			conn = url.openConnection();
		//네트워크 용어 공부...~.~ 
			System.out.println(conn.getContentType());
			//내가 네트워크로 처리하려는 컨텐츠의 타입이 무엇인지?
				//Content Type: text, xml, json... 어떤 내용물을 가진 타입인가..
				//text/plain, text/html, application/json...
			//결과: text/html;charset=utf-8 		utf-8: 인코딩 타입 	charset: 문자 세팅..
			System.out.println(conn.getLastModified()); //최종 수정이 언제인지?
			System.out.println(conn.getURL());
		
		} catch (Exception e) {

		
		}
	}

}
