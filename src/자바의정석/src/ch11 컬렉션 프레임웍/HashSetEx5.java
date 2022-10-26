import java.util.HashSet;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();

        for (int i = 1; i < 6; i++) {
            setA.add(i);    //A = [1,2,3,4,5]
        }
        for (int i = 4; i < 9; i++) {
            setB.add(i);    //B = [4,5,6,7,8]
        }

//        setA.retainAll(setB);   //교집합 [4,5]
//        setA.addAll(setB);    //합집합 [1,2,3,4,5,6,7,8]
        setA.removeAll(setB); //차집합 [1,2,3]
        System.out.println("setA = " + setA);
    }
}
