public class Demo{
  public static void main(String[] args){
    int pyramid = Integer.parseInt(args[0]);
    printLoop(pyramid);
    int[] n = {5, 4, 3, 2, 1};
    int[][] test = {{5, 4, 3, 2, 1},{1, 2, 3, 4, 5}};
    arrToString(n);
    arrDeepToString(test);
  }
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++ ){
      for(int j = n; j >= i; j-- ){
        System.out.print(i);
      }
      System.out.println();
    }
  }
   public static void arrToString(int []arr){
      for ( int i = 0; i < arr.length; i++ )
          System.out.print(arr[i]);
   }
   public static void arrDeepToString(int [][]arr){
      System.out.println();
      for ( int i = 0; i < arr.length; i++ )
          System.out.print(arr[i][i]);
   }
}
