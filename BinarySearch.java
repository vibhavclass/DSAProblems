package SearchNSort;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {3, 5 ,1 ,8 ,4, 15};
		Arrays.sort(arr);
		int i=0;
		while(i<arr.length) {
		System.out.print(arr[i]+" ");
		i++;
		}
		int index= binSearch(arr,4);
		System.out.println("\n"+index);

	}

	public static int binSearch(int arr[],int x) {
		 
			int start =0;
	        int end = arr.length-1;
	        int mid = (start+end)/2;
	        
	        while(start<=end){
	        	mid = (start+end)/2;
	            
	        	if(arr[mid]==x)
	                return mid;
	            
	            else if(x<arr[mid]){     	//array= {3, 5 ,1 ,8 ,4, 15};
	                end=mid-1;
	           
	            }
	            else{
	                start=mid+1;
	            }
	            }
	        return -1;
	}
	
}
