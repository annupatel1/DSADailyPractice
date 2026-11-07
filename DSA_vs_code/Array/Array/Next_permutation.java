package DSA_vs_code.Array.Array;
import java.util.*;
public class Next_permutation {

    public static int[] next(int[] arr)
    {
        int n=arr.length;
        int pvt = n - 2;

     while (pvt >= 0 && arr[pvt] >= arr[pvt + 1])
         {
             pvt--;
          }

        if(pvt>=0)
        {
         int end=n-1;
         while(arr[pvt]>=arr[end])
         {
            end--;
         }
         int temp=arr[pvt];
         arr[pvt]=arr[end];
         arr[end]=temp;
        }

        int start=pvt+1;
        int end=n-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      int[] arr=new int[5];
      System.out.println("enter the element of arr");

      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextInt();
      }

    int[] list=  next(arr);

    for(int i=0;i<list.length;i++)
    {
        System.out.print(list[i]+ "->");
    }

    }
    
}
