public class Actions extends UserInput{
    public char x;

    public Actions(double numberA, double numberB, char x) {
        super(numberA, numberB);
        this.x = x;
    }

    public double getResult() {
        return switch (x) {
            case '+' -> getNumberA() + getNumberB();
            case '-' -> getNumberA() - getNumberB();
            case '*' -> getNumberA() * getNumberB();
            case '/' -> getNumberA() / getNumberB();
            default -> 0;
        };
    }

    public void setX(char x) {
        this.x = x;
    }
}
