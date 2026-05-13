package oop2.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        // thePC.getComputerCase().pressPowerButton();
        // thePC.getMotherboard().loadProgram("Fedora Linux 44 Workstation Edition");
        // thePC.getMonitor().drawPixelAt(256, 512, "red");

        thePC.powerUp();

    }
}
