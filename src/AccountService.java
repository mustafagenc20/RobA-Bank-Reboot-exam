public class AccountService {
    public boolean transfer(BankAccount source, BankAccount target, Double amount){
        if (amount < 0) // If amount is negative
        {
            return false;
        } else if (amount > source.getBalance()) // requested transfer value exceeds balance
        {
            return false;
        } else {
            source.setBalance(source.getBalance() - amount);
            target.setBalance(target.getBalance() + amount);
            return true;
        }

    }
    public Double calcYearlyInterest(BankAccount account){
        Double balanceAfterInterest = 0.00;
        Double interest;
        for (BankAccountType bankAccountType : BankAccountType.values()){
            if (bankAccountType == account.getAccountType()){
                balanceAfterInterest = account.getBalance() * bankAccountType.getInterestRate();
            }
        }
        interest = balanceAfterInterest - account.getBalance();
        account.setBalance(balanceAfterInterest);
        return interest;
    }
    public BankAccount bestEarningAccount(User user){
        Double[] interest = new Double[10];
        int index = 0;
        for (int i = 0; i < user.getBankAccounts().length; i++){
            interest[i] = calcYearlyInterest(user.getBankAccounts()[i]);
        }
        Double value = interest[0];
        for (int i = 0; i < interest.length; i++){
            if (interest[i] > value){
                value = interest[i];
                index = i;
            }
        }
        return user.getBankAccounts()[index];
    }
}
