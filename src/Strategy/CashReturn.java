package Strategy;

public class CashReturn implements CashSuper {

    private Double every;

    private Double returnMoney;

    CashReturn(Double every,Double returnMoney){
        this.every = every;
        this.returnMoney = returnMoney;
    }

    @Override
    public Double getResult(Double money) {
        Double num = money / every;
        return money - num.intValue() * returnMoney;
    }
}
