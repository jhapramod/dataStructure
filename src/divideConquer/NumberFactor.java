package divideConquer;

public class NumberFactor {

	public static void main(String[] args) {
		NumberFactor nf= new NumberFactor();

		System.out.println(nf.wayToCreateN(4));
		System.out.println(nf.wayToCreateN(5));
		System.out.println(nf.wayToCreateN(6));
	}
	
	private static int wayToCreateN(int number) {
		if(number==0||number==1|| number==2 )
			return 1;
		if(number==3)
			return 2;
		int subTrace1 = wayToCreateN(number-1);
		int subTrace2 = wayToCreateN(number-3);
		int subTrace3 = wayToCreateN(number-4);
		
		return subTrace1+subTrace2+subTrace3;
	}

}
