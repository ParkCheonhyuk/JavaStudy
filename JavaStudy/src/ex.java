import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import quiz.D07_PhoneBook.Info;
 
public class ex {
    static HashMap<String, HashMap<String, Info>> phoneBook = new HashMap();
 
    public static void main(String[] args) {
        addPhoneNo("친구", "임승한", "010-0000-0001");
        addPhoneNo("친구", "홍길동", "010-0000-0002");
        addPhoneNo("친구", "아무개", "010-0000-0003");
        addPhoneNo("회사", "김사원", "010-0000-0004");
        addPhoneNo("회사", "이사원", "010-0000-0005");
        addPhoneNo("회사", "나사원", "010-0000-0006");
        addPhoneNo("회사", "인사원", "010-0000-0007");
        addPhoneNo("세탁", "010-0000-0000");
 
        printList();
    }
 
    private static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }
 
    private static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }
 
    private static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    private static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
 
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
 
            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
 
            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
 
            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
 
            }
 
            System.out.println();
        }
    }
}