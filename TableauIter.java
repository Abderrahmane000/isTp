package tp2;
import java.util.Scanner;
public class TableauIter extends Tableau {
	public TableauIter(int l) {
		super(l);
	}
	public int[] triBulle(int t[]) {
		for(int i=t.length;i>1;i--) {
			for(int j=0;j<i-1;j++) {
				if(t[j]>t[j+1]) {
					int temp;
					temp=t[j];
					t[j]= t[j+1];
					t[j+1] = temp;
				}
			}
			
		}
		return t;
	}
	public int[] triInsertion(int t1[]) {
		for(int j=1;j<t1.length;j++) {
			int cle = t1[j];
			int i=j-1;
			while(i>=0 && t1[i]>cle) {
				t1[i+1] = t1[i];
				i--;
			}
			t1[i+1] = cle;
		}
		return t1;
	}
	public int[] triSelection(int t2[]) {
		for(int j = 0; j<t2.length-1;j++) {
			int indice_min = j;
			for(int i=j+1;i<t2.length;i++) {
				if(t2[i]<t2[indice_min]) {
					indice_min = i;
				}
			}
			int temp = t2[j];
			t2[j] = t2[indice_min];
			t2[indice_min] = temp;
		}
		return t2;
	}
}
