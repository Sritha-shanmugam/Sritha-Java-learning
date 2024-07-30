package polymorphism;

class Kvb extends Bank{
    int getROI(){
        return 7;
    }
}
class Test{
    public static void main(String[] args){
        IOB iob= new IOB();
        Kvb kvb= new Kvb();
        Bank bank=new Bank();
        System.out.println("Interest rate of Bank = " +bank.getROI());
        System.out.println("IOB bank Rate of Interest = " +iob.getROI());
        System.out.println("KVB bank Rate of Interest = " +kvb.getROI());
    }
}