import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Worker extends Employee {
    private LocalDate _employmentDate;
    private BigDecimal _bonus;

    public Worker(String firstName, String surname, LocalDate birthDate, BigDecimal salary, Manager manager, LocalDate employmentDate, BigDecimal bonus) {
        super(firstName, surname, birthDate, salary, manager);
        _employmentDate = employmentDate;
        _bonus = bonus;
    }

    public LocalDate getEmploymentDate() {
        return _employmentDate;
    }

    public BigDecimal getBonus() {
        return _bonus;
    }

    public boolean seniorityLongerMonths(int months) {
        LocalDate today = LocalDate.now();
        int years = Period.between(_employmentDate, today).getYears();

        return Period.between(_employmentDate, today).getMonths() + 12*years - months > 0;

    }

    public boolean seniorityLongerYears(int years) {
        LocalDate today = LocalDate.now();
        return Period.between(_employmentDate, today).getYears() - years > 0;
    }

    public int monthsSeniority() {
        return (_employmentDate.getMonthValue() + ((LocalDate.now().getYear() -_employmentDate.getYear()) * 12) );
    }

    public void setBonus(BigDecimal _bonus) {
        this._bonus = _bonus;
    }

    public boolean greaterBonusThan(BigDecimal bonus) {
        return _bonus.compareTo(bonus) > 0;
    }
}
