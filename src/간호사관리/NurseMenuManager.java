package ��ȣ�����;

import java.util.ArrayList;
import java.util.Scanner;

import ��ȣ�����_1.NightWork;
import ��ȣ�����_1.Nurse;

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
			System.out.println("1.Night �ٹ��� ������ ��ȣ�� ");
			System.out.print("2.Night �ٹ��� �Ұ����� ��ȣ��");
			
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
				System.out.print("���û����� ������ϴ�.");
			}
		}
	}
	public void Deletenurse() {
		System.out.print(" ���� ID : ");
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
			System.out.println("��ȣ���� "+ nurseId +" �����Ǿ����ϴ�.");
		}
	}
	public void Editnurse() {
		System.out.print(" ���� ID : ");
		int nurseId = input.nextInt();
		for	(int i = 0; i<nurses.size();i++) {
			Nurse nurse = nurses.get(i);
		if(nurse.getId() == nurseId) {
			int num = -1;
			while (num !=5){
				System.out.println("<���� ���� �޴�>");
				System.out.println("1. ID ����");
				System.out.println("2. �̸� ����");
				System.out.println("3. Emaile ����");
				System.out.println("4. ��ȭ��ȣ ����");
				System.out.println("5. ������");
				num = input.nextInt();
				
				if (num == 1) {
					System.out.print(" ���� ID : ");
					int id = input.nextInt();
					nurse.setId(id);
		
					
				}
				else if (num == 2) {
					System.out.print("���� �̸� : ");
					String name = input.next();
					nurse.setName(name);
					
				}
				else if (num == 3) {
					System.out.print("Email �ּ� : ");
					String email = input.next();
					nurse.setEmail(email);
				}
				else if (num == 4) {
					System.out.print("��ȭ��ȣ  : ");
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

		System.out.println("��ϵ� ��ȣ ���� ���ο��� :"+ nurses.size());
		for	(int i = 0; i<nurses.size();i++) {
			nurses.get(i).printInfo();
		}	
	}
	
}

