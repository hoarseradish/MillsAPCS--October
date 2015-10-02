
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
   public static void main (String[] args) {
       tree(1);
       tree(2);
       tree(3);
    }
    
    
   public static void tree (int size) {
       for (int i =1; i<=8*size; i++) {
           for (int j= i; j<=8*size; j++) {
               System.out.print(" ");
            }
           System.out.print("/");
           for (int k = -1 *i  ; k<-1*size; k++    ) {
               System.out.print(" ");
               
            }
           
           System.out.println("\\");
           
        }
       
        System.out.println();
    }
    public static void doubleSpace() {
        System.out.print("  ");
    }
}
