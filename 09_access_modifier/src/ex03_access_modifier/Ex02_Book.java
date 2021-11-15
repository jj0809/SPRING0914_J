package ex03_access_modifier;


class Book {
	//field private
	private String title;          // null 초기화
	private String author;         //null
	private int price;    		   // 0 
	private int amount;		
	private boolean isBestSeller;
	
	
	//setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAmount(int amount) {
		this.amount = amount;
		setBestSeller(this.amount >=1000); //여기서 t/f 결정
	}
	//밖에서 불러다 쓰지 못하도록 private로 변경
	//setAmount를 호출하면 어짜피 호출되기 때문에 따로 호출할 필요가 없음
	private void setBestSeller(boolean isBestSeller) { //set필드명 작성 시 is 뺄 것, 생략..
		this.isBestSeller = isBestSeller;
	}
	
	
	//getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	 boolean isBestSeller() { //set과 다르게 get을 빼고 이름 그대로 넣음
		return isBestSeller;
	}
	
	
	
	
}
public class Ex02_Book {

	public static void main(String[] args) {
		Book javaBook = new Book();
		
		javaBook.setTitle("어린왕자");
		javaBook.setAuthor("생택쥐베리");
		javaBook.setPrice(15000);
		javaBook.setAmount(2000);
		//setBestSeller는 setAmount 내부에서 호출되어 적을 필요 없음
//		javaBook.setBestSeller(false); //이런 사태가 일어날 수 있음.. 막을 방법 필요ㅇ
		
		System.out.println(javaBook.getTitle());
		System.out.println(javaBook.getAuthor());
		System.out.println(javaBook.getPrice());
		System.out.println(javaBook.getAmount());
		System.out.println(javaBook.isBestSeller() ? "베스트셀러" : "일반도서");
		

	}

}
