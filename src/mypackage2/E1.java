package mypackage2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E1 {
	private Set<Integer> val;

	/**
	 * Intialisation des données dans 2 Set 
	 */
	public void init() {
		Scanner sc = new Scanner(System.in);
		val = new HashSet<Integer>();
		System.out.println("- Entrez un entier ( 0 pour quitter ) ");
		int tmp = sc.nextInt();
		do {
			tmp = sc.nextInt();
			if (tmp != 0)
				val.add(tmp);
		} while (tmp != 0);

		System.out.println("Fin saisi");
		return;
	}

	/**
	 * @return Set
	 */
	public Set<Integer> getSet() {
		return val;
	}

	/**
	 * Union de deux Set
	 * @param s Set
	 * @param s2 Set
	 * @return Set
	 */
	public Set<Integer> getUnionSet(Set<Integer> s, Set<Integer> s2) {

		if (s.size() > s2.size()) {
			s.addAll(s2);
			return s;
		} else
			s2.addAll(s);
		return s2;

	}

	public static void main(String[] args) {
		E1 e = new E1();
		e.init();
		E1 e2 = new E1();
		e2.init();
		System.out.println(e.getSet());
		System.out.println(e2.getSet());
		System.out.println(e.getUnionSet(e.getSet(), e2.getSet()));

	}

}
