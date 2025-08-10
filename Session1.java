import java.util.Scanner;
public class Session1 {
  public static void main(String[] args) {
    //Task1
    //expected output: There are n positive even numbers and n negative even in the list
    //hint use loop and condition
    //(Shiel and Ed)'s solutions

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter size: ");
    int size = scan.nextInt();
    scan.close();
    int[] arr = new int[size];

    //initialize array
    for(int i = 0; i < size; i++){
        System.out.print(": ");
        arr[i] = scan.nextInt();
    }    
    
    //for printing
    for (int i = 0; i < size; i++){
        System.out.print("[" + arr[i] + "] ");
    }

    System.out.println();   
    
    int negativeEven = 0;
    int positiveEven = 0;
    for(int i : arr){
        if(i % 2 == 0 && i < 0){
            negativeEven++;
        }else if(i % 2 == 0 && i > 0){
            positiveEven++;
        }
    }
    System.out.println("There are " + positiveEven + " positive even numbers and " + negativeEven + " negative even numbers in the list");







    //Task2: Print the pattern below
    //*___
    //**__
    //*___
    //***

    //hint: use nested loop and condition
    //outer loop for rows, inner for column/pattern *

    for(int row = 1; row <= 4; row++){
      for(int col = 1; col <= 4; col++){
        if((row == 1 && col == 1) || (row == 2 && col == 1) || (row == 2 && col == 2) || (row == 3 && col == 1) || (row == 4)){
          System.out.print("*");
        } else {
          System.out.print("_");
        }
      }
      System.out.println();
    }
  }
}