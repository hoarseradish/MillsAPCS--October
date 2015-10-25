
/**
 * program that uses the users input to ask for a date and calculates the total cost
 * 
 * @author (Gavin Moy) 
 * @version (10/25/15)
 */
import java.util.*;

public class homecoming
{
  
   public static void main (String[] args) {
       getAdate();
       
      
       
    }
    public static void getAdate() { // user inputs name and method uses it 
        Scanner input = new Scanner (System.in);
        System.out.print("Hi my name is Gavin. \nWhat is your name? \n   ");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + "\nWould you like to go to Homecoming with me? \n\n Great! It'll be a magical night.");
        System.out.println("Gavin and " + name+ " going to the MIlls Homecoming Dance 2015!");
        damage(name); // gives the paramater for the name to the damage method so that it will be used in excercise 3
    }
    public static void damage(String name) { // user inputs prices of certain homecoming things and calculates expected costs and cost if split, accepts a String parameter so that it can call the method from excercise 3 and use it
        Scanner input = new Scanner (System.in);
        System.out.print(" Let's figure out the damage for the evening. \n\nWhat are your estimated costs? \n Tickets(each): ");
        double tickets = input.nextDouble();
        System.out.print("Flowers (total for both of you): ");
        double flowers = input.nextDouble();
        System.out.print("Pictures: ");
        double pictures = input.nextDouble();
        System.out.print("Dinner (per meal): ");
        double dinner = input.nextDouble();
        System.out.print(" New clothes (tie to mach dress? Vest? Dress? Non-tennis shoes?):" );
        double clothes = input.nextDouble();
        System.out.print("Any other expenses: ");
        double other = input.nextDouble();
        double total = 1.0825* dinner * 2 + flowers +pictures +1.0828*clothes + tickets *2 + other;
        System.out.print("So, you should expect to spend, including tax: " + total+ "\nIf you split the costs with your date, each will pay: " + total/2 + "\n\n");
        statsTable(name, tickets, flowers, pictures, dinner, clothes, other);// uses the name and the costs in 
    }
    public static void statsTable( String name, double tickets, double flowers, double pictures, double dinner, double clothes, double other) { //accept the name and costs parameters and makes a chart calculating the total
        System.out.println(" MHS Homecoming 2015\n Gavin Moy and " + name);
        System.out.println("Tickets (Total): " + tickets*2);
        System.out.println("Flowers (for both of you): " + flowers);
        System.out.println("Pictures: " +pictures);
        System.out.println("Dinner (for two):" +dinner*2);
        System.out.println("New clothes: " + clothes);
        System.out.println("Any other expenses:" + other + "\n");
        double subtotal = tickets*2+flowers+dinner*2+clothes+other;
        System.out.println(" \t\t  Subtotal: " + subtotal);
        double tax = 1.0825*2*dinner + 1.08258*clothes;
        System.out.println(" \t\t Sales Tax: " + tax);
        System.out.println(" \t\t     Total: " + (subtotal + tax));
        
        
    }
}
