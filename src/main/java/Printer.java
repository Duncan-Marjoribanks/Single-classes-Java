public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }


    public int sheetsLeft() {
        return this.sheetsLeft;
    }

    public int print(int numberOfDocs, int pagesPerDoc) {
        int printRequest = numberOfDocs * pagesPerDoc;
        int canPrint;
        if (printRequest <= this.sheetsLeft)
        {
            return (this.sheetsLeft - printRequest) & (this.tonerVolume - printRequest);
        }
        return this.sheetsLeft;
    }

    public int refill() {
        return this.sheetsLeft + 100;
    }

}
