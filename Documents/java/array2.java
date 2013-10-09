
public class array2
{
	public static void main(String[] args) {

		int [] rev= {1,2,3,4,5,6,7,8,9};
		int lastone=rev.length-1;
		
        int j=0;


		for(int i=lastone; i>=rev.length/2 ; i--)
		{
			int last=rev[i];
 		 	int first=rev[j];

            
 		 	rev[j]=last;
 		 	rev[i]=first;

 		 	j++;
		}

		for(int i=0; i<rev.length;i++)
		{
			System.out.print(rev[i]);
		}
		System.out.println();		
		
	}
}
				


