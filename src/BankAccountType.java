public enum BankAccountType {
    checking(1.008), saving(1.02);
    private Double interestRate;
    BankAccountType(Double interestRate){
        this.interestRate = interestRate;
    }
    public Double getInterestRate(){
        return interestRate;
    }
}
