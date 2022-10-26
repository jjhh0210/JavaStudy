public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(1773121);
        Person p2 = new Person(1773121);
        //p1,p2 주소값 비교
        if (p1 == p2) {
            System.out.println("p1과 p2는 같은 사람");
        } else {
            System.out.println("p1과 p2는 다른 사람");
        }
        //p1,p2 id값 비교
        if (p1.equals(p2)) {
            System.out.println("p1와 p2는 같은 사람");
        }else{
            System.out.println("p1와 p2는 다른 사람");
        }
    }
}

class Person {
    long id;

    //equals를 오버라이딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;  //obj가 Object타입이므로 id값을 참조하기 위해서는 Person으로 형변환 필수
        }else{
            return false; //타입이 Person이 아니면 비교할 필요도 없음
        }
    }

    Person(long id) {
        this.id = id;
    }
}
