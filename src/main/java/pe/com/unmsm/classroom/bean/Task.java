package pe.com.unmsm.classroom.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
	private Integer idTask;
	private String title;
	private String description;
	private Integer idCourse;
	private String limitDate;
	private Integer numberWeek;

}
