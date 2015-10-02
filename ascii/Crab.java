
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab
{
    public static void main (String[] args) {
        crab (1,3);
        System.out.println("       This is the king of crabs");
        System.out.println("             Praise him");
    }

    public static void crab (int large, int small) {
        for (int i =large; i>=1; i--) {
            System.out.println("\\`\\                    /`/");
            System.out.println(" \\ \\                 / /");
            System.out.println("  \\ |               | /");
            System.out.println("   | \\             / |");
            System.out.println("<===\\ |  O    O   | /===>");
            System.out.println("      \\ ll___ll /-/     ");
            System.out.println("     \\ /       \\ /");
            System.out.println("     /\\|        |/\\");
            System.out.println("   //\\|        |/\\\\");
            System.out.println("    /   \\______/   \\");
            System.out.println();
            
        }
        for (int i = small; i>=1; i--) {
            System.out.println(" Y /1-1\\  Y   Y /1-1\\  Y   Y /1-1\\  Y");
            System.out.println(" \\|     |/    \\|     |/    \\|     |/");
            System.out.println("  /\\___/\\      /\\___/\\      /\\___/\\");
            System.out.println();
    }
}

}
