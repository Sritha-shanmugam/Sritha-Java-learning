package polymorphism;

public class Pub extends Bank{

    @Override
    public void PersonalLoan(){
        System.out.println("All employees eligible for PL");
    }

    public static void main(String[] args){
        Bank bank=new Pub();
        bank.getROI();
        bank.PersonalLoan();
        System.out.println("Interest rate of Bank = " +bank.getROI());



    }
}
