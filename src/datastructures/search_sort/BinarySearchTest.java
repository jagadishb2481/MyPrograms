package datastructures.search_sort;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		boolean found= binarySearch(arr,0,arr.length-1,6);
		System.out.println(found);
	}

	private static boolean binarySearch(int[] arr, int l, int h, int k) {
		// TODO Auto-generated method stub
		
		if(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==k) {
				return true;
			}else if(k<arr[mid]) {
				return binarySearch(arr, l, mid-1, k);
			}else if(k>arr[mid]) {
				return binarySearch(arr, mid+1, h, k);
			}
		}
		
		return false;
	}


}
