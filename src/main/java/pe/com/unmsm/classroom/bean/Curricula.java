package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curricula {
	private Integer idCurriculum;
	private String name;
	private Integer amountCredits;
	private Integer yearCreation;
	private Integer idProfessionalSchool;
	private List<Course>  courses;
	private ProfessionalSchool professionalSchool;

}
