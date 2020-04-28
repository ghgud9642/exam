package 중간고사3번_1;
import java.util.Scanner;
public class Airplane { 
	protected String plane;
	protected String model;
	protected int passengers;
	protected String email;
	public Airplane() {
	}
	public Airplane(String plane, String model) {
		this.plane = plane;
	}
	public Airplane(String plane, String model, int passengers) {
		this.plane = plane;
		this.model = model;
		this.passengers = passengers;
	}
	public String getplane() {
		return plane;
	}
	public void setplane(String plane) {
		this.plane = plane;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public int getpassengers() {
		return passengers;
	}
	public void setpassengers (int passengers) {
		this.passengers = passengers;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void printInfo() {
		System.out.println("plane : "+ plane + " model Number :" + model +
				" maximum number of passengers :" + passengers + " data :" + email);
	}
	public void getUserInput(Scanner input) {
		System.out.print("plane Name : ");
		String plane = input.next();
		this.setplane(plane);
		System.out.print("Model Number : ");
		String model = input.next();
		this.setmodel(model);
		System.out.print("maximum number of passengers  : ");
		int passengers = input.nextInt();
		this.setpassengers(passengers);
	}
	}
