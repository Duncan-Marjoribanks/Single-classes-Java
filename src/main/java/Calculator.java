public class Calculator {
    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return this.numberOne;
    }

    public int getNumberTwo() {
        return this.numberTwo;
    }

    public int add() {
        return this.numberOne + this.numberTwo;
    }


    public int subtract() {
        return this.numberOne - this.numberTwo;
    }

    public int multiply() {
        return this.numberOne * this.numberTwo;
    }

    public int divide() {
        return this.numberOne / this.numberTwo;
    }
}
