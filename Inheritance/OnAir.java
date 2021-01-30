package Inheritance;

public class OnAir extends Vehicle  {
    private int noTurbines;
    private boolean hasFirstClass;

    public OnAir (String serialNumber, int noPersons){
        super(serialNumber,noPersons);
    }
    public OnAir(String serialNumber, int noPersons, String name){
        super(serialNumber,noPersons,name);
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        super(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }
    public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
        super(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
        this.hasFirstClass = hasFirstClass;
    }
    public boolean goTo(double positionX, double positionY){
        System.out.println("Flying the airplane to coordinates: [" + positionX + " " +  positionY + "]");
        return true;
    }
    public boolean addFuel(double amount){
        System.out.println("Adding " + amount + "L of fuel to the airplane");
        return true;
    }
    public void printInfo(){
        System.out.println("Airplane properties:\n"
                + "\t - number of turbines: " + this.noTurbines + "\n");
        if (hasFirstClass) {
            System.out.println("\t - has first class \n");
        } else {
            System.out.println("\t - does not have first class \n");
        }
    }
}
