package pe.com.unmsm.classroom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Content;
import pe.com.unmsm.classroom.bean.Course;
import pe.com.unmsm.classroom.bean.Curricula;
import pe.com.unmsm.classroom.bean.EnrollmentDetail;
import pe.com.unmsm.classroom.bean.User;
import pe.com.unmsm.classroom.patterns.facade.AccesoFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityContentFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityCourseFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityCurriculaFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityEnrollmentDetailFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityUserFacade;
import pe.com.unmsm.classroom.request.AccesoRequest;
import pe.com.unmsm.classroom.response.AccesoResponse;
import pe.com.unmsm.classroom.service.IClassroomService;

@Service
public class ClassroomServiceImpl implements IClassroomService {

	@Override
	public AccesoResponse singup(AccesoRequest request) {
		AccesoFacade accesoFacade = new AccesoFacade();

		return accesoFacade.singup(request);
	}

	@Override
	public AccesoResponse singin(AccesoRequest request) {
		AccesoFacade accesoFacade = new AccesoFacade();

		return accesoFacade.singin(request);
	}

	@Override
	public AccesoResponse logout(String authorization) {
		AccesoFacade accesoFacade = new AccesoFacade();

		return accesoFacade.logout(authorization);
	}

	@Override
	public AccesoResponse verifyAccessToken(AccesoRequest request) {
		AccesoFacade accesoFacade = new AccesoFacade();

		return accesoFacade.verifyAccessToken(request);
	}

	@Override
	public List<User> getAllUser() {
		EntityUserFacade userFacade = new EntityUserFacade();

		return userFacade.getAll();
	}

	@Override
	public User getUser(Integer id) {
		EntityUserFacade userFacade = new EntityUserFacade();

		return userFacade.get(id);
	}

	@Override
	public User postUser(User request) {
		EntityUserFacade userFacade = new EntityUserFacade();

		return userFacade.post(request);
	}

	@Override
	public ClientResponse putUser(Integer id, User request) {
		EntityUserFacade userFacade = new EntityUserFacade();

		return userFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteUser(Integer id) {
		EntityUserFacade userFacade = new EntityUserFacade();

		return userFacade.delete(id);
	}

	@Override
	public List<Content> getAllContent() {
		EntityContentFacade contentFacade = new EntityContentFacade();

		return contentFacade.getAll();
	}

	@Override
	public Content getContent(Integer id) {
		EntityContentFacade contentFacade = new EntityContentFacade();

		return contentFacade.get(id);
	}

	@Override
	public Content postContent(Content request) {
		EntityContentFacade contentFacade = new EntityContentFacade();

		return contentFacade.post(request);
	}

	@Override
	public ClientResponse putContent(Integer id, Content request) {
		EntityContentFacade contentFacade = new EntityContentFacade();

		return contentFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteContent(Integer id) {
		EntityContentFacade contentFacade = new EntityContentFacade();

		return contentFacade.delete(id);
	}

	@Override
	public List<Course> getAllCourse() {
		EntityCourseFacade courseFacade = new EntityCourseFacade();

		return courseFacade.getAll();
	}

	@Override
	public Course getCourse(Integer id) {
		EntityCourseFacade courseFacade = new EntityCourseFacade();

		return courseFacade.get(id);
	}

	@Override
	public Course postCourse(Course request) {
		EntityCourseFacade courseFacade = new EntityCourseFacade();

		return courseFacade.post(request);
	}

	@Override
	public ClientResponse putCourse(Integer id, Course request) {
		EntityCourseFacade courseFacade = new EntityCourseFacade();

		return courseFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteCourse(Integer id) {
		EntityCourseFacade courseFacade = new EntityCourseFacade();

		return courseFacade.delete(id);
	}

	@Override
	public List<Curricula> getAllCurricula() {
		EntityCurriculaFacade curriculaFacade = new EntityCurriculaFacade();

		return curriculaFacade.getAll();
	}

	@Override
	public Curricula getCurricula(Integer id) {
		EntityCurriculaFacade curriculaFacade = new EntityCurriculaFacade();

		return curriculaFacade.get(id);
	}

	@Override
	public Curricula postCurricula(Curricula request) {
		EntityCurriculaFacade curriculaFacade = new EntityCurriculaFacade();

		return curriculaFacade.post(request);
	}

	@Override
	public ClientResponse putCurricula(Integer id, Curricula request) {
		EntityCurriculaFacade curriculaFacade = new EntityCurriculaFacade();

		return curriculaFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteCurricula(Integer id) {
		EntityCurriculaFacade curriculaFacade = new EntityCurriculaFacade();

		return curriculaFacade.delete(id);
	}

	@Override
	public List<EnrollmentDetail> getAllEnrollmentDetail() {
		EntityEnrollmentDetailFacade EntityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return EntityEnrollmentDetailFacade.getAll();
	}

	@Override
	public EnrollmentDetail getEnrollmentDetail(Integer id) {
		EntityEnrollmentDetailFacade EntityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return EntityEnrollmentDetailFacade.get(id);
	}

	@Override
	public EnrollmentDetail postEnrollmentDetail(EnrollmentDetail request) {
		EntityEnrollmentDetailFacade EntityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return EntityEnrollmentDetailFacade.post(request);
	}

	@Override
	public ClientResponse putEnrollmentDetail(Integer id, EnrollmentDetail request) {
		EntityEnrollmentDetailFacade EntityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return EntityEnrollmentDetailFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteEnrollmentDetail(Integer id) {
		EntityEnrollmentDetailFacade EntityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return EntityEnrollmentDetailFacade.delete(id);
	}
}
