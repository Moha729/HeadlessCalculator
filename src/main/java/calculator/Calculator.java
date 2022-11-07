package calculator;

public class Calculator {

    private final NumberSource numberSource;

    public Calculator(NumberSource numberSource) {
        this.numberSource = numberSource;
    }

    public Long multiply() {
        return numberSource.next() * numberSource.next();
    }
}
