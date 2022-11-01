package chainOfResponsibiliry.chain;

import chainOfResponsibiliry.Currency;

public class Won1Dispenser implements DispenseChain{
    private DispenseChain nextChain;
    private static final int unit = 1;

    @Override
    public void setNext(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (isDispensable(currency)) {
            dispenseAndGoNextChain(currency);
        } else {
            dispenseFail(currency.getAmount());
        }
    }

    @Override
    public void dispenseAndGoNextChain(Currency currency) {
        int dispensedAmount = getDispensedAmount(currency);
        int restAmount = getRestAmount(currency);

        dispensePass(dispensedAmount);
//        nextChain.dispense(new Currency(restAmount));
        System.out.println("The End.\n");
    }

    @Override
    public int getDispensedAmount(Currency currency) {
        int unitAmount = currency.getAmount() / unit;
        System.out.println(unitAmount);
        int dispensedAmount = unitAmount * unit;
        return dispensedAmount;
    }

    @Override
    public int getRestAmount(Currency currency) {
        int restAmount = currency.getAmount() - getDispensedAmount(currency);
        return restAmount;
    }

    @Override
    public boolean isDispensable(Currency currency) {
        if (unit <= currency.getAmount()) return true;
        else return false;
    }
}
