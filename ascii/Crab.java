
/**
 * prints out big and small crabs in ascii
 * 
 * @author (Gavin Moy) 
 * @version (10/2/15)
 */
public class Crab
{
    public static void main (String[] args) {
        crab (1,3); //this will print out 1 large crab and 3 rows of small crabs
        System.out.println("       This is the king of crabs");
        System.out.println("             Praise him");
    }

    public static void crab (int large, int small) { //the paramater crab will look for 2 ints, 1 for large and 1 for small crabs
        for (int i =large; i>=1; i--) { //prints out a number of large crabs to match the int large
            System.out.println("   \\`\\                    /`/");
            System.out.println("    \\ \\                 / /");
            System.out.println("     \\ |               | /");
            System.out.println("      | \\             / |");
            System.out.println("   <===\\ |  O   O    | /===>");
            System.out.println("       \\-\\ ll___ll /-/     ");
            System.out.println("        \\ /       \\ /");
            System.out.println("       /\\|        |/\\");
            System.out.println("      //\\|        |/\\\\");
            System.out.println("      /   \\______/   \\");
            System.out.println();
            
        }
        for (int i = small; i>=1; i--) { // prints out a row of 3 small crabs for the number of int small
            System.out.println(" Y /1-1\\ Y    Y /1-1\\ Y    Y /1-1\\  Y");
            System.out.println(" \\|     |/    \\|     |/    \\|     |/");
            System.out.println("  /\\___/\\      /\\___/\\      /\\___/\\");
            System.out.println();
    }
}

}
