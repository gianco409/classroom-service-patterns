package pe.com.unmsm.classroom.patterns.iterator;

import java.util.List;
import java.util.Vector;

import pe.com.unmsm.classroom.bean.User;

public class AgregadoConcreto implements Agregado {
	@SuppressWarnings("rawtypes")
	protected Vector aDatos = new Vector();

	public AgregadoConcreto(List<User> user) {
		this.llenar(user);
	}

	@Override
	public Iterador getIterador() {
		return new IteradorConcreto(this);
	}

	@SuppressWarnings("unchecked")
	public void llenar(List<User> userlist) {
		this.aDatos.add(userlist.get(0));
	}
}
