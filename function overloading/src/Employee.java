// Example on Encapsulation by declaring the variables as integers..

// EXCERISE ON LEX..
class Employee {

    private String employeeId;
    private String employeeName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    private int salary;
    private int bonus;
    private int jobLevel;

    public void calculateSalary() {
        if (this.jobLevel >= 4) {
            this.bonus = 100;
        } else {
            this.bonus = 50;
        }
        this.salary += this.bonus;
    }

    class anything { // class name could be anything

        public static void main(String[] args) {

            Employee employee = new Employee();
            employee.setEmployeeId("C101");
            employee.setEmployeeName("JHON");
            employee.setSalary(565);
            employee.setJobLevel(4);

            employee.calculateSalary();

            System.out.println("Employee Details");
            System.out.println("Employee Id: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Salary: " + employee.getSalary());

        }
    }
}

// We can excetue the code in another class and this class also there would be no issuses.
