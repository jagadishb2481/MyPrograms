package datastructures.search_sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[]= {10,1,5,4,2,7};
		quickSort(arr,0,arr.length-1);
		System.out.print("Sort using QuickSort: ");
		Arrays.asList(arr).forEach(k->System.out.print(k+" "));
		
	}

	private static void quickSort(Integer[] arr, int l, int h) {
		// TODO Auto-generated method stub
		
		if(l<h) {
			int p=partition(arr,l,h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}
	}

	private static int partition(Integer[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int i=l-1;
		int pivot=arr[h];
		for(int j=l;j<h;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}

	

}
