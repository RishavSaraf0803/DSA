import java.util.Scanner;
import java.util.Stack;

public class SortingAlgo {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			//sorting algo call
			//mergesortrecursive(arr,0,n-1);
			//bubblesort(arr,n);
			//selectionsort(arr,n);
			//insertionsort(arr,n);
			//quicksortrecursive(arr,0,n-1);
			quicksortiterative(arr,0,n-1);
			int sorted[]=arr;
			for(int ele:sorted)
				System.out.print(ele+" ");
			System.out.println();
			t--;
		}
	}
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return;
	}
	static void bubblesort(int [] arr,int n )
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
			}
		}
		return;
	}
	static void selectionsort(int[] arr,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int minindex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minindex])
				{
					minindex=j;
				}
				
			}
			swap(arr,i,minindex);
		}
		return;
	}
	static void insertionsort(int[] arr,int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return;
	}
	static void mergesortrecursive(int [] arr,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergesortrecursive(arr,low,mid);
			mergesortrecursive(arr,mid+1,high);
			mergerecursive(arr,low,mid,high);
		}
	}
	static void mergerecursive(int[] arr,int low,int mid,int high)
	{
		int n1=mid-low+1;
		int n2=high-mid;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			a1[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++)
		{
			a2[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=low;
		while(i<n1 &&j<n2)
		{
			if(a1[i]<=a2[j])
			{
				arr[k]=a1[i];
				i++;
			}
			else
			{
				arr[k]=a2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=a1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=a2[j];
			j++;
			k++;
		}
		
	}
	
	static void quicksortrecursive(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pivot=partition(arr,low,high);
			quicksortrecursive(arr,low,pivot-1);
			quicksortrecursive(arr,pivot+1,high);
		}
	}
	static void quicksortiterative(int []arr,int low,int high)
	{
		Stack<Integer> stack=new Stack<>();
	    stack.push(low);
	    stack.push(high);
	    while(!stack.isEmpty())
	    {
	    	int h=stack.pop();
	    	int l=stack.pop();
	    	int p=partition(arr,l,h);
	    	if(p-1>l)
	    	{
	    		stack.push(l);
	    		stack.push(p-1);
	    	}
	    	if(p+1<h)
	    	{
	    		stack.push(p+1);
	    		stack.push(h);
	    	}
	    }
	}
	static int partition(int[] arr,int low,int high)
	{
		int pivot=arr[high];
		int i=low;
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<arr[pivot])
			{

				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,i,high);
		return i;
	}
	
	
	

}
