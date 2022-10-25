import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"말티즈", "푸들", "말티즈", "푸들", "비글"
                , "말티즈", "푸들", "푸들", "치와와", "비글"
                , "비숑", "치와와", "푸들"};
        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            if (!map.containsKey(data[i])) {
                map.put(data[i], 1);
            }else {
                int num = (int)map.get(data[i]);
                map.replace(data[i], ++num);
            }
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            int num = (int) e.getValue();
            System.out.println(e.getKey()+ " : " +printBar('♥',num)+num);
        }
    }

    public static String printBar(char ch , int num) {
        String bar = "";
        for (int i = 0; i < num; i++) {
            bar += ch;
        }
        return bar + " ";
    }
}
