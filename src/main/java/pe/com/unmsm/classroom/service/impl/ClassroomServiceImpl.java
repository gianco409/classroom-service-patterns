package pe.com.unmsm.classroom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.ClientResponse;

import pe.com.unmsm.classroom.bean.Content;
import pe.com.unmsm.classroom.bean.Course;
import pe.com.unmsm.classroom.bean.Curricula;
import pe.com.unmsm.classroom.bean.Enrollment;
import pe.com.unmsm.classroom.bean.EnrollmentDetail;
import pe.com.unmsm.classroom.bean.Lab;
import pe.com.unmsm.classroom.bean.ProfessionalSchool;
import pe.com.unmsm.classroom.bean.Role;
import pe.com.unmsm.classroom.bean.Task;
import pe.com.unmsm.classroom.bean.User;
import pe.com.unmsm.classroom.bean.UserRol;
import pe.com.unmsm.classroom.patterns.facade.AccesoFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityContentFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityCourseFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityCurriculaFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityEnrollmentDetailFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityEnrollmentFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityLabFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityProfessionalSchoolFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityRoleFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityTaskFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityUserFacade;
import pe.com.unmsm.classroom.patterns.facade.EntityUserRolFacade;
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
		EntityEnrollmentDetailFacade entityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return entityEnrollmentDetailFacade.getAll();
	}

	@Override
	public EnrollmentDetail getEnrollmentDetail(Integer id) {
		EntityEnrollmentDetailFacade entityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return entityEnrollmentDetailFacade.get(id);
	}

	@Override
	public EnrollmentDetail postEnrollmentDetail(EnrollmentDetail request) {
		EntityEnrollmentDetailFacade entityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return entityEnrollmentDetailFacade.post(request);
	}

	@Override
	public ClientResponse putEnrollmentDetail(Integer id, EnrollmentDetail request) {
		EntityEnrollmentDetailFacade entityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return entityEnrollmentDetailFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteEnrollmentDetail(Integer id) {
		EntityEnrollmentDetailFacade entityEnrollmentDetailFacade = new EntityEnrollmentDetailFacade();

		return entityEnrollmentDetailFacade.delete(id);
	}

	@Override
	public List<Enrollment> getAllEnrollment() {
		EntityEnrollmentFacade entityEnrollmentFacade = new EntityEnrollmentFacade();

		return entityEnrollmentFacade.getAll();
	}

	@Override
	public Enrollment getEnrollment(Integer id) {
		EntityEnrollmentFacade entityEnrollmentFacade = new EntityEnrollmentFacade();

		return entityEnrollmentFacade.get(id);
	}

	@Override
	public Enrollment postEnrollment(Enrollment request) {
		EntityEnrollmentFacade entityEnrollmentFacade = new EntityEnrollmentFacade();

		return entityEnrollmentFacade.post(request);
	}

	@Override
	public ClientResponse putEnrollment(Integer id, Enrollment request) {
		EntityEnrollmentFacade entityEnrollmentFacade = new EntityEnrollmentFacade();

		return entityEnrollmentFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteEnrollment(Integer id) {
		EntityEnrollmentFacade entityEnrollmentFacade = new EntityEnrollmentFacade();

		return entityEnrollmentFacade.delete(id);
	}

	@Override
	public List<Lab> getAllLab() {
		EntityLabFacade entityLabFacade = new EntityLabFacade();

		return entityLabFacade.getAll();
	}

	@Override
	public Lab getLab(Integer id) {
		EntityLabFacade entityLabFacade = new EntityLabFacade();

		return entityLabFacade.get(id);
	}

	@Override
	public Lab postLab(Lab request) {
		EntityLabFacade entityLabFacade = new EntityLabFacade();

		return entityLabFacade.post(request);
	}

	@Override
	public ClientResponse putLab(Integer id, Lab request) {
		EntityLabFacade entityLabFacade = new EntityLabFacade();

		return entityLabFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteLab(Integer id) {
		EntityLabFacade entityLabFacade = new EntityLabFacade();

		return entityLabFacade.delete(id);
	}

	@Override
	public List<ProfessionalSchool> getAllProfessionalSchool() {
		EntityProfessionalSchoolFacade entityProfessionalSchoolFacade = new EntityProfessionalSchoolFacade();

		return entityProfessionalSchoolFacade.getAll();
	}

	@Override
	public ProfessionalSchool getProfessionalSchool(Integer id) {
		EntityProfessionalSchoolFacade entityProfessionalSchoolFacade = new EntityProfessionalSchoolFacade();

		return entityProfessionalSchoolFacade.get(id);
	}

	@Override
	public ProfessionalSchool postProfessionalSchool(ProfessionalSchool request) {
		EntityProfessionalSchoolFacade entityProfessionalSchoolFacade = new EntityProfessionalSchoolFacade();

		return entityProfessionalSchoolFacade.post(request);
	}

	@Override
	public ClientResponse putProfessionalSchool(Integer id, ProfessionalSchool request) {
		EntityProfessionalSchoolFacade entityProfessionalSchoolFacade = new EntityProfessionalSchoolFacade();

		return entityProfessionalSchoolFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteProfessionalSchool(Integer id) {
		EntityProfessionalSchoolFacade entityProfessionalSchoolFacade = new EntityProfessionalSchoolFacade();

		return entityProfessionalSchoolFacade.delete(id);
	}

	@Override
	public List<Role> getAllRole() {
		EntityRoleFacade entityRoleFacade = new EntityRoleFacade();

		return entityRoleFacade.getAll();
	}

	@Override
	public Role getRole(Integer id) {
		EntityRoleFacade entityRoleFacade = new EntityRoleFacade();

		return entityRoleFacade.get(id);
	}

	@Override
	public Role postRole(Role request) {
		EntityRoleFacade entityRoleFacade = new EntityRoleFacade();

		return entityRoleFacade.post(request);
	}

	@Override
	public ClientResponse putRole(Integer id, Role request) {
		EntityRoleFacade entityRoleFacade = new EntityRoleFacade();

		return entityRoleFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteRole(Integer id) {
		EntityRoleFacade entityRoleFacade = new EntityRoleFacade();

		return entityRoleFacade.delete(id);
	}

	@Override
	public List<Task> getAllTask() {
		EntityTaskFacade entityTaskFacade = new EntityTaskFacade();

		return entityTaskFacade.getAll();
	}

	@Override
	public Task getTask(Integer id) {
		EntityTaskFacade entityTaskFacade = new EntityTaskFacade();

		return entityTaskFacade.get(id);
	}

	@Override
	public Task postTask(Task request) {
		EntityTaskFacade entityTaskFacade = new EntityTaskFacade();

		return entityTaskFacade.post(request);
	}

	@Override
	public ClientResponse putTask(Integer id, Task request) {
		EntityTaskFacade entityTaskFacade = new EntityTaskFacade();

		return entityTaskFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteTask(Integer id) {
		EntityTaskFacade entityTaskFacade = new EntityTaskFacade();

		return entityTaskFacade.delete(id);
	}

	@Override
	public List<UserRol> getAllUserRol() {
		EntityUserRolFacade entityUserRolFacade = new EntityUserRolFacade();

		return entityUserRolFacade.getAll();
	}

	@Override
	public UserRol getUserRol(Integer id) {
		EntityUserRolFacade entityUserRolFacade = new EntityUserRolFacade();

		return entityUserRolFacade.get(id);
	}

	@Override
	public UserRol postUserRol(UserRol request) {
		EntityUserRolFacade entityUserRolFacade = new EntityUserRolFacade();

		return entityUserRolFacade.post(request);
	}

	@Override
	public ClientResponse putUserRol(Integer id, UserRol request) {
		EntityUserRolFacade entityUserRolFacade = new EntityUserRolFacade();

		return entityUserRolFacade.put(id, request);
	}

	@Override
	public ClientResponse deleteUserRol(Integer id) {
		EntityUserRolFacade entityUserRolFacade = new EntityUserRolFacade();

		return entityUserRolFacade.delete(id);
	}
}
