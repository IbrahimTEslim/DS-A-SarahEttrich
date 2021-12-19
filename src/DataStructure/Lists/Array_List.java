package DataStructure.Lists;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] arg)
    {
        List<String> list=new ArrayList<String>();

        list.add("Str 1");
        list.add("Str 2");
        list.add("Str 3");
        list.add("Str 4");
        list.add("Str 5");

        System.out.println(list.size());

        list.remove(4);

        System.out.println(list.get(3));

        System.out.println(list.indexOf("Str 1"));

//        list.forEach(String -> System.out.println(list));
        System.out.println(list);

    }
}
