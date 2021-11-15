package ex01_Network;

import java.net.URL;

//URL: uniform resoruce locator: 인터넷 주소

public class Ex02_URL {

	public static void main(String[] args) {
		String host = "http://www.naver.com/abc.txt";
				//http <- 프로토콜 	abc.txt:임의의 파일
		URL url = null; //역시나 try catch 사용
		
		try {
			url = new URL(host);
			System.out.println(url.getDefaultPort());
						//defaultport 접속할 때 약속된 port 번호가 무엇인가..
						//http의 defaultport 번호: 80
			System.out.println(url.getPath()); 
			System.out.println(url.getFile());
			System.out.println(url.getProtocol()); //http
			System.out.println(url.getHost());
		} catch (Exception e) {
			
			
		}
		
	}

}
