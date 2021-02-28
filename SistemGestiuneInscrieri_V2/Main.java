package SistemGestiuneInscrieri_V2;

import Sistem_Gestiune_Inscrieri.IGuestListManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static int eventCapacity;
    static  GuestList guestList;

    public static void showDefaultMenu(){
        System.out.println("" +
                "            \"help         - Afiseaza aceasta lista de comenzi" + "\n" +
                "            \"add          - Adauga o noua persoana (inscriere)" + "\n" +
                "            \"check        - Verifica daca o persoana este inscrisa la eveniment" + "\n" +
                "            \"remove       - Sterge o persoana existenta din lista" + "\n" +
                "            \"update       - Actualizeaza detaliile unei persoane" + "\n" +
                "            \"guests       - Lista de persoane care participa la eveniment" + "\n" +
                "            \"waitlist     - Persoanele din lista de asteptare" + "\n" +
                "            \"available    - Numarul de locuri libere" + "\n" +
                "            \"guests_no    - Numarul de persoane care participa la eveniment" + "\n" +
                "            \"waitlist_no  - Numarul de persoane din lista de asteptare" + "\n" +
                "            \"subscribe_no - Numarul total de persoane inscrise" + "\n" +
                "            \"search       - Cauta toti invitatii conform sirului de caractere introdus" + "\n" +
                "            \"quit         - Inchide aplicatia\";");

    }

    public static int searchCriteria(){
        System.out.println("Te rog sa introduci numarul aferent criteriului dupa care doresti sa faci actiunea?\n" +
                "1.Nume si Prenume\n" + "2.Email\n" + "3.Numar de telefon" );
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.println("Not a valid input, please try again");
                break;
        }
        if (input < 1 || input > 3){
            searchCriteria();
        }
        return -1;
    }

//
    public static void command(String keyword, GuestList guestList) {
        Scanner sc = new Scanner(System.in);
        keyword = keyword.toLowerCase();

        switch (keyword) {
            case "help":
                showDefaultMenu();
                break;
            case "add":
                System.out.println("Se adauga o noua persoana..." + "\n" + "Introduceti numele de familie:");
                String name = sc.next();
                System.out.println("Introduceti prenumele:");
                String surname = sc.next();
                System.out.println("Introduceti email:");
                String mailAdress = sc.next();
                System.out.println("Introduceti numarul de telefon:");
                int phone = sc.nextInt();
                Guest guest = new Guest(surname,name,mailAdress,phone);
                guestList.add(guest);
                break;
            case "remove":
                switch (searchCriteria()){
                    case 1:
                        System.out.println("Introdu PRENUMELE:");
                        String lastName = sc.nextLine();
                        System.out.println("Introdu NUMELE");
                        String firstName = sc.nextLine();
                        guestList.removeByName(firstName,lastName);
                    case 2:
                        System.out.println("Introdu adresa de email:");
                        String email = sc.next();
                        guestList.removeByEmail(email);
                    case 3:
                        System.out.println("Introdu numarul de telefon:");
                        int phoneNumber = sc.nextInt();
                        guestList.removeByPhone(phoneNumber);
                    default:
                        System.out.println("Not a valid command");
                        break;
                }
                break;
            case "check":
                switch (searchCriteria()){
                    case 1:
                        System.out.println("Introdu PRENUMELE:");
                        String lastName = sc.nextLine();
                        System.out.println("Introdu NUMELE");
                        String firstName = sc.nextLine();
                        guestList.checkByName(firstName,lastName);
                        break;
                    case 2:
                        System.out.println("Introdu adresa de email:");
                        String email = sc.next();
                        guestList.checkByEmail(email);
                        break;
                    case 3:
                        System.out.println("Introdu numarul de telefon:");
                        int phoneNumber = sc.nextInt();
                        guestList.checkByPhone(phoneNumber);
                        break;
                    default:
                        System.out.println("Not a valid command");
                        break;
                }
                break;
            case "update":
                switch (searchCriteria()){
                    case 1:
                        System.out.println("Introdu PRENUMELE:");
                        String lastName = sc.nextLine();
                        System.out.println("Introdu NUMELE");
                        String firstName = sc.nextLine();
                        System.out.println("Acum te rog sa introduci noul nume dupa cum urmeaza:" + "\n Prenume:");
                        String newLastName = sc.nextLine();
                        System.out.println("Nume:");
                        String newFirstName = sc.nextLine();
                        guestList.updateName(firstName,lastName,newFirstName,newLastName);
                        break;
                    case 2:
                        System.out.println("Introdu adresa de email existenta:");
                        String email = sc.nextLine();
                        System.out.println("Introdu noua adresa de email:");
                        String newEmail = sc.nextLine();
                        guestList.updateEmailAdress(email,newEmail);
                        break;
                    case 3:
                        System.out.println("Introdu numarul de telefon existent:");
                        int phoneNumber = sc.nextInt();
                        System.out.println("Introdu noul numar de telefon:");
                        int newPhoneNumber = sc.nextInt();
                        guestList.updatePhoneNumber(phoneNumber,newPhoneNumber);
                        break;
                    default:
                        System.out.println("Not a valid command");
                        break;
                }
                break;
            case "guests":
                guestList.guestList();
                break;
            case "waitlist":
                guestList.waitingList();
                break;
            case "available":
                guestList.available();
                break;
            case "guest_No":
                guestList.guestsNo();
                break;
            case "waitlist_No":
                guestList.waitlingListNo();
                break;
            case "subscribe_No":
                guestList.subscribeNo();
                break;
            case "search":
                System.out.println("Te rog sa introduci subsirul pentru cautare:");
                String str = sc.nextLine();
                guestList.search(str);
                break;
            default:
                System.out.println("Not a valid command, try Again");
                break;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Bun venit! Te rog sa introduci capacitatea evenimentului pe care doresti sa-l creezi");
//        int eventCapacity = sc.nextInt();
//        guestList = new GuestList(eventCapacity);
//        System.out.println("Ce doresti sa faci in continuare?");
//        showDefaultMenu();
//        boolean startProgram = true;

//        while (startProgram){
//            String keyword = sc.nextLine();
//            if(keyword.equals("quit")){
//                System.out.println("La revedere!");
//                startProgram = false;
//            }else{
//                command(keyword, guestList);
//                System.out.println("Astept o noua actiune, daca vrei sa vezi meniul poti scrie \" help \"");
//            }
//
//        }


//       command("help",guestList);


//        switch (keyword) ?{
//            case "add":
//                guestList//.add();
//        }

//        command(keyword);

        GuestList event = new GuestList(3);
        Guest guest1 = new Guest("Ancuteru","denis","denis",123234);
        Guest guest2 = new Guest("denis","denis","denis",4123);
        Guest guest3 = new Guest("denis","cuteanu","denis",143234);
        Guest guest4 = new Guest("denis","denis","cutcut",1234);
        event.add(guest1);
        event.add(guest2);
        event.add(guest3);
        event.add(guest4);
//
//        guestList.search("cut");



//        System.out.println(event.add());
//        System.out.println(event.add());
//        System.out.println(event.add());
//        event.remove(1234);
//        event.guestList();




    }
}
