package ��ȣ�����_1;

import java.util.Scanner;

public class NightWork extends Nurse {
	
public void getUserInput(Scanner input) {
		
		System.out.print("���� ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("���� �̸� : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Email �ּ�  : ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("��ȭ��ȣ : ");
		String phone = input.next();
		this.setPhone(phone);
		
		char answer = 'x';
		while(answer !='d' && answer !='D' && answer !='e'&& answer !='E')
		{
		System.out.print("��ȣ�ϴ� �ٹ���?  (Day/Evening)");
		answer = input.next().charAt(0);
		
		if(answer =='d' || answer == 'D') {
			System.out.print("������ ? : ");
			String reason = input.next();
			this.setreason(reason);
			break;
		}
		
		else if (answer =='e' || answer == 'E') {
			System.out.print("������ ? : ");
			String reason1 = input.next();
			this.setreason1(reason1);
			break;
		}
		
		}
	}

}
