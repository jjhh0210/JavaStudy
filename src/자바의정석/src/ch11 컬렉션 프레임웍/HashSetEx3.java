import java.util.HashSet;
import java.util.Objects;
/*내가만든 클래스의 객체를 중복없이 set에 추가하는 법
* -> equals(), hashCode()를 오버라이딩하라
* */
public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); //중복 제거 완료!
        set.add(new Person("박", 10));
        set.add(new Person("박", 10));   //중복제거 완료!

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
