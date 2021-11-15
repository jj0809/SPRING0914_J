package ex02_package;

import ex01_package.Father;

//Father 클래스의 서브 클래스
public class Baby extends Father {
	
	void viewFather () {
	//	System.out.println(secret); //오류.. 아빠방에서만 볼 수 있음 private
	//	System.out.println(tv); //오류.. 아빠사는 집에서만 볼 수 있음  default
		System.out.println(perID);
		System.out.println(name);
	}
	//지금 출력할 수가 없엉.. 어캐 하는겨..
}
