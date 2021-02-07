package pe.com.unmsm.classroom.patterns.facade;

import pe.com.unmsm.classroom.client.AccesoClient;
import pe.com.unmsm.classroom.request.AccesoRequest;
import pe.com.unmsm.classroom.response.AccesoResponse;

public class AccesoFacade {

	public AccesoResponse singup(AccesoRequest request) {
		AccesoClient client = new AccesoClient();
		AccesoResponse response = new AccesoResponse();

		response = client.singup(request);

		return response;
	}

	public AccesoResponse singin(AccesoRequest request) {
		AccesoClient client = new AccesoClient();
		AccesoResponse response = new AccesoResponse();

		response = client.singin(request);

		return response;
	}

	public AccesoResponse logout(String authorization) {
		AccesoClient client = new AccesoClient();
		AccesoResponse response = new AccesoResponse();

		response = client.logout(authorization);

		return response;
	}

	public AccesoResponse verifyAccessToken(AccesoRequest request) {
		AccesoClient client = new AccesoClient();
		AccesoResponse response = new AccesoResponse();

		response = client.verifyAccessToken(request);

		return response;
	}
}
