package Inheritance;

public class Main {
    public static void main(String[] args) {

    Vehicle automobil = new Vehicle("212vdsdadf321", 5, "OCTAVIA");
    OnRoad landCruiser = new OnRoad("1234FDSSA", 7, "Toyota",4,5);
    OnAir boeing = new OnAir("fly747", 98, "airbus",4,true);
    OnWater yacht = new OnWater("water999",10,"SeaDream",2,500);


    automobil.goTo(12.35,114.43);
    automobil.addFuel(55.5);
    automobil.printInfo();

    landCruiser.goTo(27.990457994926352, 86.92384776789397);
    landCruiser.addFuel(77.3);
    landCruiser.printInfo();

    boeing.goTo(40.735885904515634, -74.0944223672475);
    boeing.addFuel(1732.0);
    boeing.printInfo();

    yacht.goTo(39.58979141093879, 2.632256151224653);
    yacht.addFuel(345.4);
    yacht.printInfo();
    }
}
