package pe.com.unmsm.classroom.bean;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enrollment {
	private Integer idEnrollment;
	private Integer cycle;
	private String date;
	private Integer idUser;
	private Integer amountCredits;
	private List<EnrollmentDetail> enrollmentDetails;

}
