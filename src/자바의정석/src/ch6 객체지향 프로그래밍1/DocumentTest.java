public class DocumentTest {
    public static void main(String[] args) {
        //문서 생성될 때 시나리오!
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }

}
class Document{
    static int count = 0; //문서명 입력 안했을 때 제목없음1,제목없음2 이렇게 저장하려고
    String name; //문서명

    Document() {
        //문서명 입력 안했을 때!
        this("제목없음"+(++count));
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 "+this.name+"이 생성되었습니다.");
    }
    
}
