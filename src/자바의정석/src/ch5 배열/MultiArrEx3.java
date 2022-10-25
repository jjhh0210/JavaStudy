public class MultiArrEx3 {
    public static void main(String[] args) {
        int[][] m1= {
                {1,2,3},
                {4,5,6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;  //2
        final int COL = m2[0].length;   //2
        final int M2_ROW = m2.length;   //3
        //m3 = (m1의 행 by m2의 열)
        int[][] m3 = new int[ROW][COL];
        //행렬의 곱셈 및 출력
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                for (int k = 0; k < M2_ROW; k++) {
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
                System.out.printf("%3d",m3[i][j]);
            }
            System.out.println();
        }
        //행렬 출력
//        System.out.println("행렬의 곱셈 결과");
//        for (int[] i : m3) {
//            for (int data : i) {
//                System.out.printf("%4d", data);
//            }
//            System.out.println();
//        }
    }
}
