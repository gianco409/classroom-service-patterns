package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnrollmentDetail {
	private Integer idEnrollmentDetail;
	private Integer idEnrollment;
	private Integer idCourse;
	private Course course;
	private List<Lab> labs;
	private List<Task> tasks;
	private Enrollment enrollment;

}
