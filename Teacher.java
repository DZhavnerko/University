public class Teacher extends People {
    private int days;
    private int amount;

    public Teacher(String name, String surname, int age, Address address, int days, int amount) {
        super(name, surname, age, address);
        this.days = days;
        this.amount = amount;
    }
    int salary;
    public int getsalary() {
        return days * amount;
    }

    @Override
    public String toString() {
        return super.getname() + " " + super.getsurname() + " " + super.getage() + " " + "Zarplata" + " " + this.getsalary();

    }


}