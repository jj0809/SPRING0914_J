package ex01_byte_base;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;




public class Ex10_ObjectInputStream {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new BufferedInputStream(
					new FileInputStream("user.dat")));
			//user.dat  파일에 저장된 ArrayList<List> list 읽기
			List<User> list = (ArrayList<User>)ois.readObject(); //ArrayList로 캐스팅
//									ㄴ 이런 건 줄이거나 할 방법이 없다.. 노답이래;
			//list 확인하기
			for(User user : list) {
				user.info();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(ois!= null) {
				}
				ois.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
