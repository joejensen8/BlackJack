package joejensen.blackjack;

public class Dollars {

    // todo switch from int to BigInteger
    private int wholeValue;
    private int decimalValue;

    public Dollars() {
        this(0, 0);
    }

    public Dollars(double value) {
        this(0, 0);
        this.add(value);
    }

    public Dollars(int value) {
        this(0, 0);
        this.add(value);
    }

    private Dollars(int wholeValue, int decimalValue) {
        this.decimalValue = decimalValue;
        this.wholeValue = wholeValue;
    }

    private void moveOverflowDecimalToWhole() {
        if (this.decimalValue > 99) {
            this.decimalValue -= 100;
            this.wholeValue += 1;
            if (this.decimalValue > 99) {
                moveOverflowDecimalToWhole();
            }
        } else if (this.decimalValue < 0) {
            this.decimalValue += 100;
            this.wholeValue -= 1;
            if (this.decimalValue < 0) {
                moveOverflowDecimalToWhole();
            }
        }
    }

    public void add(int value) {
        add((double)value);
    }

    public void add(double value) {
        int wholeValue = (int) value;
        int decimalValue = (int)((value - (double)wholeValue) * 100);
        this.wholeValue += wholeValue;
        this.decimalValue += decimalValue;
        moveOverflowDecimalToWhole();
    }

    public String toString() {
        moveOverflowDecimalToWhole();
        return this.wholeValue + "." + this.decimalValue;
    }

    public double getValue() {
        double val = this.wholeValue;
        val += ((double)this.decimalValue)/100;
        return val;
    }

    public void subtract(int value) {
        add(-1 * value);
    }

    public void subtract(double value) {
        add(-1 * value);
    }

    public void add(Dollars d) {
        this.wholeValue += d.wholeValue;
        this.decimalValue += d.decimalValue;
        moveOverflowDecimalToWhole();
    }

    public void subtract(Dollars d) {
        this.wholeValue -= d.wholeValue;
        this.decimalValue -= d.decimalValue;
        moveOverflowDecimalToWhole();
    }


}
