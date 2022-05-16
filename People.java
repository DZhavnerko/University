public abstract class People {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public People(String name, String surname, int age, Address address) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public String getname() {
        return name;
    }
    public String getsurname() {

        return surname;
    }
    public int getage() {

        return age;
    }


}
