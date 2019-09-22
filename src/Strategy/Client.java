package Strategy;

public class Client {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(2,400.0);

        System.out.println(cashContext.getResult());
    }
}
