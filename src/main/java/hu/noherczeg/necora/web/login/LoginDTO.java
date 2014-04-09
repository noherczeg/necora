package hu.noherczeg.necora.web.login;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

class LoginDTO {

	@NotNull(message = "Email address must be provided")
	private String email;
	
	@Length(min = 3, message = "password should be at least 3 characters long")
	private String password;

    LoginDTO() {
    }

    LoginDTO(String email, String password) {
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
