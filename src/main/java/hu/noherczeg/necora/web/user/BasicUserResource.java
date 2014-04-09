package hu.noherczeg.necora.web.user;

import hu.noherczeg.necora.domain.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.ResourceSupport;

class BasicUserResource extends ResourceSupport {

    private Long id;
    private String email;
    private String title;
    private String lastName;
    private String firstName;
    private String ehaCode;

    BasicUserResource() {
    }

    BasicUserResource(Long id, String email, String title, String lastName, String firstName, String ehaCode) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ehaCode = ehaCode;
    }

    public static BasicUserResource fromUser(User user) {
        BasicUserResource basicUserResource = new BasicUserResource();
        BeanUtils.copyProperties(user, basicUserResource);
        return basicUserResource;
    }

}
