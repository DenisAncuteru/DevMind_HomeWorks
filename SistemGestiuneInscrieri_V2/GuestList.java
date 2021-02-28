package SistemGestiuneInscrieri_V2;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestList{

    private final int eventCapacity;
    private ArrayList<Guest> onTheEvent;
    private ArrayList<Guest> onTheWaitingList;
    private int validRegistrationCounter;
    private int onWaitingCounter;
    private Guest curentGuest;


    public int getEventCapacity() {
        return eventCapacity;
    }

    public int getValidRegistrationCounter() {
        return validRegistrationCounter;
    }

    public void setValidRegistrationCounter() {
        this.validRegistrationCounter += 1;
    }

    public int getOnWaitingCounter() {
        return onWaitingCounter;
    }

    public void setOnWaitingCounter() {
        this.onWaitingCounter += 1;
    }

    public Guest getCurentGuest() {
        return curentGuest;
    }

    public void setCurentGuest(Guest curentGuest) {
        this.curentGuest = curentGuest;
    }

    public GuestList(int eventCapacity){

        this.eventCapacity = eventCapacity;
        this.onTheEvent = new ArrayList<Guest>(eventCapacity);
        this.onTheWaitingList = new ArrayList<Guest>();
        this.validRegistrationCounter = 0;
        this.onWaitingCounter = 0;
    }


    public int add(Guest guest){

        if(!checkByPhone(guest.getPhoneNumber())){
            if(validRegistrationCounter < eventCapacity){
                onTheEvent.add(guest);
                System.out.println("Felicitari! Locul tau la eveniment a fost rezervat. Te asteptam!");
                setValidRegistrationCounter();
                return 0;
            }else{
                onTheWaitingList.add(guest);
                System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine: "
                        + getOnWaitingCounter() + " Te vom notifica imediat cum un loc devine disponibil.");
                setOnWaitingCounter();
                return getOnWaitingCounter();


            }
        }
        System.out.println("Esti deja inscris la eveniment! Anunta-ti prietenii pentru a veni impreuna!");
        return -1;
    }

    public boolean checkByPhone(int phoneNumber) {
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getPhoneNumber() == phoneNumber) {
                System.out.println("Person already registred on the event.");
                return true;
            }
        }

        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getPhoneNumber() == phoneNumber) {
                System.out.println("Person already registred on the waiting list.");
                return true;
            }
        }
        return false;
    }
    public boolean checkByEmail(String email) {
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getEmail() == email) {
                System.out.println("Person already registred on the event.");
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getEmail() == email) {
                System.out.println("Person already registred on the waiting list.");
                return true;
            }
        }
        System.out.println("Person not found on event or waiting list.");
        return false;
    }

    public boolean checkByName(String firstName, String secondName) {
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getFirstName().equals(firstName) &&
                onTheEvent.get(i).getLastName().equals(secondName)) {
                System.out.println("Person already registred on the event.");
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getFirstName().equals(firstName) &&
                onTheWaitingList.get(i).getLastName().equals(secondName)) {
                System.out.println("Person already registred on the waiting list.");
                return true;
            }
        }
        return false;
    }

    public boolean removeByPhone(int phoneNumber){

        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getPhoneNumber() == phoneNumber) {
                onTheEvent.remove(i);
                System.out.println("Eliminat cu succes din lista de participanti");
                add(onTheWaitingList.get(0));
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getPhoneNumber() == phoneNumber) {
                onTheWaitingList.remove(i);
                System.out.println("Eliminat cu succes din lista de asteptare");
                return true;
            }
        }
        System.out.println("Nu am gasit persoana inscrisa la eveniment sau in lista de asteptare.");
        return false;
    }

    public boolean removeByEmail(String email){

        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getEmail().equals(email)) {
                onTheEvent.remove(i);
                System.out.println("Eliminat cu succes din lista de participanti");
                add(onTheWaitingList.get(0));
                return true;
            }
        }

        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getEmail().equals(email)) {
                onTheWaitingList.remove(i);
                System.out.println("Eliminat cu succes din lista de asteptare");
                return true;
            }
        }
        System.out.println("Nu am gasit persoana inscrisa la eveniment sau in lista de asteptare.");
        return false;


    }

    public boolean removeByName(String firstName, String lastName){
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getFirstName().equals(firstName) &&
                    onTheEvent.get(i).getLastName().equals(lastName)) {
                onTheWaitingList.remove(i);
                System.out.println("Eliminat cu succes din lista de participanti");
                add(onTheWaitingList.get(0));
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getFirstName().equals(firstName) &&
                    onTheWaitingList.get(i).getLastName().equals(lastName)) {
                onTheWaitingList.remove(i);
                System.out.println("Eliminat cu succes din lista de asteptare");
                return true;
            }
        }
        System.out.println("Nu am gasit persoana inscrisa la eveniment sau in lista de asteptare.");
        return false;
    }

    public boolean updateName(String firstName, String lastName,String newFirstName, String newLastName){
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getFirstName().equals(firstName) &&
                    onTheEvent.get(i).getLastName().equals(lastName)) {
                onTheEvent.get(i).setFirstName(newFirstName);
                onTheEvent.get(i).setLastName(newLastName);
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getFirstName().equals(firstName) &&
                    onTheWaitingList.get(i).getLastName().equals(lastName)) {
                onTheWaitingList.get(i).setFirstName(newFirstName);
                onTheWaitingList.get(i).setLastName(newLastName);
                return true;
            }
        }
        return false;
    }

    public boolean updatePhoneNumber(int phoneNumber, int newPhoneNumber){
        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getPhoneNumber() == phoneNumber) {
                onTheEvent.get(i).setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getPhoneNumber() == phoneNumber) {
                onTheWaitingList.get(i).setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmailAdress(String emailAdress, String newEmailAdress){

        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getEmail().equals(emailAdress)) {
                onTheEvent.get(i).setEmail(newEmailAdress);
                return true;
            }
        }
        for (int i = 0; i < onTheWaitingList.size(); i++) {
            if (onTheWaitingList.get(i).getEmail().equals(emailAdress)) {
                onTheWaitingList.get(i).setEmail(newEmailAdress);
                return true;
            }
        }
        return false;
    }
    public String toString(){

        return this.curentGuest.toString();
    }

    public void guestList() {
         for (int i = 0; i < onTheEvent.size(); i++) {
            System.out.println(onTheEvent.get(i).toString());
        }
    }

    public void waitingList(){
        for(int i = 0; i < onTheWaitingList.size(); i++){
            System.out.println(onTheWaitingList.get(i).toString());
        }
    }

    public void available(){
        System.out.println(getEventCapacity() - getValidRegistrationCounter());
    }

    public void guestsNo(){
        System.out.println(getValidRegistrationCounter());
    }

    public void waitlingListNo(){
        System.out.println(getOnWaitingCounter());
    }

    public void subscribeNo(){
        System.out.println(getOnWaitingCounter() + getValidRegistrationCounter());
    }
    public void search(String str) {

        for (int i = 0; i < onTheEvent.size(); i++) {
            if (onTheEvent.get(i).getEmail().contains(str)) {
                System.out.println("Contact " + i + " contine  email: " +  onTheEvent.get(i).getEmail());
            } else if (onTheEvent.get(i).getFirstName().contains(str)) {
                System.out.println("Contact " + i + " contine nume: " +  onTheEvent.get(i).getFirstName());
            } else if (onTheEvent.get(i).getLastName().contains(str)) {
                System.out.println("Contact " + i + " contine prenume: " +  onTheEvent.get(i).getLastName());
            }
        }
    }





//    @Override
//    public boolean equals(Object obj){
//        return this.curentGuest.equals(obj);
//    }




}
