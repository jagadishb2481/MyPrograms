package datastructures.search_sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		Integer arr[]= {10,7,4,1,8,5};
		
		for(int i=0;i<arr.length-1;i++) {
			int mi=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[mi]) {
					mi=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[mi];
			arr[mi]=temp;
		}
		
		System.out.print("Sort using SelectionSort: ");
		Arrays.asList(arr).forEach(k->System.out.print(k+" "));

	}

}
