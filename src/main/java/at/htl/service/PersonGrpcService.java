package at.htl.service;

import at.htl.control.PersonRepository;
import at.htl.person.*;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import javax.inject.Inject;

@GrpcService
public class PersonGrpcService implements PersonGrpc {

    @Inject
    PersonRepository repo;

    @Blocking
    public Uni<PersonReplyWithPerson> searchPersonByName(PersonRequestWithName request) {
        return Uni.createFrom().item(repo.searchByName(request.getName()))
                .runSubscriptionOn(Infrastructure.getDefaultExecutor())
                .map(msg -> PersonReplyWithPerson.newBuilder().build());
    }

    @Blocking
    public Uni<PersonRequestWithNameAndAddress> addPerson(PersonRequestWithNameAndAddress request) {
        return Uni.createFrom().item(repo.addPerson(request.getName(), request.getAddress()))
                .runSubscriptionOn(Infrastructure.getDefaultExecutor())
                .map(msg -> PersonRequestWithNameAndAddress.newBuilder().build());
    }

}
