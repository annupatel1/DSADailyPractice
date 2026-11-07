package DSA_vs_code.Array.Array;

import java.util.*;
public class Merge_intervale{

    public static int[][] merge(int[][] arr)
    {

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> list=new ArrayList<>();
        
        int start=arr[0][0];
        int end=arr[0][1];

        for(int i=1;i<arr.length;i++)
        {
            int s=arr[i][0];
            int e=arr[i][1];

            if(end>=s)
            {
                end=Math.max(end,e);
            }
            else{
                list.add(new int[]{start,end});
                start=s;
                end=e;
            }
        }
        list.add(new int[]{start,end});
return list.toArray(new int [list.size()][]);
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
int[][] arr=new int [5][2];

for(int i=0;i<5;i++)
{
    for(int j=0;j<2;j++)
    {
        int n=sc.nextInt();
        arr[i][j]=n;
    }
}

int[][] nums=merge(arr);

for(int i=0;i<nums.length;i++)
{
    for(int j=0;j<2;j++)
    {
        System.out.print(nums[i][j]+"->");
    }
    System.out.println();
}
    
sc.close();
}
    
}