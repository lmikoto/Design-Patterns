package Strategy;

public class CashRebate implements CashSuper {

    Double rebate;

    CashRebate(Double rebate){
        this.rebate = rebate;
    }

    @Override
    public Double getResult(Double money) {
        return money * rebate;
    }
}
