package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Role;
import pe.com.unmsm.classroom.client.EntityRoleClient;

public class EntityRoleFacade {

	public List<Role> getAll() {
		EntityRoleClient client = new EntityRoleClient();
		List<Role> response = new ArrayList<Role>();

		response = client.getAll();

		return response;
	}

	public Role get(Integer id) {
		EntityRoleClient client = new EntityRoleClient();
		Role response = new Role();

		response = client.getRole(id);

		return response;
	}

	public Role post(Role request) {
		EntityRoleClient client = new EntityRoleClient();
		Role response = new Role();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Role request) {
		EntityRoleClient client = new EntityRoleClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityRoleClient client = new EntityRoleClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
