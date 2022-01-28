package at.htl.control;

import at.htl.model.Dog;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class DogRepository implements PanacheRepository<Dog> {

    public Uni<Dog> addDog(String name, String address) {
        return persist(new Dog(name, address));
    }

    public Uni<Dog> getDogByName(String name, String address) {
        return find("name", name).singleResult();
    }

    public Uni<List<Dog>> getDogs() {
        return findAll().list();
    }
}
