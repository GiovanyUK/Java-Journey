public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("Antares",
                "Aqirys", "550");
        Monitor theMonitor = new Monitor("Odyssey G5",
                "Samsung", 27,
                "2560 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("X570", "MSI",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("Antares", "Aqirys",
                theCase, theMonitor, theMotherBoard);
        System.out.println(thePC);
        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherBoard().loadProgram("Linux OS");
//        thePC.getComputerCase().pressPowerButton();
    }
}
