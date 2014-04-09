package hu.noherczeg.necora.security.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class NecoraAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private ObjectMapper objMapper;
	
	public NecoraAuthenticationEntryPoint() {
		this.objMapper = new ObjectMapper();
	}

	@Override
    public void commence (HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx) throws IOException, ServletException {
        DetailedMessageDTO dmdto = new DetailedMessageDTO(HttpServletResponse.SC_UNAUTHORIZED, "Unauthenticated", null, authEx.getMessage());
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        PrintWriter writer = response.getWriter();
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding("UTF-8");
        writer.println(this.objMapper.writeValueAsString(dmdto));
    }
	
}
