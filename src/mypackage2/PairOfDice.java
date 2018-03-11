package mypackage2;

public class PairOfDice {

    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.
    
    public PairOfDice() {
            // Constructor.  Rolls the dice, so that they initially
            // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }
    
    public PairOfDice(int val1, int val2) {
            // Constructor.  Creates a pair of dice that
            // are initially showing the values val1 and val2.
        die1 = val1;  // Assign specified values 
        die2 = val2;  //            to the instance variables.
    }
    

    public void roll() {
            // Roll the dice by setting each of the dice to be
            // a random number between 1 and 6.
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }
    
    public int getTotal() {
    	return die1 + die2;
    }
    
    
    public int getDie1() {
    	return die1;
    }
    
    public int getDie2() {
    	return die2;
    }
    

    
    public String toString(){
    	 return "Dice 1  : "+ getDie1() + " Dice  2 : " + getDie2();
    }
    
    public static void main(String[] args) {
    	PairOfDice dice = new PairOfDice();
		
		int count=0;
		
		do {
			count++;
			dice.roll();
			
			
			
		}while(dice.getTotal() != 2);
		System.out.println(dice.toString());
		System.out.println(count);
		
	}
    

} // end class PairOfDic