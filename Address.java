
public class Address {



    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String city, String street, int house, int flat) {

        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }




    @Override
    public String toString() {
        return city + " " + street + " " + house + " " + flat;
    }
}
