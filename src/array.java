public class array {

    static int array1d(int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }
        return total;

    }

    public static void main(String[] args) {
        int[] array1d = {10, 20, 30, 40, 50};
        int[][] array2d = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int[][][] array3d = {
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                {2,3,4},
                {5,6,7},
                {8,9,10}
            },
            {
                {3,4,5},
                {6,7,8},
                {9,10,11}
            }
        };

        System.out.println("Array 1D total: " + array1d(array1d));
        System.out.println();

        System.out.println("Array 2D: ");
        System.out.println();

        for(var i = 0; i < array2d.length; i++){
            for(var j = 0; j < array2d[1].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array 3D: ");
        System.out.println();

        for(var i = 0; i < array3d.length; i++){
            for(var j = 0; j < array3d[1].length; j++){
                for(var k = 0; k < array3d[1][1].length; k++){
                    System.out.print(array3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
