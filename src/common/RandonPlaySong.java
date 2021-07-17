package common;

public class RandonPlaySong {

	public static void main(String[] args) {
	
		int[] playSong = {1,2,3,4,5,6,7,8,9};
		
		randomShuffle(0,9,playSong);
		
		
		

	}

	private static void randomShuffle(int i, int j,int[] playSong) {
		
		
		if(i==j)
			return;
		int random = (int) ((Math.random() * (9 - 0)) + 0);
	
		
		int temp=playSong[i];
		playSong[i]=playSong[random];
		playSong[random]=temp;
		System.out.println("play song"+playSong[random]);
		randomShuffle(i+1, j, playSong);
		
	}

}
