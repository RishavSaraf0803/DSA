package Heap;

import java.util.Arrays;

public class HeapSort implements HeapSortInterface{

	@Override
	public void sortIncreasingOrder(Integer[] array) {
		// TODO Auto-generated method stub
		for(int i = array.length/2 -1; i >= 0; i--) {
			maxHeapify(array,array.length,i);
		}
		for(int i = array.length-1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			maxHeapify(array,i,0);
		}
	}
	
	@Override
	public void sortDecreasingOrder(Integer[] array) {
		// TODO Auto-generated method stub
		for(int i = array.length/2 -1; i >= 0; i--) {
			minHeapify(array,array.length,i);
		}
		for(int i = array.length-1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			minHeapify(array,i,0);
		}
	}

	private static void maxHeapify(Integer[] array, int length, int indx) {
		int leftChild = getLeftChild(indx);
		int rightChild = getRightChild(indx);
		int largestEleIndx = indx;
		if(leftChild < length && array[leftChild] > array[largestEleIndx])largestEleIndx = leftChild;
		if(rightChild < length && array[rightChild] > array[largestEleIndx])largestEleIndx = rightChild;
		if(indx != largestEleIndx) {
			swap(array,indx,largestEleIndx);
			maxHeapify(array,length,largestEleIndx);
		}
	}

	private static void minHeapify(Integer[] array, int length, int indx) {
		int leftChild = getLeftChild(indx);
		int rightChild = getRightChild(indx);
		int smallestEleIndx = indx;
		if(leftChild < length && array[leftChild] < array[smallestEleIndx])smallestEleIndx = leftChild;
		if(rightChild < length && array[rightChild] > array[smallestEleIndx])smallestEleIndx = rightChild;
		if(indx != smallestEleIndx) {
			swap(array,indx,smallestEleIndx);
			maxHeapify(array,length,smallestEleIndx);
		}
	}
	private static void swap(Integer[] array, int indx1, int indx2) {
		Integer temp = array[indx1];
		array[indx1] = array[indx2];
		array[indx2] = temp;
		return;
	}
	private static int getLeftChild(int indx) {
		return 2*indx+1;
	}
	private static int getRightChild(int indx) {
		return 2*indx+2;
	}

	
}
