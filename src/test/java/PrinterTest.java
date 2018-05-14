import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(100, printer.sheetsLeft());
    }

    @Test
    public void canPrint(){
        assertEquals(20 & 120, printer.print(4, 20));
    }

    @Test
    public void canNotPrint(){
        assertEquals(100, printer.print(30, 400));
    }

    @Test
    public void canRefillPaper(){
        Printer emptyPrinter = new Printer(0, 200);
        assertEquals(100, emptyPrinter.refill());
    }

    @Test
    public void canPrintTonerTest(){
        assertEquals(0 & 100, printer.print(2,50));
    }

}
