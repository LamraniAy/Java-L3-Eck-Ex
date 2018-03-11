package mypackage2;
import java.util.Scanner;

/** 
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers.  Numbers are entered into the dataset using
 * the enter(double) method.  Methods are provided to return the following
 * statistics for the set of numbers that have been entered: The number
 * of items, the sum of the items, the average, and the standard deviation
 */

public class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private  double MAX;
    private  double MIN;
    
    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        affectation(num);
    }

    public void affectation(double n) {
    	MAX = (n>=this.MAX) ?  n : MAX;
    	MIN =  (n<=this.MIN) ? n: MIN;
    	
		
	}

    public double getMax() {
    	return MAX;
    }
    	
    public double getMin() {
    	return MIN;
    }
    
   
    
    
	/**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;  
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }
    
    
    public String toString() {
    	return " max : " +this.MAX + " min : " + this.MIN;
    }
    
    public static void main(String[] args) {
    	
		StatCalc sc=new StatCalc();
		
		Scanner s=new Scanner(System.in);
		double val;
		do {
			System.out.println("Saisir un nombre ");
			val = s.nextDouble();
			sc.enter(val);
			System.out.println(" Count " +sc.getCount() + " Mean " +sc.getMean() + " Max : " +sc.getMax() + " Min : " + sc.getMin()  );
			
		}while(val!=0);
		
		System.out.println("Fin"); 
		
		
	}
    
    

}  // end class StatCalc