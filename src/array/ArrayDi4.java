package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int [][] arr = new int [2][3];

        int i = 0;
        for (int row =0; row<arr.length; row++){
            for (int col=0;col<arr[row].length; col++){
                arr[row][col] = ++i;
            }
        }

        for(int row = 0; row < arr.length; row++){  // arr 자체는 2개의 데이터를 가지고 있다,
            for(int col =0; col<arr[row].length;col++){ // arr 의 열의 길이는 arr[row] 의 길이를 측정하면 된다.
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
