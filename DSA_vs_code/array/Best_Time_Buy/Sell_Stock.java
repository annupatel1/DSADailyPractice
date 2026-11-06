package DSA_vs_code.array.Best_Time_Buy;

public class Sell_Stock {

    public static int stock(int[] arr)
    {
        int buy = arr[0];
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            buy = Math.min(buy, arr[i]);
            max = Math.max(max, arr[i] - buy);
        }

        return max;

    }
    public static void main(String[] args)
    {
      int[] arr={4,3,2,5,6,2,2,3,4,8,9,1};

      System.out.println( stock(arr));

    }
    
    
}
