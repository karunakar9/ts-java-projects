package ModularProgramming;

import java.util.Scanner;

public class TImeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter time as given:");
		//inputs 9h 50mins 40sec output:10h 24mins 0 sec;
		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
		int addsec = scan.nextInt();
		Time(hours, minutes, seconds, addsec);
		scan.close();

	}

	public static void Time(int hrs, int mins, int sec, int addsecs) {
		int timesec = ((hrs * 60 * 60) + (mins * 60) + sec + addsecs);
		int hours = timesec / 3600;
		int r1 = timesec % 3600;
		int minutes = r1 / 60;
		int r2 = r1 % 60;
		int secs = r2;
		System.out.println(hours + " hours " + minutes + " minutes " + secs + " seconds");
	}

}
