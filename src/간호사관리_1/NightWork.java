package 간호사관리_1;

import java.util.Scanner;

public class NightWork extends Nurse {
	
public void getUserInput(Scanner input) {
		
		System.out.print("직원 ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("직원 이름 : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Email 주소  : ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("전화번호 : ");
		String phone = input.next();
		this.setPhone(phone);
		
		char answer = 'x';
		while(answer !='d' && answer !='D' && answer !='e'&& answer !='E')
		{
		System.out.print("선호하는 근무는?  (Day/Evening)");
		answer = input.next().charAt(0);
		
		if(answer =='d' || answer == 'D') {
			System.out.print("이유는 ? : ");
			String reason = input.next();
			this.setreason(reason);
			break;
		}
		
		else if (answer =='e' || answer == 'E') {
			System.out.print("이유는 ? : ");
			String reason1 = input.next();
			this.setreason1(reason1);
			break;
		}
		
		}
	}

}
