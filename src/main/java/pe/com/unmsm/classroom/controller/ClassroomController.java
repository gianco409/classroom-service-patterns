package pe.com.unmsm.classroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
import pe.com.unmsm.classroom.service.IClassroomService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class ClassroomController {

	@Autowired
	private IClassroomService service;

	@PostMapping("/signup")
	public ResponseEntity<AccesoResponse> singup(@RequestBody AccesoRequest request) {
		return ResponseEntity.ok(service.singup(request));
	}

	@PostMapping("/signin")
	public ResponseEntity<AccesoResponse> singin(@RequestBody AccesoRequest request) {
		return ResponseEntity.ok(service.singin(request));
	}

	@PostMapping("/logout")
	public ResponseEntity<AccesoResponse> logout(@RequestHeader("Authorization") String authorization) {
		return ResponseEntity.ok(service.logout(authorization));
	}

	@PostMapping("/verify-access-token")
	public ResponseEntity<AccesoResponse> verifyAccessToken(@RequestBody AccesoRequest request) {
		return ResponseEntity.ok(service.verifyAccessToken(request));
	}

	@GetMapping("/Users")
	public ResponseEntity<List<User>> getAllUser() {
		return ResponseEntity.ok(service.getAllUser());
	}

	@GetMapping("/Users/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getUser(id));
	}

	@PostMapping("/Users")
	public ResponseEntity<User> postUser(@RequestBody User request) {
		return ResponseEntity.ok(service.postUser(request));
	}

	@PutMapping("/Users/{id}")
	public ResponseEntity<ClientResponse> putUser(@PathVariable Integer id, @RequestBody User request) {
		return ResponseEntity.ok(service.putUser(id, request));
	}

	@DeleteMapping("/Users/{id}")
	public ResponseEntity<ClientResponse> deleteUser(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteUser(id));
	}

	@GetMapping("/Contents")
	public ResponseEntity<List<Content>> getAllContent() {
		return ResponseEntity.ok(service.getAllContent());
	}

	@GetMapping("/Contents/{id}")
	public ResponseEntity<Content> getContent(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getContent(id));
	}

	@PostMapping("/Contents")
	public ResponseEntity<Content> postContent(@RequestBody Content request) {
		return ResponseEntity.ok(service.postContent(request));
	}

	@PutMapping("/Contents/{id}")
	public ResponseEntity<ClientResponse> putContent(@PathVariable Integer id, @RequestBody Content request) {
		return ResponseEntity.ok(service.putContent(id, request));
	}

	@DeleteMapping("/Contents/{id}")
	public ResponseEntity<ClientResponse> deleteContent(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteContent(id));
	}

	@GetMapping("/Courses")
	public ResponseEntity<List<Course>> getAllCourse() {
		return ResponseEntity.ok(service.getAllCourse());
	}

	@GetMapping("/Courses/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getCourse(id));
	}

	@PostMapping("/Courses")
	public ResponseEntity<Course> postCourse(@RequestBody Course request) {
		return ResponseEntity.ok(service.postCourse(request));
	}

	@PutMapping("/Courses/{id}")
	public ResponseEntity<ClientResponse> putCourse(@PathVariable Integer id, @RequestBody Course request) {
		return ResponseEntity.ok(service.putCourse(id, request));
	}

	@DeleteMapping("/Courses/{id}")
	public ResponseEntity<ClientResponse> deleteCourse(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteCourse(id));
	}

	@GetMapping("/Curricula")
	public ResponseEntity<List<Curricula>> getAllCurricula() {
		return ResponseEntity.ok(service.getAllCurricula());
	}

	@GetMapping("/Curricula/{id}")
	public ResponseEntity<Curricula> getCurricula(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getCurricula(id));
	}

	@PostMapping("/Curricula")
	public ResponseEntity<Curricula> postCurricula(@RequestBody Curricula request) {
		return ResponseEntity.ok(service.postCurricula(request));
	}

	@PutMapping("/Curricula/{id}")
	public ResponseEntity<ClientResponse> putCurricula(@PathVariable Integer id, @RequestBody Curricula request) {
		return ResponseEntity.ok(service.putCurricula(id, request));
	}

	@DeleteMapping("/Curricula/{id}")
	public ResponseEntity<ClientResponse> deleteCurricula(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteCurricula(id));
	}

	@GetMapping("/EnrollmentDetails")
	public ResponseEntity<List<EnrollmentDetail>> getAllEnrollmentDetail() {
		return ResponseEntity.ok(service.getAllEnrollmentDetail());
	}

	@GetMapping("/EnrollmentDetails/{id}")
	public ResponseEntity<EnrollmentDetail> getEnrollmentDetail(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getEnrollmentDetail(id));
	}

	@PostMapping("/EnrollmentDetails")
	public ResponseEntity<EnrollmentDetail> postEnrollmentDetail(@RequestBody EnrollmentDetail request) {
		return ResponseEntity.ok(service.postEnrollmentDetail(request));
	}

	@PutMapping("/EnrollmentDetails/{id}")
	public ResponseEntity<ClientResponse> putEnrollmentDetail(@PathVariable Integer id,
			@RequestBody EnrollmentDetail request) {
		return ResponseEntity.ok(service.putEnrollmentDetail(id, request));
	}

	@DeleteMapping("/EnrollmentDetails/{id}")
	public ResponseEntity<ClientResponse> deleteEnrollmentDetail(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteEnrollmentDetail(id));
	}

	@GetMapping("/Enrollments")
	public ResponseEntity<List<Enrollment>> getAllEnrollment() {
		return ResponseEntity.ok(service.getAllEnrollment());
	}

	@GetMapping("/Enrollments/{id}")
	public ResponseEntity<Enrollment> getEnrollment(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getEnrollment(id));
	}

	@PostMapping("/Enrollments")
	public ResponseEntity<Enrollment> postEnrollment(@RequestBody Enrollment request) {
		return ResponseEntity.ok(service.postEnrollment(request));
	}

	@PutMapping("/Enrollments/{id}")
	public ResponseEntity<ClientResponse> putEnrollment(@PathVariable Integer id, @RequestBody Enrollment request) {
		return ResponseEntity.ok(service.putEnrollment(id, request));
	}

	@DeleteMapping("/Enrollments/{id}")
	public ResponseEntity<ClientResponse> deleteEnrollment(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteEnrollment(id));
	}

	@GetMapping("/Labs")
	public ResponseEntity<List<Lab>> getAllLab() {
		return ResponseEntity.ok(service.getAllLab());
	}

	@GetMapping("/Labs/{id}")
	public ResponseEntity<Lab> getLab(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getLab(id));
	}

	@PostMapping("/Labs")
	public ResponseEntity<Lab> postLab(@RequestBody Lab request) {
		return ResponseEntity.ok(service.postLab(request));
	}

	@PutMapping("/Labs/{id}")
	public ResponseEntity<ClientResponse> putLab(@PathVariable Integer id, @RequestBody Lab request) {
		return ResponseEntity.ok(service.putLab(id, request));
	}

	@DeleteMapping("/Labs/{id}")
	public ResponseEntity<ClientResponse> deleteLab(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteLab(id));
	}

	@GetMapping("/ProfessionalSchools")
	public ResponseEntity<List<ProfessionalSchool>> getAllProfessionalSchool() {
		return ResponseEntity.ok(service.getAllProfessionalSchool());
	}

	@GetMapping("/ProfessionalSchools/{id}")
	public ResponseEntity<ProfessionalSchool> getProfessionalSchool(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getProfessionalSchool(id));
	}

	@PostMapping("/ProfessionalSchools")
	public ResponseEntity<ProfessionalSchool> postProfessionalSchool(@RequestBody ProfessionalSchool request) {
		return ResponseEntity.ok(service.postProfessionalSchool(request));
	}

	@PutMapping("/ProfessionalSchools/{id}")
	public ResponseEntity<ClientResponse> putProfessionalSchool(@PathVariable Integer id,
			@RequestBody ProfessionalSchool request) {
		return ResponseEntity.ok(service.putProfessionalSchool(id, request));
	}

	@DeleteMapping("/ProfessionalSchools/{id}")
	public ResponseEntity<ClientResponse> deleteProfessionalSchool(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteProfessionalSchool(id));
	}

	@GetMapping("/Roles")
	public ResponseEntity<List<Role>> getAllRole() {
		return ResponseEntity.ok(service.getAllRole());
	}

	@GetMapping("/Roles/{id}")
	public ResponseEntity<Role> getRole(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getRole(id));
	}

	@PostMapping("/Roles")
	public ResponseEntity<Role> postRole(@RequestBody Role request) {
		return ResponseEntity.ok(service.postRole(request));
	}

	@PutMapping("/Roles/{id}")
	public ResponseEntity<ClientResponse> putRole(@PathVariable Integer id, @RequestBody Role request) {
		return ResponseEntity.ok(service.putRole(id, request));
	}

	@DeleteMapping("/Roles/{id}")
	public ResponseEntity<ClientResponse> deleteRole(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteRole(id));
	}

	@GetMapping("/Tareas")
	public ResponseEntity<List<Task>> getAllTask() {
		return ResponseEntity.ok(service.getAllTask());
	}

	@GetMapping("/Tareas/{id}")
	public ResponseEntity<Task> getTask(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getTask(id));
	}

	@PostMapping("/Tareas")
	public ResponseEntity<Task> postTask(@RequestBody Task request) {
		return ResponseEntity.ok(service.postTask(request));
	}

	@PutMapping("/Tareas/{id}")
	public ResponseEntity<ClientResponse> putTask(@PathVariable Integer id, @RequestBody Task request) {
		return ResponseEntity.ok(service.putTask(id, request));
	}

	@DeleteMapping("/Tareas/{id}")
	public ResponseEntity<ClientResponse> deleteTask(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteTask(id));
	}

	@GetMapping("/UserRoles")
	public ResponseEntity<List<UserRol>> getAllUserRol() {
		return ResponseEntity.ok(service.getAllUserRol());
	}

	@GetMapping("/UserRoles/{id}")
	public ResponseEntity<UserRol> getUserRol(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getUserRol(id));
	}

	@PostMapping("/UserRoles")
	public ResponseEntity<UserRol> postUserRol(@RequestBody UserRol request) {
		return ResponseEntity.ok(service.postUserRol(request));
	}

	@PutMapping("/UserRoles/{id}")
	public ResponseEntity<ClientResponse> putUserRol(@PathVariable Integer id, @RequestBody UserRol request) {
		return ResponseEntity.ok(service.putUserRol(id, request));
	}

	@DeleteMapping("/UserRoles/{id}")
	public ResponseEntity<ClientResponse> deleteUserRol(@PathVariable Integer id) {
		return ResponseEntity.ok(service.deleteUserRol(id));
	}
}
