package datastructures.search_sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		Integer arr[]= {5,1,5,4,2,8};
		
		doMergeSort(arr,arr.length);
		System.out.print("Sort using MergeSort: ");
		Arrays.asList(arr).forEach(k->System.out.print(k+" "));
	}

	private static void doMergeSort(Integer[] arr, int n) {
		
		if(n<2) {
			return;
		}
		int mid = n/2;
		Integer left[]=new Integer[mid];
		Integer right[]=new Integer[n-mid];
		
		for(int i=0;i<mid;i++) {
			left[i]=arr[i];
		}
		for(int i=mid;i<n;i++) {
			right[i-mid]=arr[i];
		}
		
		doMergeSort(left, mid);
		doMergeSort(right, n-mid);
		
		merge(arr, left, right, mid, n-mid);
	}

	private static void merge(Integer[] arr, Integer[] left, Integer[] right, int l, int r) {
		
		int i=0, j=0,k=0;
		while(i<l && j<r) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		while(i<l) {
			arr[k++]=left[i++];
		}
		while(j<r) {
			arr[k++]=right[j++];
		}
		
	}

}
