package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Curricula;
import pe.com.unmsm.classroom.client.EntityCurriculaClient;

public class EntityCurriculaFacade {

	public List<Curricula> getAll() {
		EntityCurriculaClient client = new EntityCurriculaClient();
		List<Curricula> response = new ArrayList<Curricula>();

		response = client.getAll();

		return response;
	}

	public Curricula get(Integer id) {
		EntityCurriculaClient client = new EntityCurriculaClient();
		Curricula response = new Curricula();

		response = client.getCurricula(id);

		return response;
	}

	public Curricula post(Curricula request) {
		EntityCurriculaClient client = new EntityCurriculaClient();
		Curricula response = new Curricula();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Curricula request) {
		EntityCurriculaClient client = new EntityCurriculaClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityCurriculaClient client = new EntityCurriculaClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
