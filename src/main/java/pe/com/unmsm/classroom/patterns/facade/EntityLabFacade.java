package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Lab;
import pe.com.unmsm.classroom.client.EntityLabClient;

public class EntityLabFacade {

	public List<Lab> getAll() {
		EntityLabClient client = new EntityLabClient();
		List<Lab> response = new ArrayList<Lab>();

		response = client.getAll();

		return response;
	}

	public Lab get(Integer id) {
		EntityLabClient client = new EntityLabClient();
		Lab response = new Lab();

		response = client.getLab(id);

		return response;
	}

	public Lab post(Lab request) {
		EntityLabClient client = new EntityLabClient();
		Lab response = new Lab();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Lab request) {
		EntityLabClient client = new EntityLabClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityLabClient client = new EntityLabClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
