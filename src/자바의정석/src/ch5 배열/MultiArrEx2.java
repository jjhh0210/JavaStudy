import java.util.Scanner;

public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] bingo = new int[SIZE][SIZE];
        Scanner sc = new Scanner(System.in);
        int count=1;
        int x=0,y=0;
        //빙고판에 1~25 수 차례대로 저장
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[0].length; j++) {
                bingo[i][j] = count++;  //bingo[i][j] = i*SIZE + j + 1
            }
        }
        //빙고판 섞기
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[0].length; j++) {
                x = (int)(Math.random()*SIZE);
                y = (int)(Math.random()*SIZE);
                //임의로 선택된 bingo[x][y]와 bingo[i][j]를 섞는다
                int tmp = bingo[x][y];
                bingo[x][y] = bingo[i][j];
                bingo[i][j] = tmp;

            }
        }
        
        while (true) {
            for (int[] i : bingo) {
                for (int data : i) {
                    System.out.printf("%3d",data);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("1~25의 숫자를 입력하세요.(종료:0)");
            int input = sc.nextInt();

            if (input == 0) {
                break;
            } else if (input < 1 || input > 25) {
                System.out.println("범위가 잘못되었습니다. 다시입력하세요");
                continue;
            }
            
            //일치하는 값을 0으로 저장
            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == input) {
                        bingo[i][j] = 0;
                        break outer;    //2차원 배열 도는거 자체를 멈춤
                    }
                }
            }
        }

    }
}
