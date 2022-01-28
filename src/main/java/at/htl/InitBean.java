package at.htl;

import at.htl.control.DogRepository;
import at.htl.control.PersonRepository;
import at.htl.model.Dog;
import at.htl.model.Person;
import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@Startup
@ApplicationScoped
public class InitBean {
/*
    @Inject
    PersonRepository repo;

    @Inject
    DogRepository dogRepo;

    @ReactiveTransactional
    void onStart(@Observes StartupEvent event) {
        initDb();
    }

    private void initDb() {

        Person matt = new Person("Matt Murdock", "Mustermannstraße 19");
        Person mathilda = new Person("Mathilda Churchill", "Hundeplatz 9");
        Person max = new Person("Max Mustermann", "Hundeplatz 10");
        Person thomas = new Person("Thomas Raab", "Hundeplatz 11");
        Person nico = new Person("Nico Bauer", "Domplatz 12");

        Dog d1 = new Dog("Mathilde", "Mustermannstraße 68");
        Dog d2 = new Dog("Rex", "Rexstraße 8");
        Dog d3 = new Dog("Bruno", "Brunostraße 3");

        repo.persist(matt);
        repo.persist(mathilda);
        repo.persist(max);
        repo.persist(thomas);
        repo.persist(nico);

        dogRepo.persist(d1);
        dogRepo.persist(d2);
        dogRepo.persist(d3);
    }
    */
}
