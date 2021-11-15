package ex02_object_array;

/* 노래를 여러 곡 가진 가수 만들기 */

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
		System.out.print(" \t장르: " +  genre);
		System.out.println(" \t재생 시간: " + playTime);
	}
	
}//song

class Singer{
	///field
	String name;
	Song[] songList; //song을 배열로 만들기, 배열의 길이는 가수마다 다르므로 정해져 있지 않음
					//new song[3] <- 모든 가수의 노래가 3곡 있다는 뜻
	int i; //인덱스용 int i >>> 자동으로 초기화 0
			// : 현재 추가된 Song의 개수
	
	//constructor
	Singer(String name, int songCount){
		this.name = name;
		// songCount의 길이를 가지는 배열 songList 배열 생성
		songList = new Song[songCount]; //여기서 실제 길이를 가진 배열이 된다...
	}
	//method
	//1. song을 전달 받아 songList 배열에 저장하는 메소드 
	//1) 결과타입: void
	//2) 메소드명: addSong
	//3) 매개변수: Song song
	void addSong(Song song) {
		//1번째 호출: songList[0] = song;
		//2번째 호출: songList[1] = song;
		//3번째 호출: songList[2] = song;
	//	int i = 0; 여기 두면 호출될 때 마다 i의 값 0으로 초기화, 필드로 옮김.
		songList[i] = song;
		i++;
	}
	//2. info
	void info() {
		System.out.println("가수 이름: " + name);
		System.out.println("========대표곡 목록========");
		//일반 for문
	/*	for(int i = 0; i < songList.length; i++) {
		 //	songList[i] : 노래 하나
			songList[i].info(); //song에 있는 info!
		} */ //배열 요소에 변화가 있을 경우 일반 for문을, 아닐 경우 향상 for문을 쓰는 것이 좋다
		//향상 for문 -  변수 : 배열
		for ( Song song : songList ) {
			//song: 하나의 song
			song.info();
		}
	}
}//singer

public class Ex02_Singer {

	public static void main(String[] args) {
		
		Singer singer = new Singer("IU", 3);//IU의 노래 3곡
		//노래 3곡
		Song song1 = new Song("Love poem", "발라드", 3.45);
		Song song2 = new Song("이런 엔딩", "발라드", 3.10);
	//	Song song3 = new Song("블루밍", "댄스", 3.23);
		//노래 3곡을 Singer의 songList에 전달
		singer.addSong(song1);
		singer.addSong(song2);
	//	singer.addSong(song3);
		//노래를 만들어 바로 전달하는 방법
		singer.addSong(new Song("에잇", "댄스", 2.25));
		
		//정보 출력
		singer.info();
//		System.out.println(singer.songList.length); //songList.length와 songCount는 동일함
		
		
	
	}//main 

}
