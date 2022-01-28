package at.htl.model;

public class Dog {
    private String name;
    private String address;

    public Dog(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return String.format("%s lives in %s", this.getName(), this.getAddress());
    }
}
