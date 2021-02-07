package pe.com.unmsm.classroom.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class AccesoResponse {
	private Integer statusCode;
	private String error;
	private String message;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private Integer idRole;
	private String accessToken;
}
