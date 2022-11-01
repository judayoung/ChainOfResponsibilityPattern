import chainOfResponsibiliry.ChainOfResponsiblity;
import chainOfResponsibiliry.Currency;
import chainOfResponsibiliry.chain.DispenseChain;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's make Chains for Chain of Responsiblity!");
        System.out.println("It shows a chain set side by side.\n");

        ChainOfResponsiblity chainOfResponsibility = new ChainOfResponsiblity();
        Currency currency1 = new Currency(300);
        chainOfResponsibility.getChain1().dispense(currency1);

        Currency currency2 = new Currency(53);
        chainOfResponsibility.getChain1().dispense(currency2);

        Currency currency3 = new Currency(756);
        chainOfResponsibility.getChain1().dispense(currency3);
    }
}