package sorting;

public class bubbleSorting {
	public static void main(String[] args) {
		int arr[]= {10,5,47,85,4,2};
		int temp1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}