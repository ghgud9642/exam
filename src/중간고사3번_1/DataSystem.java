package 중간고사3번_1;
import java.util.Scanner;
public class DataSystem extends Airplane {
public void getUserInput(Scanner input) {
		System.out.print("Airplane : ");
		String plane = input.next();
		this.setplane(plane);
		System.out.print("Airplane Model : ");
		String model = input.next();
		this.setmodel(model);
		System.out.print("maximum number of passengers : ");
		int passengers = input.nextInt();
		this.setpassengers(passengers);
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n'&& answer !='N')
		{
		System.out.print("Do you have another email address. <Y/N>");
		answer = input.next().charAt(0);
		if(answer =='y' || answer == 'Y') 
		{
			System.out.print("Email address: ");
			String email = input.next();
			this.setemail(email);
			break;
		}
		else if (answer =='n' || answer == 'N')
		{
			this.setemail("");
			break;
		}
		else {
			
		}
		}
}
}

	



