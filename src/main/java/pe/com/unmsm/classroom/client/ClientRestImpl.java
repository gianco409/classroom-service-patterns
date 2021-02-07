package pe.com.unmsm.classroom.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import lombok.extern.slf4j.Slf4j;
import pe.com.unmsm.classroom.request.RequestHeaderClassroom;
import pe.com.unmsm.classroom.util.Constantes;

@Slf4j
public class ClientRestImpl implements ClientRest {

	@Override
	public ClientResponse getMethod(String url) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [metodoPost] ";

		ClientResponse responseClient = null;

		try {
			log.info(mensajeMetodo + "INICIO metodoGet a url : " + url);

			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.header(Constantes.CONTENT_TYPE, "application/json")
					.header(Constantes.ID_TRANSACCION, "11111111111111").get(ClientResponse.class);
			log.info(mensajeMetodo + "FIN metodoGet a url : " + url);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [" + e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [metodoPost] ");
		}
		return responseClient;
	}

	@Override
	public ClientResponse postMethod(String url, String res, RequestHeaderClassroom header) {
		log.info("INICIO metodo Post a url : " + url);
		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [metodoPost] ";

		ClientResponse responseClient = null;
		try {
			log.info(mensajeMetodo + "INICIO metodo Post a url : " + url);
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.header(Constantes.CONTENT_TYPE, header.getContentType())
					.header(Constantes.AUTHORIZATION, header.getAuthorization()).post(ClientResponse.class, res);
			log.info(mensajeMetodo + "FIN metodo Post a url : " + url);
		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [" + e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [metodoPost] ");
		}
		return responseClient;
	}

	@Override
	public ClientResponse putMethod(String url, String res) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [metodoPut] ";

		ClientResponse responseClient = null;
		try {
			log.info(mensajeMetodo + "INICIO metodoPost a url : " + url);

			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.header(Constantes.CONTENT_TYPE, "application/json").put(ClientResponse.class, res);
			log.info(mensajeMetodo + "FIN metodoGet a url : " + url);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [" + e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [metodoPut] ");
		}

		return responseClient;
	}

	@Override
	public ClientResponse deleteMethod(String url, String res) {
		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [metodoPut] ";

		ClientResponse responseClient = null;
		try {
			log.info(mensajeMetodo + "INICIO metodoPost a url : " + url);

			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.header(Constantes.CONTENT_TYPE, "application/json").delete(ClientResponse.class, res);
			log.info(mensajeMetodo + "FIN metodoGet a url : " + url);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [" + e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [metodoPut] ");
		}

		return responseClient;
	}
}
