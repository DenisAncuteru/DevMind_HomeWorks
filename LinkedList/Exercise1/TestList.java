package LinkedList.Exercise1;

public class TestList {

    public static void main(String[] args) {

        OrderedList<Towns> orderedTownsList = new OrderedList<>();

        // populate list with towns:
//        orderedTownsList.addInOrderedList("Suceava");
//        orderedTownsList.addInOrderedList("Cluj");
//        orderedTownsList.addInOrderedList("Targu Jiu");
//        orderedTownsList.addInOrderedList("Bucuresti");
//
//        System.out.println(orderedTownsList);
//
//        orderedTownsList.addInOrderedList("Brasov");
//        orderedTownsList.addInOrderedList("Bacau");
//        orderedTownsList.addInOrderedList("Suceava");
//        orderedTownsList.addInOrderedList("Bucuresti");
//        orderedTownsList.addInOrderedList("Brasov");
//        orderedTownsList.addInOrderedList("Brasov");
//
//        System.out.println(orderedTownsList);

        Towns newTown = new Towns("Suceava", 350);
        Towns newTown1 = new Towns("Bucuresti", 10);
        Towns newTown2 = new Towns("Bacau", 278);
        Towns newTown3 = new Towns("Brasov", 125);
        Towns newTown4 = new Towns("Targu Jiu", 450);
        Towns newTown5 = new Towns("Bagdad", 1254);
        Towns newTown6 = new Towns("Acasa", 1);


        orderedTownsList.addInOrderedList(newTown);
        orderedTownsList.addInOrderedList(newTown1);
        orderedTownsList.addInOrderedList(newTown2);
        orderedTownsList.addInOrderedList(newTown3);
        orderedTownsList.addInOrderedList(newTown4);
        orderedTownsList.addInOrderedList(newTown5);
        orderedTownsList.addInOrderedList(newTown6);

        System.out.println(orderedTownsList);


    }
}
