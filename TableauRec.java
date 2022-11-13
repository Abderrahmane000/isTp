package tp2;
public class TableauRec extends Tableau {

	public TableauRec(int l) {
		super(l);
	}
	int n = tab.length;
	public int[] triBulle(int[] t) {
		
		if(n==1) {
			return t;
		}else {
			for(int j=0;j<n-1;j++) {
				if(t[j]>t[j+1]) {
					int temp;
					temp=t[j];
					t[j]= t[j+1];
					t[j+1] = temp;
				}
			}
		n--;
		return triBulle(t);
		}
	}
	int index = 1;
	@Override
	public int[] triInsertion(int[] t1) {
		if(index == t1.length) {
			return t1;
		}else {
			for(int i=index;i>0;i--) {
				if(t1[i]<t1[i-1]) {
					int temp;
					temp = t1[i];
					t1[i] = t1[i-1];
					t1[i-1] = temp;
				}
			}
			index++;
			return triInsertion(t1);
		}
	}
	int z=0;
	@Override
	public int[] triSelection(int[] t2) {
		if(z==t2.length) {
			return t2;
		}else {
			int imin = z;
			for(int j=z;j<t2.length;j++) {
				if(t2[imin]>t2[j]) {
					imin = j;
				}
			}
			int temp;
			temp = t2[imin];
			t2[imin] = t2[z];
			t2[z] = temp;
			z++;
			return triSelection(t2);
		}
	}
}
