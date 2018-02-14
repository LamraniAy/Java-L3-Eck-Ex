import java.util.Scanner;


public class EE34MyClass {
	
	public static void main(String [] args){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ecrivez une phrase : ");
			String chaine=sc.nextLine();
			
			for(int i=0;i<chaine.length();i++){
			 char ch=chaine.charAt(i);
			 if(!Character.isLetter(ch)){
				  chaine=chaine.replace(ch,' ');
			 }
			 	
			}
			
			String [] chaine2 = chaine.split("\\s");
			for(String c:chaine2)
				System.out.println(c);
				
		}
	

}
