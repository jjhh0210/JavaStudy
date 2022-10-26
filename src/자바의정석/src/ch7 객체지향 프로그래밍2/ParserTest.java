import java.util.Scanner;

public class ParserTest {
    public static void main(String[] args) {
        ////인스턴스 생성&반환 메소드 호출 (static 메소드이므로 호출은 클래스명.메소드())

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        Parseable parser = null;

        if (fileName.endsWith("xml")) {
            parser = ParserManager.getParser("XML"); //parser = new XMLParser();

        }else{
            parser = ParserManager.getParser("HTML"); //parser = new HTMLParser();
        }

        if (parser instanceof XMLParser) {
            XMLParser xmlParser = (XMLParser) parser;   //다운캐스팅
            xmlParser.parse("document.xml");
            int n = xmlParser.n;
            System.out.println("n = " + n);
        } else if (parser instanceof HTMLParser) {
            HTMLParser htmlParser = (HTMLParser) parser;
            htmlParser.parse("document.html");
            int n = htmlParser.n;
            System.out.println("n = " + n);
        }
    }
}

interface Parseable{
    //구문 분석 작업 수행
    void parse(String fileName);    //public abstract void parse(String fileName);
}

class ParserManager{
    //리턴타입이 Parseable인터페이스! -> XMLParser / HTMLParser 인스턴스 리턴해야
    //인스턴스 생성 및 반환 기능 -> 인스턴스 생성 x고도 외부에서 호출가능해야 하므로 static!!
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        }else{
            //Parseable p = new HTMLParser();
            //return p;
            return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable{
    int n = 1;
    public void parse(String fileName) {
        //XMLParser의 구문 분석 수행 코드
        System.out.println(fileName + " - XML parsing completed.");
    }
}
class HTMLParser implements Parseable{
    int n = 2;
    public void parse(String fileName) {
        //XMLParser의 구문 분석 수행 코드
        System.out.println(fileName + " - HTML parsing completed.");
    }
}

