package ��ȣ�����;

import java.util.Scanner;

public class NurseManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		NurseMenuManager nurseManager = new NurseMenuManager(input);
		
		int num = -1;
		while (num !=5){
			System.out.println("<��ȣ���� ���� �ý���>");
			System.out.println("1. ��ȣ���� �߰�");
			System.out.println("2. ��ȣ���� ���� ");
			System.out.println("3. ��ȣ���� ���� ����");
			System.out.println("4. ��ü ��ȣ���� ����Ʈ");
			System.out.println("5. ������");
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
	

