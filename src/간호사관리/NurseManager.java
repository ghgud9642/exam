package 간호사관리;

import java.util.Scanner;

public class NurseManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		NurseMenuManager nurseManager = new NurseMenuManager(input);
		
		int num = -1;
		while (num !=5){
			System.out.println("<간호직원 관리 시스템>");
			System.out.println("1. 간호직원 추가");
			System.out.println("2. 간호직원 삭제 ");
			System.out.println("3. 간호직원 정보 수정");
			System.out.println("4. 전체 간호직원 리스트");
			System.out.println("5. 나가기");
			num = input.nextInt();
			
			if (num == 1) {
				nurseManager.addnurse();
			}
			else if (num == 2) {
				nurseManager.Deletenurse();
				
			}
			else if (num == 3) {
				nurseManager.Editnurse();
			}
			else if (num == 4) {
				nurseManager.Viewnurse();
				
			}
			else {
				continue;
			}
			
		}
	}
}
	

