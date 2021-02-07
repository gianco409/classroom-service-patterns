package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Role {
	private Integer idRole;
	private String description;
	private List<UserRol> userRoles;

}
