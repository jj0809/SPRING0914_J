package ex01_package;

public class Father {
	/*
	 * 1. private - Father 클래스 내부에서만 볼 수 있음 (아빠 방에서)
	 * 2. default - ex01_package 내부에서만 볼 수 있음, 같은 패키지 내에서 볼 수 있음 (집에서)
	 * 3. protected - ex01_package + Father의 서브 클래스 에서만 볼 수 있음 (집 + 자취하는 자식 방)
	 * 4. public - 어디서든 볼 수 있음 
	 */
	
	
	@SuppressWarnings("unused")
	private String secret = "비상금";
	String tv = "LGTV";
	protected String perID = "851212-1234567";
	public String name = "김철수";
}
