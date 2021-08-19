import java.util.Scanner;

public class Main {
	
	public Scanner input = new Scanner(System.in);
	boolean isRunning;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world!!");
		Main run;
		run = new Main();
		//run.multiplikation();
		run.gameCycle();
	}
	
	public void multiplikation() {
		// Räknar ut en multiplikation
		int x;
		int y;
		System.out.println("Vänligen ange 2 siffror");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println(x*y);
		System.out.println("ya did it dingus");
	}
	public void gameCycle() {
		isRunning = true;
		int a = 0;
		while (isRunning) {
			a = a+1;
			System.out.println(a);
			
			if (a == 100) {
				isRunning = false;
			}
		}
		System.out.println("klar");
		
	}

}
