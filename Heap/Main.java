package Heap;

public  class Main<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSortInterface hsi = new HeapSort();
		Integer[] arr = getData();
		hsi.sortIncreasingOrder(arr);
		printArray(arr);
		hsi.sortDecreasingOrder(arr);
		printArray(arr);
		
	}
	
	private static void printArray(Integer[] arr) {
		for(Integer element: arr)
			System.out.print(element +"  ");
		return;
	}
	
	private static Integer[] getData() {
		
		return new Integer[] {1,2,3,4,5,6,7,7,8,9,5,45,4,3434};
	}

}
