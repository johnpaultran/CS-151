package sorting_examples.sort1;

import java.util.HashSet;

public class TestEquals {
    public static void main(String[] args) {

        Element e1 = new Element(1);

        Element e2 = new Element(1);
        //Element e3 = e1;

        HashSet<Element> items = new HashSet<>();

        items.add(e1);


        System.out.println(items.contains(e1));
    }
}

class Element {
    int id;

    public Element(int id) {
        this.id = id;
    }

    // It is overloading
//    public boolean equals(Element obj) {
//        return this.id == obj.id;
//    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Element) {
            Element other = (Element) obj;
            return this.id == other.id;
        }
       return false;
    }
}
