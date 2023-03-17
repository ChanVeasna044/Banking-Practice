package interfaces1;

public class BankingService {
    SavingAcoount save;
    CreditCardAccount cda;
    public BankingService(){
        save=new SavingAcoount();
        cda=new CreditCardAccount();
    }
    double checkBalance(){
        return save.checkBalance();
    }
    void setDeposite(double amount){
        save.deposite(amount);
    }
    void setWithdraw(double amount){
        save.withdraw(amount);
    }
}
