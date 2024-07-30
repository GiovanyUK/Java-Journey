public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, 0, false);
        Printer printer2 = new Printer(50, 0, true);

        printer1.isDuplex();
        System.out.println(printer1.getTonerLevel());
        printer1.printPages(15);
        System.out.println(printer1.getTonerLevel());
        printer1.printPages(15);
        System.out.println(printer1.getTonerLevel());
        printer1.printPages(15);
        System.out.println(printer1.getTonerLevel());
        printer1.printPages(15);


        System.out.println();
        printer2.isDuplex();
        printer2.printPages(1);
        System.out.println(printer2.getTonerLevel());
        printer2.printPages(10);
        System.out.println(printer2.getTonerLevel());
        printer2.printPages(10);







    }
}
