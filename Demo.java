import java.util.Random;
public class Demo{
  public static void main(String[] args){
    int pyramid = Integer.parseInt(args[0]);
    printLoop(pyramid);
    System.out.println("");
    int[] n = {5, 4, 3, 2, 1};
    int[][] test = {{5, 4, 3, 2, 1},{1, 2, 3, 4, 5}};
    arrToString(n);
    System.out.println("");
    arrDeepToString(test);
    System.out.println("");
    arrDeepToString(create2DArray(2, 2, 4));
    System.out.println("");
    arrDeepToString(create2DArrayRandomized(5, 5, 4));
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
      for ( int i = 0; i < arr.length; i++ ){
        for ( int j = 0; j < arr[i].length; j++ ){
            System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
    }
   public static int[][] create2DArray(int rows, int cols, int maxValue){
     Random rand = new Random();
     int[][] new2DArray = new int[rows][cols];
     for (int i = 0; i < rows; i++){
       for (int j = 0; j < cols; j++){
         new2DArray [i][j] = rand.nextInt(maxValue + 1);
       }
     }
     return new2DArray;
   }
   public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
     Random rand = new Random();
     int randomRows = rand.nextInt(rows + 1);
     int randomCols = rand.nextInt(cols + 1);
     int[][] new2DArrayRandomized = new int[randomRows][randomCols];
     for (int i = 0; i < randomRows; i++){
       for (int j = 0; j < randomCols; j++){
         new2DArrayRandomized [i][j] = rand.nextInt(maxValue + 1);
       }
     }
     return new2DArrayRandomized;
   }
}
