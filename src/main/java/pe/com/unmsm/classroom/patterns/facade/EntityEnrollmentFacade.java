package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Enrollment;
import pe.com.unmsm.classroom.client.EntityEnrollmentClient;

public class EntityEnrollmentFacade {

	public List<Enrollment> getAll() {
		EntityEnrollmentClient client = new EntityEnrollmentClient();
		List<Enrollment> response = new ArrayList<Enrollment>();

		response = client.getAll();

		return response;
	}

	public Enrollment get(Integer id) {
		EntityEnrollmentClient client = new EntityEnrollmentClient();
		Enrollment response = new Enrollment();

		response = client.getEnrollment(id);

		return response;
	}

	public Enrollment post(Enrollment request) {
		EntityEnrollmentClient client = new EntityEnrollmentClient();
		Enrollment response = new Enrollment();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Enrollment request) {
		EntityEnrollmentClient client = new EntityEnrollmentClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityEnrollmentClient client = new EntityEnrollmentClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
