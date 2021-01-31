package C5_ArrayList;

public class Main {
    public static void main(String[] args) {


        MyIntArrayList newObject = new MyIntArrayList();
        newObject.add(12);
        newObject.add(14);
        newObject.add(55);
        newObject.add(30);
        newObject.add(84);
        newObject.add(39);
        newObject.add(14);
        newObject.add(41);
        newObject.add(2,71);
        newObject.add(1,33);
        newObject.add(5,23);

        newObject.printObject();
        System.out.println(newObject.size());
        System.out.println(newObject.contains(41));
        System.out.println(newObject.get(5));
        System.out.println(newObject.indexOf(14));
        System.out.println(newObject.lastIndexOf(14));
        System.out.println(newObject.remove(9));
        System.out.println(newObject.removeElementAtIndex(7));
//        newObject.clear();
        newObject.printObject();
        newObject.set(1,69);

        newObject.printObject();

        MyIntArrayList secondObject = new MyIntArrayList();
        secondObject.add(42);
        secondObject.add(43);
        secondObject.add(44);

        newObject.addAll(secondObject);
        newObject.printObject();

        newObject.addAll(2,secondObject);
        newObject.printObject();

        secondObject.printObject();
        secondObject.trimToSize();
        secondObject.printObject();



    }
}
