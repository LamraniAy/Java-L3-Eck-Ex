package mypackage;

public class EE43 {

    
    /**
     * @param n  
     * @return
     */
    public static int rollFor(int n) {
        
        if(n<2 || n>12)
            throw new IllegalArgumentException("Valeur impossible");
        
        int d1,d2;
        int valeur;
        int nblancer=0;
        
        do {
            d1=(int)(Math.random()*6)+1;
            d2=(int)(Math.random()*6)+1;
            valeur=d1+d2;
            nblancer++;
            
        }while(valeur!=n);
        
        return nblancer;
        
    }
    
    
    
    public static void main(String[] args) {
        int n=10;
        
        System.out.println(rollFor(n));

    }

}