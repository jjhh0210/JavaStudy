public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {{100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };

        //과목별 총점
        int korSum = 0, engSum = 0, mthSum = 0;
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==================================");

        for (int i = 0; i < score.length; i++) {
            //매 학생별 총점 초기화
            int sum = 0;
            double avg = 0.0;

            korSum += score[i][0];  //j가 정해져 있으니까!
            engSum += score[i][1];
            mthSum += score[i][2];

            System.out.printf("%3d",i+1); //3자리중 끝부터 채움

            for (int j = 0; j < score[i].length; j++) {

                System.out.printf("%5d",score[i][j]);
                sum+=score[i][j];
            }
            avg = (double)sum/score[0].length;
            System.out.printf("%5d %5.1f\n",sum,avg);
        }
        System.out.println("==================================");
        System.out.printf("총점: %3d %4d %4d",korSum,engSum,mthSum);
    }
}
