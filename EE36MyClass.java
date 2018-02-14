import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class EE36MyClass {
	
	public static void main(String[] args) {
			
			Map<Integer,Integer> map = new HashMap<>();
			int nbDiv=0;
			int maxDiv=1;
			
			for(int i=1;i<=10000;i++){
				
				nbDiv=0;
				
				for(int d=1;d<=i;d++){
					if(i%d==0)
						nbDiv+=1;
				}
				
				if(nbDiv > maxDiv)
					maxDiv=nbDiv;
				
				map.put(i, nbDiv);
			}
			
			System.out.println("Nombre diviseur max : " + maxDiv);
			
			for(Entry<Integer, Integer> entry : map.entrySet()) {
			    if(entry.getValue()==maxDiv)
			    	System.out.println(" Nombre ayant le nombre maxdiviseur : " + entry.getKey());
			    
			}
	
		}
	
}
