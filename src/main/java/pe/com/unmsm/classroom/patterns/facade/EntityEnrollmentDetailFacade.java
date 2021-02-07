package pe.com.unmsm.classroom.patterns.facade;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.EnrollmentDetail;
import pe.com.unmsm.classroom.client.EntityEnrollmentDetailClient;

public class EntityEnrollmentDetailFacade {

	public List<EnrollmentDetail> getAll() {
		EntityEnrollmentDetailClient client = new EntityEnrollmentDetailClient();
		List<EnrollmentDetail> response = new ArrayList<EnrollmentDetail>();

		response = client.getAll();

		return response;
	}

	public EnrollmentDetail get(Integer id) {
		EntityEnrollmentDetailClient client = new EntityEnrollmentDetailClient();
		EnrollmentDetail response = new EnrollmentDetail();

		response = client.getEnrollmentDetail(id);

		return response;
	}

	public EnrollmentDetail post(EnrollmentDetail request) {
		EntityEnrollmentDetailClient client = new EntityEnrollmentDetailClient();
		EnrollmentDetail response = new EnrollmentDetail();

		response = client.post(request);

		return response;
	}

	public ClientResponse put(Integer id, EnrollmentDetail request) {
		EntityEnrollmentDetailClient client = new EntityEnrollmentDetailClient();
		ClientResponse response = null;

		response = client.put(id, request);

		return response;
	}

	public ClientResponse delete(Integer id) {
		EntityEnrollmentDetailClient client = new EntityEnrollmentDetailClient();
		ClientResponse response = null;

		response = client.delete(id);

		return response;
	}

}
