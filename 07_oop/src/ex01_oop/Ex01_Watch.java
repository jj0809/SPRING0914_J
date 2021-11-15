package ex01_oop;

class Watch{
	
	int hour;	//0 ~ 23 : 0 1 2 3....22 23 0 1 2 3... 
	int minute;	//0 ~ 59
	int second;	//0 ~ 59
	
	Watch(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	void addMinute(int add) {
	//	hour += add / 60;
		minute += add;
		addHour(minute / 60);
		minute %= 60;
		if (add < 0) { 
			return; 
		}
	}
	void addHour(int add) {
		hour += add;
		hour %= 24; //24시간일 경우 0이 나와야하니까.. 24로 나눈 나머지를 취함
		if (add < 0) { //-값이 들어올 경우 무시하는 코드
			return; //void에서 return;은 메소드의 종료 의미 "무시하겠다"
		}
	}
	void addSecond(int add) {
		if (add < 0) { 
			return; 
		}
		second += add;
		addMinute((second % 3600) / 60); //addMinute 에서 넘치면 addHour로 넘어가므로 addHour는 필요 없음
		second %= 60;
	}
	void see() {
		System.out.println(hour + "시간 " + minute + "분 " + second+ "초");
	}
	
}

public class Ex01_Watch {

	public static void main(String[] args) {
		Watch watch = new Watch(16, 15, 30);
		
		watch.addHour(25); //watch에서 25시간 후 (1시간): 17, 15, 30
		watch.addMinute(61); //61분 후 (1시간 1분 후): 18, 16, 30
		watch.addSecond(3661); //1시간 1분 1초: 19, 17, 31

		watch.see();// 19시 17분 31초
	}

}
