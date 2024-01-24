
import java.util.*;
public class Eggprice {

	public static void main(String[] args) {
		Scanner instuff = new Scanner(System.in);
		double eggs = 12.00;
		double EGGS_TO_DOZEN = 12.00;
		double COST_PER_EGG = 0.45;
		double COST_PER_DOZEN = 3.25;
		
		System.out.print("Enter the number of eggs in the order");
		eggs=instuff.nextInt();
		
		double dozen = eggs / EGGS_TO_DOZEN;
		double remainder = eggs % EGGS_TO_DOZEN;
		int value = (int)dozen;
		int eggsremaining = (int)remainder;
		double EGG_PRICE = remainder * COST_PER_EGG;
		double costdozen = value * COST_PER_DOZEN;
		double endresult = costdozen + EGG_PRICE;
		System.out.println("You ordered " + eggs + " eggs. That's " + value + " dozen at $3.25 per dozen and " 
		+ eggsremaining + " loose eggs at 45 cents each for a total of $" + endresult);

	}

}
