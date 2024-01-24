import java.util.Scanner;

public class MinutestoDays {

	public static void main(String[] args) {
		Scanner instuff = new Scanner(System.in);
		double minutes = 12;
		final double MINUTES_TO_DAYS = 60;
		final double HOURS_TO_DAYS = 24;
		
		System.out.print("Enter minutes ");
		minutes=instuff.nextInt();
		double hours = minutes / MINUTES_TO_DAYS;
		System.out.println(hours);
		double days = hours / HOURS_TO_DAYS;
		double rounddays = Math.round(days *1000.0)/1000.0;
		
		System.out.println (minutes + " minutes equals " + hours + " hours and equals " + rounddays + " days.");
	}

}
