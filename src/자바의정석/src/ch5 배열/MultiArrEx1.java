import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y=0;
        char[][] board = new char[SIZE][SIZE]; //출력용! 행,열 출력을 위해 size = 10x10
        int[][] shipBoard = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1}
        }; //size = 9X9, 대각선에 배가 있는 구조

        //board배열 1행에 행번호, 1열에 열번호 저장
        for (int i = 1; i < SIZE; i++) {
            board[i][0] = board[0][i]= (char) ('0' + i); // 한 줄에 대입 연산자 여러개 가능하다..!
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("좌표를 입력하세요(종료는 00)");
            String input = sc.nextLine();
            //일단 x,y 나누기
            if (input.length() == 2) {
                x = input.charAt(0) - '0';  //문자를 숫자로 ex) '9'-'0' = 9
                y = input.charAt(1) - '0';
                //x,y가 모두 0인 경우 종료
                if (x == 0 && y == 0) {
                    break;
                }
            }
            //잘못 입력된 경우 continue-> input길이 2 아님, x,y가 1~9 사이 아님
            if(input.length()!=2 ||x<=0||x>=SIZE||y<=0||y>=SIZE){
                System.out.println("잘못된 입력입니다 다시 입력해주세요");
                continue;
            }
            //board에 X, O 저장
            board[x][y] = shipBoard[x - 1][y - 1] == 0 ? 'X' : 'O';

            //board 출력
//            for (char[] i : board) {
//                for (char ch : i) {
//                    System.out.printf("%3c",ch);
//                }
//                System.out.println();
//            }
            for (int i = 0; i < SIZE; i++) {
                //char배열은 println했을 때 원소들이 스트링처럼 한번에 나열됨!! board[i]는 char형 1차원 배열
                System.out.println(board[i]);
            }
            System.out.println();
        }


    }




}
