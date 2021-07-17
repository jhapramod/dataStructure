package dynamics;

import java.util.Arrays;

public class WeightedJobSchedulingMaximumProfit {
	
	  public int maximum(Job[] jobs) {
		  
		  FinishTimeComparator finishTimeComparator= new FinishTimeComparator();
		  Arrays.sort(jobs,finishTimeComparator);
		  int[] time =new int[jobs.length];
		  
		  time[0] =jobs[0].getProfit();
		  for (int i = 1; i < jobs.length; i++) {
			  time[i] =Math.max(jobs[i].getProfit(),time[i-1]);
			  for (int j = i-1; j >= 0; j--) {
				  if(jobs[j].getEndTime()<=jobs[i].getStartTime()) {
					  time[i]= Math.max(time[i], jobs[i].getProfit()+time[j]);
					  break;
				  }
				
			}
			
		}
		  int maxVal = Integer.MIN_VALUE;
	        for (int val : time) {
	            if (maxVal < val) {
	                maxVal = val;
	            }
	        }
	        return maxVal;
	  }

	  
}
