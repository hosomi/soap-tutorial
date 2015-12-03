package user;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://github.com/aokolnychyi/soap-tutorial")
public class GetUserRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
