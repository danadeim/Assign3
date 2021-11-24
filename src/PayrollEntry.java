import java.math.BigDecimal;

public final class PayrollEntry {

    private final Employee _employee;
    private final BigDecimal _salaryPlusBonus;

    public PayrollEntry(Employee employee, BigDecimal salary, BigDecimal bonus) {
        _employee = employee;
        _salaryPlusBonus = salary.add(bonus);
    }

    public Employee getEmployee() {
        return _employee;
    }

    public BigDecimal getSalaryPlusBonus() {
        return _salaryPlusBonus;
    }
}
