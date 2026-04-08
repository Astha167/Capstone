package classwork;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {64,34,25,12,11,90};
        //use bubble sort and expected output
        //11,12,25,34,64,90\
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(arr[j]>arr[i]) {
        		   int temp= arr[i];
        		   arr[i]=arr[j];
        		   arr[j]=temp;
        		}
        	}
        }
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
	}

}
