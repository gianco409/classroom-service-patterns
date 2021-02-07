package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.User;
import pe.com.unmsm.classroom.client.EntityUserClient;

public class EntityUserFacade {

	public List<User> getAll() {
		EntityUserClient client = new EntityUserClient();
		List<User> response = new ArrayList<User>();

		response = client.getAll();

		return response;
	}

	public User get(Integer id) {
		EntityUserClient client = new EntityUserClient();
		User response = new User();

		response = client.getUser(id);

		return response;
	}

	public User post(User request) {
		EntityUserClient client = new EntityUserClient();
		User response = new User();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, User request) {
		EntityUserClient client = new EntityUserClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityUserClient client = new EntityUserClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
