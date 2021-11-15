package ex03_File;

import java.io.File;

public class Ex01_File {

	public static void main(String[] args) {
		
		/* File 클래스
		 * 기능: 파일 생성, 삭제, 경로 확인, 존재 확인, 이름 확인 등 
		 * 
		 * 파일 스트림을 가지고 하던 작업에 플러스 알파적인 요소...
		 * File file과 String name 형태의 FileOutputStream을 사용할 수 있다..
		 */
		
		//1. 선언만 한다. (생성: 예외처리 필요)
		File file = null;
		
		//2. 생성 (예외처리: try-catch)
		try {
//			file = new File("myFile.txt"); //어떤 파일을 만들지 지정  //프로젝트 폴더에 생성됨(기본 경로)
/*경로설정*///file = new File("D:\\spring0914\\javastudy\\workspace\\16_io\\myFile2.txt");
			// \\를 File.seperator로 변경하면 리눅스 등 다른 OS에서도 문제없이 사용할 수 있다..
/*경로지정2*/	file = new File("D:" + File.separator + "spring0914" + File.separator + "javastudy"
					+ File.separator + "workspace" + File.separator + 
					"16_io" + File.separator + "myFile3.txt");
			file.createNewFile(); //생성가능
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//file 클래스의 메소드
		System.out.println("파일명: " + file.getName() );
		System.out.println("디렉토리: " + file.getParent());//디렉토리: 파일이 저장된 폴더
		System.out.println("파일경로: " + file.getPath());
		System.out.println("존재유무: " + file.exists()); //true/false 결과
		
		//삭제 - if 문으로 지우는 것이 좋다!
		if (file.exists()) {
			file.delete();
		}
		
	}//main

}
