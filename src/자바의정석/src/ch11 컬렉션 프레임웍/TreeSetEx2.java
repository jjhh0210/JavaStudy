import java.util.TreeSet;

public class TreeSetEx2 {
    /*subSet,headSet,tailSet*/
    public static void main(String[] args) {
        //subSet,headSet,tailSet은 TreeSet에만 있는 메서드이므로
        //참조변수 타입 TreeSet으로 맞춰야함!
        TreeSet set = new TreeSet();
        int[] score = {20, 60, 42, 38, 94, 100, 51, 50};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }

        System.out.println("50보다 작은값: "+set.headSet(50));
        System.out.println("50보다 큰값: " + set.tailSet(50));
        System.out.println("30~60 사이의 값: " + set.subSet(30, 60));
    }
}
