package at.htl.control;

import at.htl.model.Person;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

    public Uni<Person> searchByName(String name) {
        return find("name", name).singleResult();
    }

    public Uni<Person> addPerson(String name, String address) {
        return persist(new Person(name, address));
    }
}
