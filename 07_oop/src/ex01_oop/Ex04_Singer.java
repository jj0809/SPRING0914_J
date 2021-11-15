package ex01_oop;

class Song{
	
	//field
	String title;
	String genre;
	double playTime;
	//constructor //Song song = new Song("dynamite", "dance", 4.5);
	Song(String title, String genre, double playTime){
		this.title  = title;
		this.genre = genre;
		this.playTime = playTime;
		
	}
	//method
	void info() {
		System.out.print("제목: " + title);
		System.out.print(" 장르: " +  genre);
		System.out.println(" 재생 시간: " + playTime);
	}
	
	
}//song

class Singer{
	//field
	String name;
	Song song;
	//constructor
	Singer(String name, Song song){
		this.name = name;
		this.song = song;
	}
	Singer(String name, String title, String genre, double playTime){
		this.name = name;
		this.song = new Song(title, genre, playTime);
	}
	//method
	void info() {
		System.out.println("가수: " + name);
		System.out.print("대표 곡 - ");
		song.info();
	}
	
}




public class Ex04_Singer {

	public static void main(String[] args) {
		Singer singer1 = new Singer("아델", new Song("Hello", "balad", 4.5));
		
		Song song = new Song("dynamite", "dance", 4.5);
		Singer singer2 = new Singer("BTS", song);
		
		Singer singer3 = new Singer("싹쓰리", "다시 여기 바닷가", "dance", 4.0);
		
		singer1.info(); //이름, 제목, 장르, 재생시간
		singer2.info();
		singer3.info();
		
	}//main

}
