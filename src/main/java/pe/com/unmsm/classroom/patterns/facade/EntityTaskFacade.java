package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Task;
import pe.com.unmsm.classroom.client.EntityTaskClient;

public class EntityTaskFacade {

	public List<Task> getAll() {
		EntityTaskClient client = new EntityTaskClient();
		List<Task> response = new ArrayList<Task>();

		response = client.getAll();

		return response;
	}

	public Task get(Integer id) {
		EntityTaskClient client = new EntityTaskClient();
		Task response = new Task();

		response = client.getTask(id);

		return response;
	}

	public Task post(Task request) {
		EntityTaskClient client = new EntityTaskClient();
		Task response = new Task();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, Task request) {
		EntityTaskClient client = new EntityTaskClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityTaskClient client = new EntityTaskClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
