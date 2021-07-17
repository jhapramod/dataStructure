package matrix;

public class PrintLShapeMatrix {


		public static void main(String[] args) {
			String[][] mat= {{"a","b","c","d","e"},
							 {"f","g","h","i","j"},
							 {"k","l","m","n","o"},
							 {"p","q","r","s","t"}};		
			
		
			
			printLshapeMat(4,5,mat);
		}

		private static void printLshapeMat(int m, int n, String[][] mat) {
			int i,first_row=0,first_col=0;
			int last_row=m-1;
			int last_col=n-1;
			while(first_row>=0 && first_col<=last_col) {
				for (i = first_row; i<=last_row; i++) {
					System.out.print(mat[i][first_col]);
					
				}				
				first_col++;
				for(i=first_col;i<=last_col;i++) {
					System.out.print(mat[last_row][i]);
				}
				last_row--;
			}
			
			
		}

	}


