package hu.noherczeg.necora.security.authentication;

import javax.validation.constraints.Size;

public class UserLoginDTO {

    private String email;

    @Size(min = 4, max = 24, message = "Password should be at least 4 or max. 24 characters long!")
    private String password;

    public UserLoginDTO() {
    }

    public UserLoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
