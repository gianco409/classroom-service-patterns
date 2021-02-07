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
import pe.com.unmsm.classroom.bean.EnrollmentDetail;
import pe.com.unmsm.classroom.bean.User;
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
}
