package 간호사관리;

import java.util.ArrayList;
import java.util.Scanner;

import 간호사관리_1.NightWork;
import 간호사관리_1.Nurse;

public class NurseMenuManager {
	ArrayList<Nurse> nurses = new ArrayList<Nurse>();
	Scanner input;
	NurseMenuManager(Scanner input){
		this.input = input;
	}
	 
	public  void addnurse() {
		int kind = 0;
		while (kind !=1 && kind !=2) {
			Nurse nurse;
			System.out.println("1.Night 근무가 가능한 간호사 ");
			System.out.print("2.Night 근무가 불가능한 간호사");
			
			kind = input.nextInt();
			if(kind == 1) { 
				nurse = new Nurse();
				nurse.getUserInput(input);
				nurses.add(nurse);
				break;

			}
			else if (kind == 2) {
				nurse = new NightWork();
				nurse.getUserInput(input);
				nurses.add(nurse);
				break;

			}
			else {
				System.out.print("선택사항을 벋어났습니다.");
			}
		}
	}
	public void Deletenurse() {
		System.out.print(" 직원 ID : ");
		int nurseId = input.nextInt();
		int index = -1 ;
		for	(int i = 0; i<nurses.size();i++) {
			if(nurses.get(i).getId() == nurseId) 
			{
				index = i;
				break;
			}
		}
		if (index >= 0) {
			nurses.remove(index);
			System.out.println("간호직원 "+ nurseId +" 삭제되었습니다.");
		}
	}
	public void Editnurse() {
		System.out.print(" 직원 ID : ");
		int nurseId = input.nextInt();
		for	(int i = 0; i<nurses.size();i++) {
			Nurse nurse = nurses.get(i);
		if(nurse.getId() == nurseId) {
			int num = -1;
			while (num !=5){
				System.out.println("<직원 수정 메뉴>");
				System.out.println("1. ID 수정");
				System.out.println("2. 이름 수정");
				System.out.println("3. Emaile 수정");
				System.out.println("4. 전화번호 수정");
				System.out.println("5. 나가기");
				num = input.nextInt();
				
				if (num == 1) {
					System.out.print(" 직원 ID : ");
					int id = input.nextInt();
					nurse.setId(id);
		
					
				}
				else if (num == 2) {
					System.out.print("직원 이름 : ");
					String name = input.next();
					nurse.setName(name);
					
				}
				else if (num == 3) {
					System.out.print("Email 주소 : ");
					String email = input.next();
					nurse.setEmail(email);
				}
				else if (num == 4) {
					System.out.print("전화번호  : ");
					String phone = input.next();
					nurse.setPhone(phone);
				}
				else {
					continue;
				}
			}
			break; 
			}
		}
	}
	public void Viewnurse() {

		System.out.println("등록된 간호 직원 총인원은 :"+ nurses.size());
		for	(int i = 0; i<nurses.size();i++) {
			nurses.get(i).printInfo();
		}	
	}
	
}

