
public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Vitebsk", "Lenina", 44, 105);

        Address address2 = new Address("Brest", "Pushkinskaya", 2, 33);

        Address address3 = new Address("Minsk", "Angarskaya", 13, 12);

        Address address11 = new Address("Vitebsk", "Tolstogo", 22, 98);

        Address address22 = new Address("Brest", "Vesennyaya", 15, 67);

        Address address33 = new Address("Minsk", "Kirova", 25, 70);


        Teacher teacher1 = new Teacher("Galina", "Naperstok", 47, address1, 30, 150);

        Teacher teacher2 = new Teacher("Irina", "Greben", 24, address2, 30, 99);

        Teacher teacher3 = new Teacher("Olga", "Solomon", 33, address3, 30, 120);


        Student student1 = new Student("Oleg", "Popovich", 19, address11);
        //System.out.println(student1);

        Student student2 = new Student("Maria", "Sokolova", 18, address22);

        Student student3 = new Student("Igor", "Levkevich", 20, address33);


        Group group = new Group("Java", 39, student1, teacher1);


        Student student4 = new Student("Vladimir", "Levashkevich", 21, address1);
        Group group1 = new Group("Java", 39, student4, teacher1);
        //System.out.println(group1);

        Student[] students = {student1, student2, student3, student3};
        for(Student stud: students){
            System.out.println(stud);
        }


        Address address4 = new Address("Minsk", "Gerasimenko", 27, 20);
        Teacher teacher4 = new Teacher("Inna", "Ivanova", 26, address4, 30, 125);
        Group group2 = new Group("Java", 39, student4, teacher4);
        System.out.println(group2);
    }
}