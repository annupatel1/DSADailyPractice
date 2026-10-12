import java.util.*;
public class Climbing_stair {
    

    //using recursion 
    public static int climstrR
    (int n)
    {
       if(n==0)
       {return 1;}
       if(n<0)
       {return 0;}

       return climstrR(n-1)+climstrR(n-2);
    }

    // using recursion+memoizetion

    public static int climstrM(int n,int[] dp)
    {
        if(n==0)
        {return 1;}
        if(n<0)
        {return 0;}

        if(dp[n]!=-1)
        {
            return dp[n];
        }

        return dp[n]=climstrR(n-1)+climstrR(n-2);
    }

    //tabulation

    public static int climstrT(int n)
    {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
          dp[i]=dp[i-1]+dp[i-2];  
        }
        return dp[n];
    }

    public void main(String[] args)
    {
        int x=climstrR(7);

        System.out.println(x);

        int[] dp=new int[9];
        Arrays.fill(dp,-1);

        int y=climstrM(7,dp);
        System.out.println(y);

    }
}
