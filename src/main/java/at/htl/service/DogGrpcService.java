package at.htl.service;

import at.htl.dog.DogGrpc;
import at.htl.dog.DogRequestWithName;
import at.htl.dog.DogRequestWithNameAndAddress;
import at.htl.dog.ReplyWithDog;
import at.htl.hello.HelloReply;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class DogGrpcService implements DogGrpc {
    @Override
    public Uni<ReplyWithDog> dogName(DogRequestWithNameAndAddress request) {
        return Uni.createFrom().item("Hello " + request.getName() + "!" + "You are living in " + request.getAddress())
                .map(msg -> ReplyWithDog.newBuilder().setMessage(msg).build());
    }
}
