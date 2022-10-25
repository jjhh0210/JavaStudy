public class CastingTest {
    public static void main(String[] args) {

    }
}
class Building{
    int height; //층

    Building() {
        this(5);
    }

    Building(int height) {
        this.height = height;
    }
}

class School extends Building{
    int classes;    //반 몇개
    int students;   //학생 수

    School() {
        this(30, 3000);

    }

    School(int classes, int students) {
        super(10);
        setClasses(classes);
        setStudents(students);
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    int studentsByClass() {
        //한 반에 학생 몇명 수용 가능?
        return students / classes;
    }

}

class ElementarySchool extends School {
    int crosswalks = 2; //횡단보도 갯수

}
