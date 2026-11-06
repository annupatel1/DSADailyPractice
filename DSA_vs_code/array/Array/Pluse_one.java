
package DSA_vs_code.array.Array;
import java.util.*;

public class Pluse_one{

    public static int[] pluse(int[] arr)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==9)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]++;
                break;
            }
        }
            if(arr[0]==0)
            {
                int[] ans=new int[arr.length+1];
             Arrays.fill(ans, 0);
             ans[0]=1;
             return ans;
            
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        System.out.println("enter element of arr in pluse one probleam ");
    Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
          int n=sc.nextInt();
          arr[i]=n;
        }

        int[] list = pluse(arr);


        for(int i=0;i<5;i++)
        {
            System.out.print(list[i]+" ,");
        }
    }
}