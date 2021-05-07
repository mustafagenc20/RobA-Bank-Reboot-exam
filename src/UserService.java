import java.time.LocalDate;
import java.time.Period;

public class UserService {
    public int calcAge(User user){
        LocalDate nowDate = LocalDate.now();
        long years = Period.between(user.getBirthday(), nowDate).getYears();
        int age = (int) years;
        return age;
    }
    public boolean isSenior(User user){
        boolean value = false;
        LocalDate nowDate = LocalDate.now();
        long years = Period.between(user.getBirthday(), nowDate).getYears();
        int age = (int) years;
        if (age > 65) {value = true;}
        return value;
    }
    public boolean isMinor(User user){
        boolean value = false;
        LocalDate nowDate = LocalDate.now();
        long years = Period.between(user.getBirthday(), nowDate).getYears();
        int age = (int) years;
        if (age < 18) {value = true;}
        return value;
    }
}
