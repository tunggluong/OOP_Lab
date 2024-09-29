//6.6
public class matrix_sum {
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows=matrixA.length;
        int cols=matrixA[0].length;
        int[][] result=new int[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int[][] matrixA={
            {2, 0, 2},
            {2, 5, 0},
            {3, 1, 0}
        };

        int[][] matrixB={
            {2, 0, 2},
            {2, 5, 0},
            {3, 1, 0}
        };
        int[][] result = addMatrices(matrixA, matrixB);
        System.out.println("The sum of 2 matrix is:");
        for (int[] row:result) {
            for (int value:row) {
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
    }
}

