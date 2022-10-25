public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {{100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;
        //이차원 배열의 모든 요소 출력
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        //이차원 배열 요소의 합 구하기
        for (int[] i : score) { //i = 행
            for (int data : i) {   //data = 각 열의 실제 데이터
                sum+= data;
            }
        }

        System.out.println("sum = " + sum);
    }
}
