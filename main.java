package tp2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] yes = {3,4,5,8};
		TableauIter z1 = new TableauIter(4);
		System.out.println("Resultat de recherche de la valeur 4 avec RechercheSec: ");
		System.out.println(z1.rechercheSec(yes, 4));
		System.out.println("Resultat de recherche de la valeur 4 avec RechercheDec: ");
		System.out.println(z1.rechercheDec(yes, 4));
		System.out.println("Resultat de recherche de la valeur 4 avec RechercheInt: ");
		System.out.println(z1.rechercheInt(yes, 12));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Size For ALL Your Tables : ");
		int n = input.nextInt();
		TableauIter t1 = new TableauIter(n) ;
		TableauIter t2 = new TableauIter(n) ;
		TableauIter t3 = new TableauIter(n) ;
		int test [] = new int[n];
		System.out.println("*****triBulle*****");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t1.setTab(test);
		long start = System.nanoTime();
		t1.setTabTrie(t1.triBulle(t1.getTab()));
		long end = (System.nanoTime() - start);
		System.out.println("Time taken By triBulle is : "+end+" ns");
		t1.afficherTrie();
		System.out.println("*****triInsertion*****");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t2.setTab(test);
		long start1 = System.nanoTime();
		t2.setTabTrie(t2.triInsertion(t2.getTab()));
		long end1 = (System.nanoTime() - start1);
		System.out.println("Time taken By triInsertion is : "+end1+" ns");
		t2.afficherTrie();
		System.out.println("**********triSelection*********");
		for(int j=0;j<n;j++) {
			System.out.println("Enter The Table Element n:"+j+" ");
			test[j] = input.nextInt();
		}
		t3.setTab(test);
		long start2 = System.nanoTime();
		t3.setTabTrie(t3.triSelection(t3.getTab()));
		long end2 = (System.nanoTime() - start2);
		System.out.println("Time taken By triSelection is : "+end2+" ns");
		t3.afficherTrie();
		System.out.println("*****triBulleRecursive*****");
		TableauRec r1 = new TableauRec(n);
		TableauRec r2 = new TableauRec(n);
		TableauRec r3 = new TableauRec(n);
		long start3 = System.nanoTime();
		r1.setTabTrie(r1.triBulle(r1.getTab()));
		long end3 = (System.nanoTime() - start3);
		System.out.println("Time taken By triBulleRecursive is : "+end3+" ns");
		r1.afficherTrie();
		System.out.println("*****triInsertionRecursive*****");
		long start4 = System.nanoTime();
		r2.setTabTrie(r2.triInsertion(r2.getTab()));
		long end4 = (System.nanoTime() - start4);
		System.out.println("Time taken By triInsertionRecursive is : "+end4+" ns");
		r2.afficherTrie();
		System.out.println("*****triSelectionRecursive*****");
		long start5 = System.nanoTime();
		r3.setTabTrie(r3.triSelection(r3.getTab()));
		long end5 = (System.nanoTime() - start5);
		System.out.println("Time taken By triSelectionRecursive is : "+end5+" ns");
		r3.afficherTrie();
		input.close();
	}

}
