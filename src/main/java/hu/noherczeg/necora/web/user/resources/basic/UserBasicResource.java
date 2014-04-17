package hu.noherczeg.necora.web.user.resources.basic;

import org.springframework.hateoas.ResourceSupport;

public class UserBasicResource extends ResourceSupport {

    private Long id;
    private String email;
    private String title;
    private String lastName;
    private String firstName;
    private String ehaCode;

    UserBasicResource() {
    }

    UserBasicResource(Long id, String email, String title, String lastName, String firstName, String ehaCode) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ehaCode = ehaCode;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEhaCode() {
        return ehaCode;
    }
}
