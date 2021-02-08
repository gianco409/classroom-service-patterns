package pe.com.unmsm.classroom.service;

import java.util.List;

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
import pe.com.unmsm.classroom.request.AccesoRequest;
import pe.com.unmsm.classroom.response.AccesoResponse;

public interface IClassroomService {
	public AccesoResponse singup(AccesoRequest request);

	public AccesoResponse singin(AccesoRequest request);

	public AccesoResponse logout(String authorization);

	public AccesoResponse verifyAccessToken(AccesoRequest request);

	public List<User> getAllUser();

	public User getUser(Integer id);

	public User postUser(User request);

	public ClientResponse putUser(Integer id, User request);

	public ClientResponse deleteUser(Integer id);

	public List<Content> getAllContent();

	public Content getContent(Integer id);

	public Content postContent(Content request);

	public ClientResponse putContent(Integer id, Content request);

	public ClientResponse deleteContent(Integer id);

	public List<Course> getAllCourse();

	public Course getCourse(Integer id);

	public Course postCourse(Course request);

	public ClientResponse putCourse(Integer id, Course request);

	public ClientResponse deleteCourse(Integer id);

	public List<Curricula> getAllCurricula();

	public Curricula getCurricula(Integer id);

	public Curricula postCurricula(Curricula request);

	public ClientResponse putCurricula(Integer id, Curricula request);

	public ClientResponse deleteCurricula(Integer id);

	public List<EnrollmentDetail> getAllEnrollmentDetail();

	public EnrollmentDetail getEnrollmentDetail(Integer id);

	public EnrollmentDetail postEnrollmentDetail(EnrollmentDetail request);

	public ClientResponse putEnrollmentDetail(Integer id, EnrollmentDetail request);

	public ClientResponse deleteEnrollmentDetail(Integer id);

	public List<Enrollment> getAllEnrollment();

	public Enrollment getEnrollment(Integer id);

	public Enrollment postEnrollment(Enrollment request);

	public ClientResponse putEnrollment(Integer id, Enrollment request);

	public ClientResponse deleteEnrollment(Integer id);

	public List<Lab> getAllLab();

	public Lab getLab(Integer id);

	public Lab postLab(Lab request);

	public ClientResponse putLab(Integer id, Lab request);

	public ClientResponse deleteLab(Integer id);

	public List<ProfessionalSchool> getAllProfessionalSchool();

	public ProfessionalSchool getProfessionalSchool(Integer id);

	public ProfessionalSchool postProfessionalSchool(ProfessionalSchool request);

	public ClientResponse putProfessionalSchool(Integer id, ProfessionalSchool request);

	public ClientResponse deleteProfessionalSchool(Integer id);

	public List<Role> getAllRole();

	public Role getRole(Integer id);

	public Role postRole(Role request);

	public ClientResponse putRole(Integer id, Role request);

	public ClientResponse deleteRole(Integer id);

	public List<Task> getAllTask();

	public Task getTask(Integer id);

	public Task postTask(Task request);

	public ClientResponse putTask(Integer id, Task request);

	public ClientResponse deleteTask(Integer id);

	public List<UserRol> getAllUserRol();

	public UserRol getUserRol(Integer id);

	public UserRol postUserRol(UserRol request);

	public ClientResponse putUserRol(Integer id, UserRol request);

	public ClientResponse deleteUserRol(Integer id);
}
