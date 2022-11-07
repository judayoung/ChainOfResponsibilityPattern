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
        System.out.println("---dispense---> \t" + dispensedAmount + " " + WON + ".");
    }

    default void dispenseFail(int amount) {
        System.out.println("---dispense---> FAIL. " + amount + " " + WON + " is smaller than Dispenser's unit.\n(" + this.getClass().getSimpleName() + ")\n");
    }

}
