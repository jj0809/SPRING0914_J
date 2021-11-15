package ex03_access_modifier;

import java.util.Date;

class User{
	//field
	private String id;
	private String pw;
	private Date date;
	
	
	//constructor
	//이클립스가 자동으로 만들어 줌
	public User(String id, String pw, Date date) {
		super(); //부모클래스 없는데? Object class의 생성자를 의미함...
		//지워도 상관없음!
		this.id = id;
		this.pw = pw;
		this.date = date;
	}
	//하는일 없는 생성자는 내가 만들어야한다... ctrl+space로 더 빠르게 만들 수 있음.
	public User() { }
	
	//setters and getters
	//이클립스가 자동으로 만들어 줌 	//메뉴 -  Source 에 있음!
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
}
public class Ex04_User {

	public static void main(String[] args) {

	}

}
