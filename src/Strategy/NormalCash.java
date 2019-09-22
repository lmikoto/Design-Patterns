package Strategy;

public class NormalCash implements CashSuper {
    @Override
    public Double getResult(Double money) {
        return money;
    }
}
