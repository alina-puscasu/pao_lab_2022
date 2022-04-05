package generice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WhyUseWildcards {

    public static void main(String[] args) {
        String s = "";
        Object o;
        o = s; // allowed

        // GenericStructure<ChildType> nu este subtip/subclasa pentru GenericStructure<ParentType>
        List<String> stringList = new ArrayList<>();
        List<Object> objectList;
//        objectList = stringList; // not allowed

        List<Object> anotherObjectList = new ArrayList<>();
        List<Box> boxes = new ArrayList<>();

        stringList.add("String");
        anotherObjectList.add("String2");
        anotherObjectList.add(1);
        Box<String, String> box = new Box<>();
        box.add("t field value", "s field value");
        boxes.add(box);

        printCollection(stringList);
        printCollectionWithGeneric(stringList);

        printCollection(anotherObjectList);
        printCollectionWithGeneric(anotherObjectList);

        printCollection(boxes);
        printCollectionWithGeneric(boxes);
    }

    static void printCollection(Collection<?> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    static <T> void printCollectionWithGeneric(Collection<T> collection) {
        for (T object : collection) {
            System.out.println(object);
        }
    }
}
