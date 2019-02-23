public class CheckingAccount extends Account{
    public static int numberOfAccount = 0;
  CheckingAccount(double b){
    super(b);
    ++numberOfAccount;
  }
  CheckingAccount(){
    super(0);
    ++numberOfAccount;
  }
  
}