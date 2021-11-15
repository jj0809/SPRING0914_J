package ex;

import javax.swing.JOptionPane;

import dao.JobDAO;
import dto.JobDTO;

public class JobManager {
	//field
	private static JobDAO dao = new JobDAO(); 
	//DAO가 만들어졌다는 것은 Connection con이 만들어 졌다는 얘기이다..
	
	//method

	/*1. 삽입 메소드 */
	public static void insert() {
		// 1) 사용자로부터 삽입할 내용 입력받기
		String job_id = JOptionPane.showInputDialog("job_id를 입력하세요");
		String job_title = JOptionPane.showInputDialog("job_title을 입력하세요");
		int min_salary = Integer.parseInt(JOptionPane.
				showInputDialog("min_salary를 입력하세요"));
		int max_salary = Integer.parseInt(JOptionPane.
				showInputDialog("max_salary를 입력하세요"));
		// 2) 입력받은 내용을 JobDTO 객체로 만든다.
		JobDTO dto = new JobDTO(job_id, job_title, min_salary, max_salary);
		// 3) JobDAO 클래스의 insert() 메소드에 JobDTO 객체를 전달한다.
		int result = dao.insert(dto);
		JOptionPane.showMessageDialog(null, result + "개 직업이 추가되었습니다."); //성공 실패 관련없이 출력
		//DAO의 메소드를 통해서 DB로 간다.. 사용자 <-> DAO <-> DB
		
		//DTO는 DAO에서 DB로 보내는 용도로 쓰인다..???
		//DTO와 VO는 사람과 인간같은 느낌...
	}
	/*2. 업데이트 메소드 */
	public static void update() {
		//1) 갱신할 job_id, min_salary, max_salary를 입력받는다.
		String job_id = JOptionPane.showInputDialog("갱신할 JOB_ID를 입력하세요");
		int min_salary = Integer.parseInt(JOptionPane.showInputDialog("갱신할 MIN_SALARY를 입력하세요"));
		int max_salary = Integer.parseInt(JOptionPane.showInputDialog("갱신할 MAX_SALARY를 입력하세요"));
		
		//2) 입력받는 내용을 JobDTO 객체로 만든다.
		JobDTO dto = new JobDTO(job_id, null, min_salary, max_salary); //job_title이 없는 상태로 갱신됨, job_title은 원래 값 유지됨
		
		//3) JobDAO 클래스의 update() 메소드에 JobDTO 객체를 전달한다.
		int result = dao.update(dto);
		JOptionPane.showMessageDialog(null, result + "개 직업이 수정되었습니다.");
	}
	/*3. 삭제 메소드*/
	public static void delete() {
		//1) 삭제할 job_id를 입력받는다
		String job_id = JOptionPane.showInputDialog("삭제할 JOB_ID를 입력하세요");
		//2) jobDAO 클래스의 delete() 메소드에 job_id를 전달한다
		int result = dao.delete(job_id);
		
		JOptionPane.showMessageDialog(null, result + "개 직업이 삭제되었습니다.");
	}
	
	/*4. 검색 메소드 */
	public static void select() {
		
		//1) 검색할 job_id를 입력받기
		String job_id = JOptionPane.showInputDialog("검색할 JOB_ID를 입력하세요");
		
		//2) JobDAO 클래스의 select() 메소드에 job_id 전달한다
		JobDTO dto = dao.select(job_id);
		
		//3) 직업 정보를 반환받아서 출력한다.
		System.out.println(dto != null ? dto.getJob_id(): "없다");
	}
	
	
	/*5. 메인 메소드*/	
	public static void main(String[] args) {
		
		String message = "1. 삽입\n2. 갱신\n3. 삭제\n4. 검색\n5. 종료";
		while(true) {
			String choice = JOptionPane.showInputDialog(message); //입력대화상자
			//선택 결과를 choice에 저장
			switch(choice) {
			case "1" : insert(); break;
			case "2" : update(); break;
			case "3" : delete(); break;
			case "4" : select(); break;
			case "5" : JOptionPane.showMessageDialog(null, "프로그램을 종료합니다."); 
						//종료하기 1) return 2) 종료메소드.. system클래스 이용
						System.exit(0);
			default : JOptionPane.showMessageDialog(null, "잘못된 선택입니다.");
			}
		}//while
		
		//실행시키고 나면 결과가 db에 반영됨^^!!
	}//main

}
