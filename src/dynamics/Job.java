package dynamics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Job implements Comparator<Job>{
	
	private int startTime;
	
	private int endTime;
	
	private int profit;
	
	public Job(int startTime,int endTime,int profit) {
		this.startTime=startTime;
		this.endTime=endTime;
		this.profit=profit;
	}

	public static void main(String[] args) {
		
		 Job jobs[] = new Job[6];
	        jobs[0] = new Job(1,3,5);
	        jobs[1] = new Job(2,5,6);
	        jobs[2] = new Job(4,6,5);
	        jobs[3] = new Job(6,7,4);
	        jobs[4] = new Job(5,8,11);
	        jobs[5] = new Job(7,9,2);
	        
	        WeightedJobSchedulingMaximumProfit mp = new WeightedJobSchedulingMaximumProfit();
	        System.out.println(mp.maximum(jobs));
	        
	    
	      

	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	@Override
	public int compare(Job o1, Job o2) {
		if(o1.getEndTime()<=o2.getEndTime())
			return -1;
		else
			return 1;
		
		
	}

	
}
