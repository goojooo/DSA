public class TwoDarr {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];

        //
        arr[1][3] = 10;
        // get
        System.out.println(arr[1][3]);

        // row count
        System.err.println(arr.length);

        // tranversal
        for (int i = 0; i < arr.length; i++) { // i -> row no
            for (int j = 0; j < arr[0].length; j++) { // j -> col no.
                //processing
                
            }
        }
    }
}
