
/**
 * Cotains Coordinates for 6 Equestrian cities and uses them to calculate certian information like distances between 2 cities 
 * 
 * @author (Gavin Moy) 
 * @version (10/17/15)
 */
public class ReturningValues
{
    public static void main(String[] args) {
        //Baltimare (32, 25)    manehattan (35, 9)   Los Pegasus (6,18)
        //Ponyville (16, 13)    Badlands (25, 22)   Falls (22, 7)
        int baltimareX = 32;
        int baltimareY = 25;
        int manehattanX = 35;
        int manehattanY = 9;
        int losPegasusX = 6;
        int losPegasusY = 18;
        int ponyvilleX = 16;
        int ponyvilleY = 13;
        int badlandsX = 25;
        int badlandsY = 22;
        int neighagraFallsX = 22;
        int neighagraFallsY = 7;
        double d1 = distance (baltimareX, baltimareY, manehattanX, manehattanY); //baltimare to manehattan
        System.out.println (" Distance from Baltimare to manehattan = " + d1);
        double d2 = distance (losPegasusX, losPegasusY, neighagraFallsX, neighagraFallsY); //Los Pegasus to the falls
        System.out.println (" Distance from Los Pegasus to Neighagra Falls = " + d2);
        double d3 = distance (badlandsX, badlandsY,ponyvilleX, ponyvilleY);// badlands to ponyville
        System.out.println (" Distance from Badlands to Ponyville = " + d3);
                // everything else in the main is just stuff i tested with
        System.out.println();
        System.out.println();
        System.out.println("A circular road trip with its the diameter the distance between Ponyville and Baltimare is " + roadTrip(ponyvilleX, ponyvilleY, baltimareX, baltimareY) + " miles long"); // excercise 2 test using the points from ponyville and Baltimare
        threeStopTour(0,0,0,3,4,0); // testing  excercise 3 with a 3-4-5 triangle
        threeStopTour(ponyvilleX, ponyvilleY, baltimareX, baltimareY, manehattanX, manehattanY); // testing  excercise 3 using the coordinates for ponyville and baltimare and manehattan
        System.out.println ("The longest trip between Ponyville, Baltimare and manehattan is " + longestTrip(ponyvilleX, ponyvilleY, baltimareX, baltimareY, manehattanX, manehattanY) + "miles long"); // testing excersie 3 with 3 cities
        System.out.println ("the longest side in a 3-4-5 triangle is " + longestTrip(0,0,0,3,4,0)); // testing excercise 4 with a 3-4-5 triangle
    }
    public static double distance( int x1, int y1, int x2, int y2) { //excercise 1 
       return Math.sqrt ( Math.pow (x1 - x2, 2) + Math.pow (y1 - y2, 2)); //uses cordinates and pathagorean theroem to calculate distance 
    }
    public static double roadTrip (int x1, int y1, int x2, int y2) { // excersie 2     calculates distance and uses it to find circumference
        double diameter = distance (x1, y1, x2, y2);
        return (diameter * Math.PI);
    }
    public static void threeStopTour (int x1, int y1, int x2, int y2, int x3, int y3) { //excercise  3 takes in 3 coordinates and prints the distances and angles betwen them
        double d1 = distance (x1, y1, x2, y2); // three distances calculated using coordinates
        double d2 = distance (x1, y1, x3, y3);
        double d3 = distance(x2, y2, x3, y3);
        System.out.println(" The three distances are" + d1 + " , " + d2 + " and " + d3 );
        double a1 = threeStopTourAngle ( d3, d2, d1); // three angles calculated using the distances
        double a2 = threeStopTourAngle ( d2, d1, d3);
        double a3 = threeStopTourAngle ( d3, d1, d2);
        System.out.println(" The three angles are " + a1 + " , " + a2 + " and " + a3 + " degrees");
        
    }
    public static double threeStopTourAngle ( double d1, double d2, double d3 ) { // gets the angle 
        double cosC = (Math.pow(d1,2) + Math.pow(d2,2) - Math.pow(d3,2))/(d1*d2*2) ; // uses the 3 sides to calculates Cos C according to the law of cosine
        double radian = Math.acos (cosC); // use arc cos to find the radian of cos C
        return Math.toDegrees (radian); // converts to degrees
        
    }
   public static double longestTrip (int x1, int y1, int x2, int y2, int x3, int y3) { //  excerse 4 calcuates the distances between 3 coordinates and returns the longest one
        double d1 = distance (x1, y1, x2, y2); //getting the 3 distances
        double d2 = distance (x1, y1, x3, y3);
        double d3 = distance(x2, y2, x3, y3);
        double compare1 = Math.max (d1,d2); //gets which is bigger of first 2 distances
        double compare2 = Math.max (d2,d3); // gets which is bigger of the last 2
        return Math.max (compare1, compare2); // returns the bigger of the 2 found above
    }
}