public class Bank {
    public Integer depositAmount=1000;

    public Integer depositAmountAndEntryPassbook(){
        System.out.println("Amount deposited---" +depositAmount);
        return depositAmount;
    }
    public static void main(String[] args){
        Bank obj=new Bank();
        obj.depositAmountAndEntryPassbook();
        Integer amount=obj.depositAmountAndEntryPassbook();
        System.out.println("Deposited Amount=" +amount +"    Entry was done in passbook");
    }
}
//void-It will not return anything
//datatype has to become a return type