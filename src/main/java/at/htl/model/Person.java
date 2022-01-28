package at.htl.model;

import javax.persistence.*;

@Entity(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
        this("UNKNOWN!", "UNKNOWN!");
    }

    @Override
    public String toString() {
        return String.format("Person %s with ID: %d, lives in %s", name, id, address);
    }
}
