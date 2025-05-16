package codegym.collections;

import codegym.collections.list.ArrayList;
import codegym.collections.list.Iterator;
import codegym.collections.list.LinkedList;
import codegym.collections.list.List;

public class MainInnerClass {
    public static void main(String[] args) {

        List<String> nombres = dameListaLinked();
        //List<String> nombres = dameListaArray();

        Iterator<String> iterator = nombres.iterator();

        while(iterator.hasNext()){
            String value = iterator.next();

            System.out.println(value);
        }
    }

    private static List<String> dameListaLinked() {
        List<String> lista = new LinkedList<>();

        lista.add("Adrian");
        lista.add("Chema");
        lista.add("Enrique");
        lista.add("Jefferson");
        lista.add("Jesus");
        lista.add("Luix");

        return lista;
    }

    private static List<String> dameListaArray() {
        List<String> lista = new ArrayList<>();

        lista.add("Stivenson");
        lista.add("Rodrigo");
        lista.add("Osvaldo");
        lista.add("Oscar");
        lista.add("Olga");
        lista.add("Mauricio");

        return lista;
    }
}
