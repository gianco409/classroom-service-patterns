package pe.com.unmsm.classroom.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class AccesoRequest {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private Integer idRole;
	private String accessToken;
}
