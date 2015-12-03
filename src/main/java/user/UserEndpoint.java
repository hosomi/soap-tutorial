package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://github.com/aokolnychyi/soap-tutorial";
    @Autowired
    private UserStorage userStorage;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUsers(@RequestPayload GetUserRequest userRequest) {
        final GetUserResponse getUserResponse = new GetUserResponse();
        final String name = userRequest.getName();
        final List<User> foundUsers = userStorage.findUsers(name);
        getUserResponse.setUsers(foundUsers);
        return getUserResponse;
    }
}
