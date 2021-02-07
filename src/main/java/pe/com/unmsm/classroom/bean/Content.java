package pe.com.unmsm.classroom.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Content {
	private Integer idContent;
	private Integer numberWeek;
	private Integer idCourse;
	private String contentName;
	private String fileName;
	private String filePath;
	private Course course;

}
