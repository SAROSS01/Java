package Ui;

import java.util.Scanner;

import Util.Console;
import business.RunnerThread;

public class TortoiseAndHareRaceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			RunnerThread tortoise = new RunnerThread("Tortoise", 100, 10, 0);
			RunnerThread rabbit = new RunnerThread("Rabbit", 25, 100, 0);
			tortoise.start();
			rabbit.start();
			try {
				tortoise.join();
				rabbit.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Console.getChoiceString(sc, "Rematch? (y/n): ", "y", "n");

		}
	}
}