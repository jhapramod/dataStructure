package matrix;

public class PrintDigonalMatrix {

	public static void main(String[] args) {
		String[][] mat= {{"a","b","c","d","e"},
						{"f","g","h","i","j"},
						{"k","l","m","n","o"},
						{"p","q","r","s","t"}};		



		printDigonalMat(4,5,mat);
	}

	private static void printDigonalMat(int m, int n, String[][] mat) {
	
		for (int k = 0; k <=m-1; k++) {
			int i=k;
			int j=0;
			while(i>=0) {
				System.out.print(mat[i][j]);
				i=i-1;
				j=j+1;
			}
			System.out.println();
			
			
		}
		
		
		for (int k = 1; k <=n-1; k++) {
			int i=m-1;
			int j=k;
			while(j<=n-1) {
				System.out.print(mat[i][j]);
				i=i-1;
				j=j+1;
			}
			System.out.println();
		}
		
	}

}
