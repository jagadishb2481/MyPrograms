package datastructures.search_sort;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {4,3,5,1,2};
		
		//bubbleSort(arr);
		//mergeSort(arr, arr.length);
		quickSort(arr, 0, arr.length-1);
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
			if(arr[j]<pivot) {
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



	private static void mergeSort(Integer[] arr, int n) {
		// TODO Auto-generated method stub
		if(n<2) {
			return;
		}
		int m=n/2;
		Integer l[]=new Integer[m];
		Integer r[]=new Integer[n-m];
		for(int i=0;i<m;i++) {
			l[i]=arr[i];
		}for(int i=m;i<n;i++) {
			r[i-m]=arr[i];
		}
		mergeSort(l, m);
		mergeSort(r, n-m);
		merge(arr,l,r,m,n-m);
	}



	private static void merge(Integer[] arr, Integer[] l, Integer[] r, int left, int right) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(l[i]<r[j]) {
				arr[k++]=l[i++];
			}else {
				arr[k++]=r[j++];
			}
		}
		while(i<left) {
				arr[k++]=l[i++];
		}
		while(j<right) {
				arr[k++]=r[j++];
		}
		
	}



	private static void bubbleSort(Integer[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
