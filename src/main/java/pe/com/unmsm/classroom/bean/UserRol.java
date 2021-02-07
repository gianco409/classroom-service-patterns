package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRol {
	private Integer idUserRole;
	private Integer idUser;
	private Integer idRole;
	private String description;
	private Role role;
	private List<UserRol> userRoles;

}
