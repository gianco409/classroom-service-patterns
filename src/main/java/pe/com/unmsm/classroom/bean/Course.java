package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
	private Integer idCourse;
	private String name;
	private String credits;
	private Integer idCurriculum;
	private List<Content> contens;
	private List<Lab> labs;
	private List<Task> tasks;
	private List<Content> contents;
	private List<EnrollmentDetail> enrollmentDetails;
	private Curricula curriculum;

}
