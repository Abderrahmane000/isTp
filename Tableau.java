package tp2;

import java.util.Random;

public abstract class Tableau {
	public Tableau(int l) {
		this.tab= new int[l];
		Random r = new Random();
		for(int i=0;i<l;i++) {
			tab[i] = r.nextInt(200);
		}
	}
	protected int tab[];
	protected int tabTrie[];
	
	public int[] getTabTrie() {
		return tabTrie;
	}
	public void setTabTrie(int[] tabTrie) {
		this.tabTrie = tabTrie;
	}
	public int[] getTab() {
		return tab;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}
	public void afficher() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
	public void afficherTrie() {
		for(int i=0;i<tabTrie.length;i++) {
			System.out.println(tabTrie[i]);
		}
	}
	public int[] copie(int t[]) {
		for(int i=0;i<tab.length;i++) {
			tabTrie[i] = tab[i];
		}
		return tabTrie;
	}
	public abstract int[] triBulle(int t[]);
	public abstract int[] triInsertion(int t1[]);
	public abstract int[] triSelection(int t2[]);
	
	
	public boolean rechercheSec(int[] t, int val) {
		for(int i =0 ;i<t.length;i++) {
			if(t[i] == val) {
				return true;
			}
		}
		return false;
	}
	public int rechercheDec(int[] t, int val) {
		int indD = 0, indF =t.length-1,mil;
		while(indD<=indF) {
			mil = (indD+indF) / 2;
			if(t[mil] == val) {
				return mil;
			}else {
				if(t[mil]>val) {
					indF = mil-1;
				}else {
					indD = mil+1;
				}
			}
		}
		return -1;
	}
	public int rechercheInt(int []t ,int x) {
		int lo =0, mid = -1 , hi = t.length-1;
		while (lo <= hi && x >= t[lo] && x <= t[hi]) {
			mid = lo + (x - t[lo]) * (hi - lo) / (t[hi] - t[lo]);
			if(lo==hi) {
				if(x == t[lo]) {
					return lo;
				}
			}
			if (t[mid]< x) {
				lo = mid +1;
			}else if(t[mid]> x){
				hi = mid - 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
