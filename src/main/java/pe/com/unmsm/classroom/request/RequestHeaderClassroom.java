package pe.com.unmsm.classroom.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class RequestHeaderClassroom {
	private String contentType;
	private String authorization;
	
	public RequestHeaderClassroom() {
		this.contentType = "";
		this.authorization = "";
	}
}
