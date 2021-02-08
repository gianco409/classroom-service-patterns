package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfessionalSchool {
	private Integer idProfessionalSchool;
	private String name;
	private List<Curricula> curricula;
	private List<UserRol> userRoles;
	private List<User> users;

}
