import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    
                }
                
            }
        }
        System.out.print(arr[n-2]);
    
	}
}
