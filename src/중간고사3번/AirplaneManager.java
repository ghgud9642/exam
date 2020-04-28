package 중간고사3번;

import java.util.ArrayList;
import java.util.Scanner;

import 중간고사3번_1.Airplane;
import 중간고사3번_1.DataSystem;

public class AirplaneManager {
	ArrayList<Airplane> Airplanes = new ArrayList<Airplane>();
	
	Scanner input;
	
	AirplaneManager(Scanner input)
	{
		this.input = input;
		}
	public  void addAirplane() {
		int kind = 0;
		while (kind !=1 && kind !=2) {
			Airplane Airplane;
			System.out.println("1.Data를 수신하기 ");
			System.out.print("2.Data를 수신하지 않기 ");
			kind = input.nextInt();
			if(kind == 1) { 
				Airplane = new Airplane();
				Airplane.getUserInput(input);
				Airplanes.add(Airplane);
				break;
			}
			else if (kind == 2) {
				Airplane = new DataSystem();
				Airplane.getUserInput(input);
				Airplanes.add(Airplane);
				break;
			}
		}
	}
	public void DeleteAirplane() {
		System.out.print("maximum number of passengers : ");
		int Airplane = input.nextInt();
		int index = -1 ;
		for	(int i = 0; i<Airplanes.size();i++) {
			if(Airplanes.get(i).getpassengers() == Airplane) 
			{
				index = i;
				break;
			}
		}
		if (index >= 0) {
			Airplanes.remove(index);
			System.out.println("the Airplane "+ Airplane +" is deleted");
		}
		else {
			System.out.println("the Airplane had been registered");
			return;		
		}	
	}
	public void ViewAirplane() {
		System.out.println("# of registered Airplanes :"+ Airplanes.size());
		for	(int i = 0; i<Airplanes.size();i++) {
			Airplanes.get(i).printInfo();
		}	
	}
	
}

