package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Content;
import pe.com.unmsm.classroom.client.EntityContentClient;

public class EntityContentFacade {

	public List<Content> getAll() {
		EntityContentClient client = new EntityContentClient();
		List<Content> response = new ArrayList<Content>();

		response = client.getAll();

		return response;
	}

	public Content get(Integer id) {
		EntityContentClient client = new EntityContentClient();
		Content response = new Content();

		response = client.getContent(id);

		return response;
	}

	public Content post(Content request) {
		EntityContentClient client = new EntityContentClient();
		Content response = new Content();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Content request) {
		EntityContentClient client = new EntityContentClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityContentClient client = new EntityContentClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
