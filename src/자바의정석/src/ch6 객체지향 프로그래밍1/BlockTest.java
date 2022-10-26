public class BlockTest {
    public static void main(String[] args) {
        System.out.println("BlockTest blockTest = new BlockTest();");   //2
        BlockTest blockTest = new BlockTest();
        System.out.println("BlockTest blockTest2 = new BlockTest();");  //5
        BlockTest blockTest2 = new BlockTest();

    }

    static{
        System.out.println("static { }");   //1
    }
    {
        System.out.println("{ }");  //3,6
    }

    BlockTest() {
        System.out.println("생성자");
    }   //4,7
    
}
