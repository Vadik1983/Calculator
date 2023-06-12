public class UserInput extends Calculator {
    private double numberA = 0;
    private double numberB = 0;

    public UserInput(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    @Override
    public String toString() {
        return String.valueOf(numberA) + String.valueOf(numberB);
    }

}
