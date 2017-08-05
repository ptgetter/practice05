package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		//int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		//int array[] = { 2, 5, 9, 3, 8, 60, 20, 1, 4 };
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 20 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );		
		trace(array);
		System.out.println();
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//		
		for(int j=0; j< count-1; j++) {
			for(int i=0; i< count-1-j; i++) {			
				if(array[i] < array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}			
			}
			trace(array);
		}
		
		System.out.println( "\nAfter Sort." );
		trace(array);
	}
	
	public static void trace(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}