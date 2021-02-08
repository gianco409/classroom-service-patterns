package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.ProfessionalSchool;
import pe.com.unmsm.classroom.client.EntityProfessionalSchoolClient;

public class EntityProfessionalSchoolFacade {

	public List<ProfessionalSchool> getAll() {
		EntityProfessionalSchoolClient client = new EntityProfessionalSchoolClient();
		List<ProfessionalSchool> response = new ArrayList<ProfessionalSchool>();

		response = client.getAll();

		return response;
	}

	public ProfessionalSchool get(Integer id) {
		EntityProfessionalSchoolClient client = new EntityProfessionalSchoolClient();
		ProfessionalSchool response = new ProfessionalSchool();

		response = client.getProfessionalSchool(id);

		return response;
	}

	public ProfessionalSchool post(ProfessionalSchool request) {
		EntityProfessionalSchoolClient client = new EntityProfessionalSchoolClient();
		ProfessionalSchool response = new ProfessionalSchool();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, ProfessionalSchool request) {
		EntityProfessionalSchoolClient client = new EntityProfessionalSchoolClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityProfessionalSchoolClient client = new EntityProfessionalSchoolClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
