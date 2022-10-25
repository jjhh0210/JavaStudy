import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*전화번호부 만들기*/
public class HashMapEx3 {
    static HashMap<String,HashMap> phoneBook = new HashMap();

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap telMap = phoneBook.get(groupName);
        telMap.put(tel, name);  //이름은 중복 가능, 전화번호는 중복 x이므로 key
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타",name,tel);
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
    }
    static void printList() {
        Set<Map.Entry<String, HashMap>> entrySet = phoneBook.entrySet();
        Iterator<Map.Entry<String, HashMap>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, HashMap> e = it.next();
            String groupName = e.getKey();
            Set subset = e.getValue().entrySet();

            System.out.println("* "+groupName+"["+subset.size()+"]");
            Iterator subIt = subset.iterator();
            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                System.out.println(subE.getValue() + ": " + subE.getKey());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        addPhoneNo("가족","아빠","010-111-11111");
        addPhoneNo("가족","엄마","010-222-2222");
        addPhoneNo("가족","동생","010-333-3333");
        addPhoneNo("친구","김세모","010-444-4444");
        addPhoneNo("친구","김세모","010-555-5555");
        addPhoneNo("회사","김대리","010-666-6666");
        addPhoneNo("회사","김대리","010-777-7777");
        addPhoneNo("회사","이과장","010-888-8888");
        addPhoneNo("회사","박과장","010-999-9999");
        addPhoneNo("세탁소","031-111-1111");
        addPhoneNo("bbq","031-222-2222");

        printList();
    }
}
