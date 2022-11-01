package chainOfResponsibiliry.chain;

import chainOfResponsibiliry.Currency;

public interface DispenseChain {

    String WON = "won";

    void setNext(DispenseChain chain);

    void dispense(Currency currency);

    boolean isDispensable(Currency currency);

    void dispenseAndGoNextChain(Currency currency);

    int getDispensedAmount(Currency currency);

    int getRestAmount(Currency currency);

    default void dispensePass(int dispensedAmount) {
        System.out.println("Dispense result : " + dispensedAmount + " " + WON + ".");
    }

    default void dispenseFail(int amount) {
        System.out.println("Dispense result : FAIL. " + amount + " " + WON + " is smaller than Dispenser's unit.\n");
    }

}
