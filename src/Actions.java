public class Actions extends UserInput{
    public char x;
    public double result;

    public Actions(double numberA, double numberB, char x) {
        super(numberA, numberB);
        this.x = x;
    }

    public double getResult() {
        double res = switch (x) {
            case '+' -> getNumberA() + getNumberB();
            case '-' -> getNumberA() - getNumberB();
            case '*' -> getNumberA() * getNumberB();
            case '/' -> getNumberA() / getNumberB();
            default -> 0;
        };
        return result;



    }

    public void setX(char x) {
        this.x = x;

    }

}
