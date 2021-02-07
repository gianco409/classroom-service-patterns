package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Course;
import pe.com.unmsm.classroom.client.EntityCourseClient;
public class EntityCourseFacade {

	public List<Course> getAll() {
		EntityCourseClient client = new EntityCourseClient();
		List<Course> response = new ArrayList<Course>();

		response = client.getAll();

		return response;
	}

	public Course get(Integer id) {
		EntityCourseClient client = new EntityCourseClient();
		Course response = new Course();

		response = client.getCourse(id);

		return response;
	}

	public Course post(Course request) {
		EntityCourseClient client = new EntityCourseClient();
		Course response = new Course();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Course request) {
		EntityCourseClient client = new EntityCourseClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityCourseClient client = new EntityCourseClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
