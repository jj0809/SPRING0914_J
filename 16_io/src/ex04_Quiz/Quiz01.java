package ex04_Quiz;
//package ex03_Quiz;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//
///*문제. 파일복사
// * Cave.mp4 파일을 복사하시오
// * 1. Cave.mp4 파일에서 적당히 데이터를 읽는다.. 	FileInputStream
// * 2. 읽어둔 데이터를 Cave2.mp3 파일로 보낸다.		FileOutputStream
// */
//
public class Quiz01 {
//
	public static void main(String[] args) {
//		DataInputStream dis = null;
//		DataOutputStream dos = null;
//		try {
//			dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Cave.mp4")));
//			long start = System.nanoTime();
//			while (true) {
//				byte[] bytes = new byte[100];
//				int state = dis.read(bytes); 
//				if (state == -1 ) {
//					break;
//				}
//			}
//			long end = System.nanoTime();
//			System.out.println("파일을 읽어왔음 " + (end - start) + "초");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(dis != null) {
//					dis.close();
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		try{
//			long start = System.nanoTime();
//			dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Cave2.mp4")));
//			for(int i = 0; i < dis.read); i++) {
//				dos.write(dis[i]);
//			}
//			long end = System.nanoTime();
//			System.out.println("파일이 생성되었음 " + (end - start) + "초");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
//
}
