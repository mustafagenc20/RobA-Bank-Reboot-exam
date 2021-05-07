public class BankAccount {

    private Integer accountNumber;
    private BankAccountType accountType;
    private String description;
    private Double balance;

    public BankAccount(Integer accountNumber, BankAccountType accountType, String description, Double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.description = description;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountType=" + accountType +
                ", description='" + description + '\'' +
                ", balance=" + balance +
                '}';
    }
}
