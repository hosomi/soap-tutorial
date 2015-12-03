package user;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class UserStorage {

    private final List<User> users = new ArrayList<>();

    @PostConstruct
    private void initUsers() {
        final User firstUser = new User("Adrian", "Cook", "US");
        final User secondUser = new User("Monika", "Komarovski", "Poland");
        users.add(firstUser);
        users.add(secondUser);
    }

    public void addUser(final User user) {
        users.add(user);
    }

    public List<User> findUsers(final String name) {
        final Predicate<User> filterPredicate = (user) -> {
            final String currentUsername = user.getName();
            return currentUsername.equals(name);
        };
        return users.stream()
                .filter(filterPredicate)
                .collect(Collectors.toList());
    }
}