package pe.com.unmsm.classroom.patterns.builder;

import pe.com.unmsm.classroom.bean.User;

public class UserBuilder implements IBuilder {

	private String nombre;
	private String fechaNacimiento;
	private String genero;
	private String telefono;

	public UserBuilder withName(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public UserBuilder withBirthday(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}

	public UserBuilder withGenre(String genero) {
		this.genero = genero;
		return this;
	}

	public UserBuilder withPhone(String telefono) {
		this.telefono = telefono;
		return this;
	}

	@Override
	public User build() {
		User alumno = new User();
//		alumno.setNombre(this.nombre);
//		alumno.setFechaNacimiento(this.fechaNacimiento);
//		alumno.setGenero(this.genero);
//		alumno.setTelefono(this.telefono);
		return alumno;
	}

}
