package vo;

public class JobVO {
	//클래스~
	
	//JOB 테이블의 행(row)과 1:1 매칭할 객체를 생성할 클래스
	
	//1. VO: value object
	//2. DTO: Data Transfer Object
	
	//field
	private String job_id; //JOB테이블의 JOB_ID 칼럼(절대 다른 이름 주지 마시오)
							//이유는 헷갈려서.. 같은이름으로 주는 것이 좋음
	private String job_title; //JOB테이블의 JOB_TITLE칼럼
	private int min_salary;	//JOB테이블의 MIN_SALARY칼럼
	private int max_salary;	//JOB테이블의 MAX_SALARY칼럼 
	
	//constructor
	public JobVO() {} //이걸 쓴다면 setter를 함께 써서 데이터를 입력하겠다는 의미가 된다....
	public JobVO(String job_id, String job_title, int min_salary, int max_salary) {
		super();
		this.job_id = job_id;
		this.job_title = job_title;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
	}
	//default 타입과 싹 다 받는 타입 두 가지 준비할것
	
	
	//method

	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public int getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}
	public int getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}
	//나중에 되면 constructor도 만들어주는 애가 있다~ 
	
}
