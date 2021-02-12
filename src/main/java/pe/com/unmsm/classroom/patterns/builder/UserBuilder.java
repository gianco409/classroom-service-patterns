package pe.com.unmsm.classroom.patterns.builder;

import pe.com.unmsm.classroom.bean.User;

public class UserBuilder implements IBuilder {

	private Integer idUser;
	private String firstName;
	private String lastName;
	private String birthdate;
	private Integer idProfessionalSchool;
	private String career;
	private String username;
	private String password;

	public UserBuilder withId(Integer id) {
		this.idUser = id;
		return this;
	}

	public UserBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder withlastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder withBirthdate(String birthdate) {
		this.birthdate = birthdate;
		return this;
	}

	public UserBuilder withIdProfessionalSchool(Integer idProfessionalSchool) {
		this.idProfessionalSchool = idProfessionalSchool;
		return this;
	}

	public UserBuilder withCareer(String career) {
		this.career = career;
		return this;
	}

	public UserBuilder withUsername(String username) {
		this.username = username;
		return this;
	}

	public UserBuilder withpassword(String password) {
		this.password = password;
		return this;
	}

	@Override
	public User build() {
		User user = new User();

		user.setIdUser(this.idUser);
		user.setFirstName(this.firstName);
		user.setLastName(this.lastName);
		user.setBirthdate(this.birthdate);
		user.setIdProfessionalSchool(this.idProfessionalSchool);
		user.setCareer(this.career);
		return user;
	}

}
