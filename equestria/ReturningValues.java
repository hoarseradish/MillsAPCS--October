
/**
 * Write a description of class ReturningValues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReturningValues
{
    public static void main(String[] args) {
        //Baltimare (32, 25)    Manehaten (35, 9)   Los Pegasus (6,18)
        //Ponyville (16, 13)    Badlands (25, 22)   Falls (22, 7)
        int baltimareX = 32;
        int baltimareY = 25;
        int ManehattanX = 35;
        int ManehattanY = 9;
        int losPegasusX = 6;
        int losPegasusY = 18;
        int ponyvilleX = 16;
        int ponyvilleY = 13;
        int badlandsX = 25;
        int badlandsY = 22;
        int neighagraFallsX = 22;
        int neighagraFallsY = 7;
        double d1 = distance (baltimareX, baltimareY, ManehattanX, ManehattanY); //baltimare to manehaten
        System.out.println (" Distance from Baltimare to Manehattan = " + d1);
        double d2 = distance (losPegasusX, losPegasusY, neighagraFallsX, neighagraFallsY); //Los Pegasus to the falls
        System.out.println (" Distance from Los Pegasus to Neighagra Falls = " + d2);
        double d3 = distance (badlandsX, badlandsY,ponyvilleX, ponyvilleY);// badlands to ponyville
        System.out.println (" Distance from Badlands to Ponyville = " + d3);
    }
    public static double distance( int x1, int y1, int x2, int y2) {
       return Math.sqrt ( Math.pow (x1 - x2, 2) + Math.pow (y1 - y2, 2));
       


    }
    public static double roadtrip (int diameter) {
        return (diameter * Math.Pi);
    }
    
}