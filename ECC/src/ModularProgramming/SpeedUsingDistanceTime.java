package ModularProgramming;

import java.util.Scanner;

public class SpeedUsingDistanceTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the distance in meters:");
		double distance = scan.nextDouble();
		System.out.println("enter the time in hours:");
		int hours = scan.nextInt();
		System.out.println("enter the time in minutes:");
		int minutes = scan.nextInt();
		System.out.println("enter the time in seconds:");
		int seconds = scan.nextInt();
		System.out.println("speed in meters per second:" + meterPerSec(distance, hours, minutes, seconds));
		System.out.println("speed in km per hour:" + KilometerPerHour(distance, hours, minutes, seconds));
		System.out.println("speed in mile per hour:" + MilesPerHour(distance, hours, minutes, seconds));
		scan.close();
	}

	public static double meterPerSec(double dist, double hrs, double min, double sec) {
		double distence = dist;
		double time = ((hrs * 60 * 60) + (min * 60) + sec);
		return distence / time;
	}

	public static double KilometerPerHour(double dist, double hrs, double min, double sec) {
		double distance = dist * 0.001;
		double time = (hrs + min * (1 / 60) + sec * (1 / 3600));
		return distance / time;
	}

	public static double MilesPerHour(double dist, double hrs, double min, double sec) {
		double distance = dist / 1609;
		double time = (hrs + min * (1 / 60) + sec * (1 / 3600));
		return distance / time;

	}

}
