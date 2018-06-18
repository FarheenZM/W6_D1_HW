import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30);
    }

    @Test
    public void sheetsLeft(){
        assertEquals(30, printer.getNo_of_sheets_left());
    }

    @Test
    public void printSuccessful(){
    assertEquals("Print successful!", printer.print(5, 3));
    assertEquals(15, printer.getNo_of_sheets_left());
    }

    @Test
    public void printFailure(){
        assertEquals("Not enough sheets to print!", printer.print(5, 10));
        assertEquals(30, printer.getNo_of_sheets_left());
    }

    @Test
    public void refill(){
        printer.refill(10);
        assertEquals(40, printer.getNo_of_sheets_left());
    }
}
