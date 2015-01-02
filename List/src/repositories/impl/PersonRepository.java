package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import unitofwork.IUnitOfWork;
import domain.Person;

public class PersonRepository
extends Repository<Person>{

	public PersonRepository(Connection connection, IEntityBuilder<Person> builder, IUnitOfWork uow) {
		super(connection,builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Person entity) throws SQLException {
		update.setString(1, entity.getFirstName());
		update.setString(2, entity.getSurName());
		update.setString(3, entity.getCountry());
		update.setInt(4, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Person entity) throws SQLException {
		insert.setString(1, entity.getFirstName());
		insert.setString(2, entity.getSurName());
		insert.setString(3, entity.getCountry());
		
	}

	@Override
	protected String getTableName() {
		return "people";
	}

	@Override
	protected String getUpdateQuery() {
		return "update person set (name,surname,country)=(?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into person(name,surname,country) values(?,?,?)";
	}
	
}
