package pe.com.unmsm.classroom.client;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import lombok.extern.slf4j.Slf4j;
import pe.com.unmsm.classroom.bean.EnrollmentDetail;
import pe.com.unmsm.classroom.util.Constantes;

@Slf4j
public class EntityEnrollmentDetailClient {

	public List<EnrollmentDetail> getAll() {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [singup - SERVICE] ");
		ClientResponse responseClient = null;
		EnrollmentDetail[] response = null;
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsEntitiesMaintenanceServices);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");

			String url = Constantes.wsEntitiesMaintenanceServices + "EnrollmentDetails";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.get(ClientResponse.class);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), EnrollmentDetail[].class);

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

		return Arrays.asList(response);
	}

	public EnrollmentDetail getEnrollmentDetail(Integer id) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [actualizarCliente] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [singup - SERVICE] ");
		ClientResponse responseClient = null;
		EnrollmentDetail response = null;
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsEntitiesMaintenanceServices);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");

			String url = Constantes.wsEntitiesMaintenanceServices + "EnrollmentDetails/" + id;
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.get(ClientResponse.class);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), EnrollmentDetail.class);

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

	public EnrollmentDetail post(EnrollmentDetail request) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [post] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [post - SERVICE] ");
		ClientResponse responseClient = null;
		EnrollmentDetail response = new EnrollmentDetail();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + request);

			String res = gsonReq.toJson(request);
			String url = Constantes.wsEntitiesMaintenanceServices + "EnrollmentDetails";
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, res);

			response = gsonReq.fromJson(responseClient.getEntity(String.class), EnrollmentDetail.class);

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

	public ClientResponse put(Integer id, EnrollmentDetail request) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [post] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [post - SERVICE] ");
		ClientResponse responseClient = null;
		EnrollmentDetail response = new EnrollmentDetail();
		Gson gsonReq = new Gson();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");
			log.info(mensajeMetodo + request);

			String res = gsonReq.toJson(request);
			String url = Constantes.wsEntitiesMaintenanceServices + "EnrollmentDetails/" + id;
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.put(ClientResponse.class, res);

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

		return responseClient;
	}

	public ClientResponse delete(Integer id) {

		long tiempoInicio = System.currentTimeMillis();
		String mensajeMetodo = " [post] ";

		log.info(mensajeMetodo + "[INICIO] - METODO: [post - SERVICE] ");
		ClientResponse responseClient = null;
		EnrollmentDetail response = new EnrollmentDetail();

		try {
			log.info(mensajeMetodo + "URL= " + Constantes.wsAuhentication_authorization);
			log.info(mensajeMetodo + "PARAMETROS [INPUT]:");

			String url = Constantes.wsEntitiesMaintenanceServices + "EnrollmentDetails/" + id;
			Client client = Client.create();
			WebResource wrs = client.resource(url);

			responseClient = wrs.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON)
					.delete(ClientResponse.class);

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

		return responseClient;
	}

}
