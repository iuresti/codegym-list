package codegym.collections;

import codegym.collections.list.ArrayList;
import codegym.collections.list.LinkedList;
import codegym.collections.list.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Float> listFloats = new LinkedList<>();

        list.add("1");
        list.add("cadenas");

        listFloats.add(1.1f);
        listFloats.add(3.1f);

        print(list);

        print(listFloats);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toUpperCase());
        }

        for (int i = 0; i < listFloats.size(); i++) {
            System.out.println(listFloats.get(i));
        }
    }

    public static void print(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
