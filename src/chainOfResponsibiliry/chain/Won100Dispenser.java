package chainOfResponsibiliry.chain;

import chainOfResponsibiliry.Currency;

public class Won100Dispenser implements DispenseChain {

    private DispenseChain nextChain;
    private static final int unit = 100;

    @Override
    public void setNext(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        System.out.println(currency.getAmount() + " won.");

        if (isDispensable(currency)) {
            dispenseAndGoNextChain(currency);
        } else {
//            dispenseFail(currency.getAmount());   // 방법 1. 실패처리
            nextChain.dispense(currency);   // 방법 2. 다음 체인 선택처리
        }
    }

    @Override
    public void dispenseAndGoNextChain(Currency currency) {
        int dispensedAmount = getDispensedAmount(currency);
        int restAmount = getRestAmount(currency);

        dispensePass(dispensedAmount);
        nextChain.dispense(new Currency(restAmount));
    }

    @Override
    public int getDispensedAmount(Currency currency) {
        int unitAmount = currency.getAmount() / unit;
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
        return unit <= currency.getAmount();
    }

}
