package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private Integer idUser;
	private String firstName;
	private String lastName;
	private String birthdate;
	private Integer idProfessionalSchool;
	private String career;
	private String username;
	private String password;
	private ProfessionalSchool professionalSchool;
	private List<Enrollment> enrollments;
	private List<UserRol> userRoles;
	
	
}
