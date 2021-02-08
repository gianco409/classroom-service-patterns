package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.UserRol;
import pe.com.unmsm.classroom.client.EntityUserRolClient;

public class EntityUserRolFacade {

	public List<UserRol> getAll() {
		EntityUserRolClient client = new EntityUserRolClient();
		List<UserRol> response = new ArrayList<UserRol>();

		response = client.getAll();

		return response;
	}

	public UserRol get(Integer id) {
		EntityUserRolClient client = new EntityUserRolClient();
		UserRol response = new UserRol();

		response = client.getUserRol(id);

		return response;
	}

	public UserRol post(UserRol request) {
		EntityUserRolClient client = new EntityUserRolClient();
		UserRol response = new UserRol();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, UserRol request) {
		EntityUserRolClient client = new EntityUserRolClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityUserRolClient client = new EntityUserRolClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
