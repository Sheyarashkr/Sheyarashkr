package examples;

import java.util.Scanner;

public class acceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Acceleration , StartSpeed , EndSpeed, Time;
		System.out.println("Bitte geben Sie hier Start Speed ein:");
		StartSpeed = input.nextDouble();
		System.out.println("Bitte geben Sie hier End Speed ein: ");
		EndSpeed = input.nextDouble();
		System.out.println("Bitte geben Sie hier Time ein:");
		Time = input.nextDouble();
		Acceleration = (EndSpeed - StartSpeed) / Time;
		System.out.println("Acceleration ist " + Acceleration);
	}

}
