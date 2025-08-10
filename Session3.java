public class Session3 {
    public static void main(String[] args) {
        //  *
        // * *
        //* * *
        //hint: use nested loops
        //hint: outer loop for rows and inner for space and pattern (total loops use: 3)
        //hint: outer loop for rows, first inner loop for space, and 2nd inner loop for pattern printing
        for(int i = 1; i <= 3; i++){
            for(int j = i; j <= 2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}