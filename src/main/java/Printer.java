public class Printer {
    private int no_of_sheets_left;

    public Printer(int no_of_sheets_left){
        this.no_of_sheets_left = no_of_sheets_left;
    }

    public int getNo_of_sheets_left() {
        return this.no_of_sheets_left;
    }


    public String print(int no_of_pages, int no_of_copies) {
        if (this.no_of_sheets_left >= no_of_pages * no_of_copies){
            no_of_sheets_left -= no_of_pages * no_of_copies;
            return "Print successful!";
        }
        return "Not enough sheets to print!";
    }

    public void refill(int sheets_to_add) {
        this.no_of_sheets_left += sheets_to_add;
    }
}
