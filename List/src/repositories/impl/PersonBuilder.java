package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Person;

public class PersonBuilder implements IEntityBuilder<Person>{

	@Override
	public Person build(ResultSet rs) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setFirstName(rs.getString("firstName"));
		person.setSurName(rs.getString("surName"));
		person.setCountry(rs.getString("country"));
		return person;
	}

}
