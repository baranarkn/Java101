class Test{
    public static void main(String[] args) {
        Employee e1 = new Employee("Baran" , 2000 , 45 , 1985);
        Employee e2 = new Employee("Ali" , 3500 , 38 , 2020);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.printInfo();

        e2.tax();
        e2.bonus();
        e2.raiseSalary();
        e2.printInfo();
    }
}

class Employee{
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if (this.salary > 1000){
            this.tax = this.salary * 0.03;
        }else {
            this.tax = 0;
        }
    }

    public void bonus(){
        if (this.workHours > 40){
            this.bonus = 30 * (this.workHours - 40);
        } else {
            this.bonus = 0;
        }
    }

    public void raiseSalary(){
        int tempYear = 2021 - this.hireYear;

        if (tempYear < 10){
            this.raiseSalary = salary * 0.05;
        } else if (tempYear > 9 && tempYear < 20){
            this.raiseSalary = salary * 0.10;
        } else if (tempYear > 19){
            this.raiseSalary = salary * 0.15;
        }
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Salary Increase: " + this.raiseSalary);
        System.out.println("Salary with Tax and Bonuses: " + (this.salary + this.bonus - this.tax));
        System.out.println("Total Salary: " + (this.salary + this.bonus - this.tax + this.raiseSalary));
        System.out.println("-----------------------------------");
    }
}
