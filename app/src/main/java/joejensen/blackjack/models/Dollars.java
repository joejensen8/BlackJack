package joejensen.blackjack.models;

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

    public Dollars add(int value) {
        return add((double)value);
    }

    public Dollars add(double value) {
        int wholeValue = (int) value;
        int decimalValue = (int)((value - (double)wholeValue) * 100);
        this.wholeValue += wholeValue;
        this.decimalValue += decimalValue;
        moveOverflowDecimalToWhole();
        return this;
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

    public Dollars subtract(int value) {
        return add(-1 * value);
    }

    Dollars subtract(double value) {
        return add(-1 * value);
    }

    Dollars add(Dollars d) {
        this.wholeValue += d.wholeValue;
        this.decimalValue += d.decimalValue;
        moveOverflowDecimalToWhole();
        return this;
    }

    public Dollars subtract(Dollars d) {
        this.wholeValue -= d.wholeValue;
        this.decimalValue -= d.decimalValue;
        moveOverflowDecimalToWhole();
        return this;
    }

    public void clear() {
        this.wholeValue = 0;
        this.decimalValue = 0;
    }

    public Dollars getHalf() {
        int wholeVal = this.wholeValue / 2;
        int decVal = this.decimalValue / 2;
        decVal += ((double)this.wholeValue / 2.0 - wholeVal) * 100;
        Dollars d = new Dollars(wholeVal, decVal);
        d.moveOverflowDecimalToWhole();
        return d;
    }

    public Dollars getFifth() {
        int wholeVal = this.wholeValue / 5;
        int decVal = this.decimalValue / 5;
        decVal += ((double)this.wholeValue / 5.0 - wholeVal) * 100;
        Dollars d = new Dollars(wholeVal, decVal);
        d.moveOverflowDecimalToWhole();
        return d;
    }

}
