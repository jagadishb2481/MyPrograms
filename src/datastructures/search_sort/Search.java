package datastructures.search_sort;

import java.util.Arrays;

public class Search {

	public static boolean doBinarySearch(int arr[], int l, int h, int key) {
		
		boolean found=false;
		while(l<=h) {
			int m=(l+h)/2 ;
			if(arr[m]==key) {
				return true;
			}else if(arr[m]>key) {
				return doBinarySearch(arr, l, m-1, key);
			}else if(arr[m]<key) {
				return doBinarySearch(arr, m+1, h, key);
			}
		}
		return found;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		boolean foundBinarySearch = doBinarySearch(arr,0,arr.length-1, 6);
		boolean foundLinearSearch = doLinearSearch(arr, 6);
		System.out.println(foundBinarySearch);
		System.out.println(foundLinearSearch);
	}

	private static boolean doLinearSearch(int[] arr, int search) {
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return true;
			}
		}
		return found;
	}

}
