package interfaces1;




public class InterfaceDemo {
    public static void main(String[] args) {
        BankServiceII creditAccount = new BankServiceII(new CreditCardAccount());
        creditAccount.deposit(1000);
        creditAccount.withdrawMoney(20);
        System.out.println("Credit Balance : "+creditAccount.showBalance()+"$");

        BankServiceII savingAccount = new BankServiceII(new SavingAcoount());
        savingAccount.deposit(500);
        System.out.println("Saving Balance : "+savingAccount.showBalance()+"$");


//        BankingServiceII obj=new BankingServiceII();
//        obj.setDeposite(1000);
//        obj.setWithdraw(10);
//        System.out.println("My Balance :"+obj.checkBalance());
//          BankServiceII obj1= new BankServiceII(new CreditCardAccount());
//          obj1.DepositeMoney(100);
//          obj1.withdrawMoney(29);
//          double result=obj1.showBalance();
//        System.out.println("My Balance is :"+result);
    }
}
