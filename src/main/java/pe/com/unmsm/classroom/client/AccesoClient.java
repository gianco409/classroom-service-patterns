package pe.com.unmsm.classroom.client;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import lombok.extern.slf4j.Slf4j;
import pe.com.unmsm.classroom.request.AccesoRequest;
import pe.com.unmsm.classroom.response.AccesoResponse;
import pe.com.unmsm.classroom.util.Constantes;

@Slf4j
public class AccesoClient {

	public AccesoResponse singup(AccesoRequest request) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [singup - SERVICE] ");
		ClientResponse responseClient = null;
		AccesoResponse response = new AccesoResponse();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + request);

			String res = gsonReq.toJson(request);
			String url = Constantes.wsAuhentication_authorization + "signup";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, res);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), AccesoResponse.class);

			log.info(mensajeMetodo + "Ejecucion realizada. ");
			log.info(mensajeMetodo + "PARAMETROS [OUTPUT]:");
			log.info(mensajeMetodo + response);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [Invocando al Servicio http://142.93.83.211:3002/api/ ] - ["
					+ e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [actualizarCliente - Proxy] ");
		}

		return response;
	}

	public AccesoResponse singin(AccesoRequest request) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [actualizarCliente - Proxy] ");

		ClientResponse responseClient = null;
		AccesoResponse response = new AccesoResponse();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + request);

			String res = gsonReq.toJson(request);
			String url = Constantes.wsAuhentication_authorization + "signin";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, res);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), AccesoResponse.class);

			log.info(mensajeMetodo + "Ejecucion realizada. ");
			log.info(mensajeMetodo + "PARAMETROS [OUTPUT]:");
			log.info(mensajeMetodo + response);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [Invocando al Servicio http://142.93.83.211:3002/api/ ] - ["
					+ e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [actualizarCliente - Proxy] ");
		}

		return response;
	}

	public AccesoResponse logout(String authorization) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [actualizarCliente - Proxy] ");

		ClientResponse responseClient = null;
		AccesoResponse response = new AccesoResponse();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + authorization);

			String url = Constantes.wsAuhentication_authorization + "logout";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.header(Constantes.AUTHORIZATION, authorization).post(ClientResponse.class);
			response = gsonReq.fromJson(responseClient.getEntity(String.class), AccesoResponse.class);

			log.info(mensajeMetodo + "Ejecucion realizada. ");
			log.info(mensajeMetodo + "PARAMETROS [OUTPUT]:");
			log.info(mensajeMetodo + response);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [Invocando al Servicio http://142.93.83.211:3002/api/ ] - ["
					+ e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [actualizarCliente - Proxy] ");
		}

		return response;
	}

	public AccesoResponse verifyAccessToken(AccesoRequest request) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [actualizarCliente - Proxy] ");

		ClientResponse responseClient = null;
		AccesoResponse response = new AccesoResponse();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + request);

			String res = gsonReq.toJson(request);
			String url = Constantes.wsAuhentication_authorization + "verify-access-token";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, res);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), AccesoResponse.class);
			log.info(mensajeMetodo + "Ejecucion realizada. ");
			log.info(mensajeMetodo + "PARAMETROS [OUTPUT]:");
			log.info(mensajeMetodo + response);

		} catch (Exception e) {
			log.error(mensajeMetodo + "ERROR: [Exception] [Invocando al Servicio http://142.93.83.211:3002/api/ ] - ["
					+ e.getMessage() + "] ", e);
		} finally {
			log.info(
					mensajeMetodo + "Tiempo Transacurrido (ms): [" + (System.currentTimeMillis() - tiempoInicio) + "]");
			log.info(mensajeMetodo + "[FIN] - METODO: [actualizarCliente - Proxy] ");
		}

		return response;
	}
}
