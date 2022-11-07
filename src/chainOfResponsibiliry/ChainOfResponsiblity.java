package chainOfResponsibiliry;

import chainOfResponsibiliry.chain.DispenseChain;
import chainOfResponsibiliry.chain.Won100Dispenser;
import chainOfResponsibiliry.chain.Won10Dispenser;
import chainOfResponsibiliry.chain.Won1Dispenser;

public class ChainOfResponsiblity {

    private DispenseChain chain1;

    public ChainOfResponsiblity(){
        chain1 = new Won100Dispenser();
        DispenseChain chain2 = new Won10Dispenser();
        DispenseChain chain3 = new Won1Dispenser();     // Won10으로 되어있었음. 디버깅.

        chain1.setNext(chain2);
        chain2.setNext(chain3);
    }


    public DispenseChain getChain1() {
        return chain1;
    }
}
