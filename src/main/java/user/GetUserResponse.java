package user;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(namespace = "http://github.com/aokolnychyi/soap-tutorial")
public class GetUserResponse {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
