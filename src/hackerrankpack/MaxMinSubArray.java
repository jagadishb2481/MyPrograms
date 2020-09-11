package hackerrankpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java Program to find the maximum for each and every contiguous subarray of size k. 
  
public class MaxMinSubArray { 
    // Method to find the maximum for each and every contiguous subarray of size k. 
	// find the maximum from all subarray's minimum values
    static int getMaxFromSubArrMins(int arr[], int n, int k) 
    { 
        int j, min; 
        int max;
        List<Integer> minList = new ArrayList<Integer>();
        for (int i = 0; i <= n - k; i++) { 
  
            min = arr[i]; 
  
            for (j = 1; j < k; j++) { 
                if (arr[i + j] < min) 
                    min = arr[i + j]; 
            } 
            minList.add(min);
            System.out.print(min + " "); 
        } 
        max = minList.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
        return max;
    } 
    
    static List<List<Integer>> getSubArrays(List<Integer> list, int k){
    	List<List<Integer>> subarrays = new ArrayList<>();
    	for(int i=0;i<=list.size()-k;i++) {
    		List<Integer> subarr = new ArrayList<>();
    		for(int j=0;j<k;j++) {
    			subarr.add(list.get(i+j));
    		}
    		subarrays.add(subarr);
    	}
    	return subarrays;
    }
    
    static int getMax(List<Integer> list, int k) {
    	List<Integer> minList = new ArrayList<>();
    	int max =0;
    	int min,j;
    	for(int i=0;i<=list.size()-k;i++) {
    		min = list.get(i);
    		for( j=1;j<k;j++) {
    			if(list.get(i+j)<min) {
    				min = list.get(i+j);
    			}
    		}
    		minList.add(min);
    	}
    	max = minList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    	return max;
    	
    }
    // Driver method 
    public static void main(String args[]) 
    { /*
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int k = 3; 
       int max = getMaxFromSubArrMins(arr, arr.length, k);*/
       List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toList());
       System.out.println(getSubArrays(list, 4));
       List<List<Integer>> subarrays = new ArrayList<>();
       subarrays = getSubArrays(list, 4);
       List<Integer> minLIST = new ArrayList<>();
    		   subarrays.forEach(x ->{
    	   minLIST.add(x.stream().min(Comparator.comparing(Integer::valueOf)).get());
       });
     System.out.println("max is: "+minLIST.stream().max(Comparator.comparing(Integer::valueOf)).get());
       int k =3;
       int m = getMax(list, k);
        System.out.println("\n"+m);
    } 
} 