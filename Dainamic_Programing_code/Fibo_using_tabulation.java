public class Fibo_using_tabulation{

    public static void main(String[] args)
    {

   int[] dp=new int[6];

     dp[0]=0;
     dp[1]=1;

     for(int i=2;i<=5;i++)
     {
        dp[i]=dp[i-1]+dp[i-2];
     }

    System.out.println("this is fib of 5 is " + dp[5]);
    }
}