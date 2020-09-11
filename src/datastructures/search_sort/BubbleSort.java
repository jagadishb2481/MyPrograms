package datastructures.search_sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer arr[]= {5,1,5,4,2,8};
		doBubbleSort(arr);
		
	}

	private static void doBubbleSort(Integer[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("Sort using BubbleSort: ");
		Arrays.asList(arr).forEach(k->System.out.print(k+" "));
	}

	
}
