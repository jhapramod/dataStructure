package dynamics;

import java.util.Comparator;

public class FinishTimeComparator implements Comparator<Job>{

    @Override
    public int compare(Job arg0, Job arg1) {
        if(arg0.getEndTime() <= arg1.getEndTime()){
            return -1;
        }else{
            return 1;
        }
    }
    
}