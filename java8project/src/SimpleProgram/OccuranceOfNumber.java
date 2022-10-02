package SimpleProgram;

public class OccuranceOfNumber {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {10,12,10,12,14,14,15,20,20,25};
			int count[]=new int[50];
			for(int i=0;i<arr.length;i++)
			{
				count[arr[i]]++;
			}
			for(int i=0;i<count.length;i++)
			{
				if(count[i]>0)
				System.out.println(i+":"+count[i]+" ");
			}

		}

	}
