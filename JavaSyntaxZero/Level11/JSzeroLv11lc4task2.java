package JavaSyntaxZero.Level11;

public class JSzeroLv11lc4task2 {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary1) {
        if (salary1 > salary)
            this.salary = salary1;
    }
}

