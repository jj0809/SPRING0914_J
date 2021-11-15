package ex02_inheritance_quiz;


//super
class Song{
	String title;
	String genre;
	double playTime;
	
	Song(String title, String genre, double playTime){
		this.title = title;
		this.genre = genre;
		this.playTime = playTime;
	}
	
	void info() {
		System.out.println("제목: " + title + ", 장르: " + genre + ", 재생 시간: " + playTime);
	}
}


//sub
class Singer extends Song { //singer has a song~
	String name;
	
	Singer(String name, String title, String genre, double playTime){
		super(title, genre, playTime);
		this.name = name;
	}
	
	@Override
	void info() {
		System.out.println("가수: " + name);
		System.out.println("대표곡");
		super.info();
	}
}
public class Quiz04 {

	public static void main(String[] args) {
		Singer singer1 = new Singer("아델", "Hello", "balad", 4.5);
		Singer singer2 = new Singer("싹쓰리", "다시 여기 바닷가", "dance", 4.0);
		
		singer1.info();
		singer2.info();
	}

}
