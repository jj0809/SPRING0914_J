package ex01_Network;

import java.net.InetAddress;
import java.util.Arrays;

public class Ex01_InetAddress {

	public static void main(String[] args) {
		//원격 호스트: 멀리 있는 컴퓨터
		String host = "www.naver.com";
		
		//ipAddress 선언: InetAddress 타입의 객체
		InetAddress ipAddress = null;
		
		//네트워크 연결은 예외 발생이 무조건 있을 수 있으니까.. 
		//try- catch로 처리할 수 있게 문법 제한이 걸려있다.
		try {
			ipAddress = InetAddress.getByName(host); 
					//getbyname: host의 이름을 통해 ip 주소를 알아내겠다!
			System.out.println(ipAddress); //www.naver.com/210.89.164.90
			System.out.println(ipAddress.getHostName()); //www.naver.com
			System.out.println(ipAddress.getHostAddress()); //210.89.164.90
			
			/* ip주소: 4개짜리 byte 배열.. 
			 * byte타입.. 0~255까지 256개 (-128 ~ 127까지 숫자만 올바르게 처리할 수 있음) 2^8비트
			 * -> 128: -128로 인식/ 129: -127, 130 = -126으로 인식함
			 * 시계와 비슷한 시스템..0 ~ 127, -128 ~ 0
			 */
			
			byte[] byteIp = ipAddress.getAddress(); //바이트 주소가 나타난다.. 4개 값
						//127을 넘어가는 숫자들은 -xxx로 표기가 되어 나올 것
						//음수들은 +256을 하면 양수 Ip와 동일하게(원래값) 출력됨
			System.out.println(Arrays.toString(byteIp));
			//byte배열의 값을 String으로 바꾸기
			String realIp = "";
			for(int i = 0; i < byteIp.length ; i++) {
				realIp += (byteIp[i] < 0) ?  byteIp[i] + 256 : byteIp[i];
				if(i != byteIp.length -1) {
					realIp += "."; //220.14.35.125 의 '.' 붙이기
				}
			}
			System.out.println(realIp); //원래값과 동일하게 출력됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
