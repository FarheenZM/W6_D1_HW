public class Runner {
    public static void main(String[] args) {

        // calculator
        Calculator calculator = new Calculator(8, 3);
        System.out.println("Result of adding 8 & 3 is " + calculator.add());


        // waterbottle
        Waterbottle waterbottle = new Waterbottle();
        waterbottle.drink();
        System.out.println("Volume after drink is " + waterbottle.getVolume());

        // printer
        Printer printer = new Printer(30);
        System.out.println(printer.print(6, 4));
        System.out.println("No. of sheets left = " + printer.getNo_of_sheets_left());
        printer.refill(4);
        System.out.println("No. of sheets after refill = " + printer.getNo_of_sheets_left());
    }
}
