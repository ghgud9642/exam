package 중간고사3번;
import java.util.Scanner;
public class AirplaneMenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AirplaneManager AirplaneManager = new AirplaneManager(input);
		int num = -1;
		while (num !=5){
			System.out.println("<Airplane Management>");
			System.out.println("1. Add Airplane");
			System.out.println("2. Delete Airplane");
			System.out.println("3. View Airplane");
			System.out.println("4. Exit");
			System.out.println("Select one number between 1 - 4:");
			num = input.nextInt();
			if (num == 1) {
				AirplaneManager.addAirplane();
			}
			else if (num == 2) {
				AirplaneManager.DeleteAirplane();
			}
			else if (num == 3) {
				AirplaneManager.ViewAirplane();
			}
			else {
				continue;
			}
			
		}
	}
}
	

