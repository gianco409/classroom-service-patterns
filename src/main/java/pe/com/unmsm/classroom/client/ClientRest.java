package pe.com.unmsm.classroom.client;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.request.RequestHeaderClassroom;

public interface ClientRest {
	ClientResponse getMethod(String url);

	ClientResponse postMethod(String url, String res, RequestHeaderClassroom header);

	ClientResponse putMethod(String url, String res);

	ClientResponse deleteMethod(String url, String res);
}
