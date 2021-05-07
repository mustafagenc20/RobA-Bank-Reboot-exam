import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Mustafa", "Genc", LocalDate.of(1983,3,15));
        User user2 = new User("Eric", "Can", LocalDate.of(1992,8,21));

        System.out.println(user1);
        UserService userService = new UserService();
        System.out.println(userService.calcAge(user1));

        // =============== BankAccount Transfer Test =============
        BankAccount bankAccount1 = new BankAccount(123456, BankAccountType.checking, "EUR", 10000.00);
        System.out.println(bankAccount1);

        BankAccount bankAccount2 = new BankAccount(456123, BankAccountType.saving, "EUR", 5000.00);
        System.out.println(bankAccount2);

        user1.setBankAccounts(new BankAccount[]{bankAccount1, bankAccount2});


        AccountService accountService = new AccountService();
        System.out.println(accountService.transfer(bankAccount1,bankAccount2,14400.00));

        System.out.println(accountService.calcYearlyInterest(bankAccount1));

        System.out.println(accountService.bestEarningAccount(user1));
    }
}
