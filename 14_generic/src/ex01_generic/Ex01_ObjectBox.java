package ex01_generic;

//무엇이든 담을 수 있는 ObjectBox

class ObjectBox{
	//field
	private Object obj;
	//constructor - 생성생략해도 new ObjectBox(); 형태 생성 가능
	//method
	//입출력이 가능하도록 게터세터..가져오기
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

//담을 객체 용 클래스들
class Keyboard{}
class Mouse{}




public class Ex01_ObjectBox {

	public static void main(String[] args) {
		ObjectBox box = new ObjectBox();
		
		//box에 키보드 담기
		box.setObj(new Keyboard()); 
		
		//box에 마우스 담기
		box.setObj(new Mouse()); //box에 키보드 없고 마우스 담긴 상태
		
		//box에 저장된 것 꺼내보기
		Mouse mouse = (Mouse) box.getObj(); //꺼내서 담아줄 그릇 mouse/ 정상 작업
		
		//box에 저장된 걸 다시 꺼내보자
//		Keyboard keyboard = (Keyboard) box.getObj(); //비정상
		//?? 왜 오류가 나요.. -> 현재 box 안에는 마우스가 들어있기 때문~
		//Object를 쓰게 되면 언제나 다운캐스팅을 하니까 캐스팅이 대부분 함께하는데
		//잘못된 캐스팅을 하더라도 오류가 발생하지 않음. (실행하면 오류 뜸)
		
		
	}

}































