package Strategy;

public class CashContext {

    CashSuper cashSuper;

    private Double money;

    CashContext(Integer type,Double money){
        CashSuper cashSuper = null;
        this.money = money;
        switch (type){
            case 1:
                cashSuper = new NormalCash();
                break;
            case 2:
                cashSuper = new CashReturn(200.0,100.0);
                break;
            case 3:
                cashSuper = new CashRebate(0.8);
                break;
        }

        this.cashSuper = cashSuper;
    }

    public Double getResult(){
        return cashSuper.getResult(money);
    }
}
