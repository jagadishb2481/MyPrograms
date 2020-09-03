package hackerrankpack;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class SlidingWindowMaximumNaive {

    public int slidingWindow(int [] nums, int k){
    	
    	List<Integer> l = new ArrayList<>();
        for (int i = 0; i <=nums.length - k ; i++) {
            int min = nums[i];
            for (int j = 1; j<k ; j++) {
                if(nums[i+j]<min)
                    min = nums[i+j];
            }
            //System.out.print(min + " ");
            l.add(min);
        }
       
        return l.stream().mapToInt(x->x).max().getAsInt();
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2};
        int k = 1;
        SlidingWindowMaximumNaive s = new SlidingWindowMaximumNaive();
        System.out.println(s.slidingWindow(nums, k));
    }
}