package ex02_branch_quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		//문제. 나이가 20 이상이면 "성인"
		// 아니면 "미성년자" 출력

		
		int age = 24;
		String result = "성인";
		
		switch (age/10) { //표현식에 논리가 들어갈 수 없으므로 비교어쩌구가 안됨
		case 0 :
    	case 1 : result = "미성년자";
	    }
		//젤 처음 result를 성인으로 박아두엇기 때문에 뒤에 따로 뭐 안해도 됨... 
		// case 의 결과 0 도 1도 미성년자로 귀결되므로 코드를 더 간단하게 작성할 수 있다

		//20세 이상은 age >=20 인데, 이건 switch를 사용하는 문제가 아님.. if문제이다..
		
		//switch는 명령 처리할 때 많이 보임. 
		
		System.out.println(result);
		}

		
		
	}
	


