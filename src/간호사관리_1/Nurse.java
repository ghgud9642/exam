package 간호사관리_1;

import java.util.Scanner;

public class Nurse { 
	
	protected NurseSpecialist kind = NurseSpecialist.CsNurse;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;
	protected String reason;
	protected String reason1;

	
	public Nurse() {

		
	}
	public Nurse(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Nurse(String name, int id, String email, String phone, String reason ,String reason1) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.reason = reason;
		this.reason1 = reason1;
	}
	
	public NurseSpecialist getKind() {
		return kind;
	}
	public void setKind(NurseSpecialist kind) {
		this.kind = kind;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getreason() {
		return reason;
	}
	public void setreason(String reason) {
		this.reason = reason;
	}
	
	
	public String getreason1() {
		return reason1;
	}
	public void setreason1(String reason1) {
		this.reason1 = reason1;
	}
	
	
	
	public void printInfo() {
		System.out.println("이름 : "+name+ "  직원 ID :"+id+"  전화번호 :"+phone+"  Email :"+email);
		System.out.println("Day근무 선호 이유 : " +reason+ "  Evening근무 선호 이유 :" +reason1);
	}
	
	
	
	public void getUserInput(Scanner input) {
		
		System.out.print(" 간호직원 ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print(" 간호직원 이름 : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Email 주소 : ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("전화번호 : ");
		String phone = input.next();
		this.setPhone(phone);
		
	}
}