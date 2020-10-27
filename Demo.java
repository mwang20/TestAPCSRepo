import java.util.Random;
import java.util.Arrays;
public class Demo{
  public static void main(String[] args){
    if ( args == null || args.length == 0){
      printLoop(5);
    }
    else printLoop(Integer.parseInt(args[0]));
    System.out.println("");
    int[] n = {5, 4, 3, 2, 1};
    System.out.println(arrToString(n));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArray(5, 4, 4)));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArray(6, 2, 3)));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArrayRandomized(6, 4, 4)));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)));
  }
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++ ){
      for(int j = n; j >= i; j-- ){
        System.out.print(i);
      }
      System.out.println();
    }
  }
   public static String arrToString(int []arr){
      return Arrays.toString(arr);
   }
   public static String arrayDeepToString(int [][]arr){
     String a = "";
     for(int i = 0; i < arr.length; i++){
       a = a + Arrays.toString(arr[i]) + "\n";
     }
      return a;
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
     int randomCols = rand.nextInt(cols + 1);
     int[][] new2DArrayRandomized = new int[rows][randomCols];
     for (int i = 0; i < rows; i++){
       for (int j = 0; j < randomCols; j++){
         new2DArrayRandomized [i][j] = rand.nextInt(maxValue + 1);
       }
     }
     return new2DArrayRandomized;
   }
}
