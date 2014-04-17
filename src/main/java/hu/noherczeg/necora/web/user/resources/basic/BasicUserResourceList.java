package hu.noherczeg.necora.web.user.resources.basic;

import hu.noherczeg.necora.web.user.resources.basic.UserBasicResource;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

public class BasicUserResourceList extends ResourceSupport {

    private List<UserBasicResource> users;

    public BasicUserResourceList() {
        users = new ArrayList<>();
    }

    public List<UserBasicResource> getUsers() {
        return users;
    }
}
