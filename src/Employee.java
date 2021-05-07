import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private BankAccount[] bankAccounts;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public double getEmpAdvantageRate() {
        return empAdvantageRate;
    }

    public void setEmpAdvantageRate(double empAdvantageRate) {
        this.empAdvantageRate = empAdvantageRate;
    }

    private double empAdvantageRate;
}
