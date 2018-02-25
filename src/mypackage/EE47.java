package mypackage;

import java.util.Scanner;

public class EE47 {
	private static int firstlist[];
	private static int secondlist[];
	private static int resultat[];
	
	
	/**
	 * initilaisation des données avec des valeurs comprises entre 0 à et 59 
	 */
	public static void initialisation(){
		firstlist=new int[10];
		secondlist=new int[10];
		resultat=new int[10];
		for(int i=0;i<10;i++){
			firstlist[i]=(int)(Math.random()*60);
			secondlist[i]=(int)(Math.random()*60);
			
		}
	}
	
	
	/**
	 * affichage question et enregistrement reponse
	 */
	public static void administration(){
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("Qst " + i + " : " + firstlist[i] + " + " + secondlist[i] + " = ? ");
			resultat[i]=sc.nextInt();
		}
		
		sc.close();
	}
	
	
	/**
	 * Affiche le score final obtenu 
	 */
	public static void scorefinal(){
		int score =0;
		int res=0;
		for(int i=0;i<10;i++){
			res=firstlist[i]+secondlist[i];
			if(resultat[i]!=res)
				System.out.println("Mauvaise réponse " + " " + resultat[i] + " reponse attendu pour : " + firstlist[i]+ " + " + secondlist[i] + " = " + res);
			else{
			System.out.println("Bonne reponse : " + resultat[i]);
			score+=10;
			}
		}
		
		System.out.println("votre score : " + score);
	}
	
	
	public static void main(String[] args) {
		initialisation();
		administration();
		scorefinal();
	}
}
