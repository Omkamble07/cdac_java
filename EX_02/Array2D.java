package EX_02;

class Output {

    public void Output1(int[][] arr) {
        System.out.println("output 1 :");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public void Output2(int[][] arr) {
        System.out.println("output 2 :");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = 4; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.println();
    }

    // public void output3(int[][] arr) {
    //     System.out.println("Output-3: ");
    //     for (int j = 0; j < 5; j++) {
    //         for (int i = 0; i< 5; i++) {
    //             if (i + j < 5) { // Check to stay within the bounds
    //                 System.out.print(arr[i][j + i] + " ");
    //             }
    //         }

    //     }
    // }

}

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

        Output out = new Output();
        out.Output1(arr);
        out.Output2(arr);
        // out.output3(arr);
    }
}
