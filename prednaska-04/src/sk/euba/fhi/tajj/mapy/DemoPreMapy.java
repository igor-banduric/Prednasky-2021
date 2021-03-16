package sk.euba.fhi.tajj.mapy;

import sk.euba.fhi.tajj.exceptions.MojaVynimka;

import java.util.*;

public class DemoPreMapy<T> {
    T atribut;

    public T mojaGenerickaMetoda(T parameter) {
        T retVal = null;

        return retVal;
    }

    public static void main(String[] args) {
        DemoPreMapy<String> demoPreMapy = new DemoPreMapy();
        int poleInt[];

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);

        Set<String> set = new TreeSet();
        set.add("2");
        set.add("4");

        Map<Integer, String> map = new HashMap();
        map.put(1, "prvy");
        map.put(5, "druhy");


        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        Iterator iterator = list.iterator();

        for (; iterator.hasNext(); ) {
            iterator.next();
        }

    }


}
