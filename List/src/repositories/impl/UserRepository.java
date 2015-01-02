package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import domain.Role;
import domain.User;
import repositories.IUserRepository;
import unitofwork.IUnitOfWork;

public class UserRepository 
extends Repository<User>
implements IUserRepository{


	
	public UserRepository(Connection connection, IEntityBuilder<User> builder, IUnitOfWork uow) {
		super(connection,builder, uow);
	}


	@Override
	public List<User> withRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withRole(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	protected void setUpUpdateQuery(User entity) throws SQLException {
		update.setString(1, entity.getLogin());
		update.setString(2, entity.getPassword());
		update.setInt(3, entity.getId());
		
	}


	@Override
	protected void setUpInsertQuery(User entity) throws SQLException {
		insert.setString(1, entity.getLogin());
		insert.setString(2, entity.getPassword());
		
	}


	@Override
	protected String getTableName() {
		return "users";
	}


	@Override
	protected String getUpdateQuery() {
		return 
				"UPDATE users SET (login,password)=(?,?) WHERE id=?";
	}


	@Override
	protected String getInsertQuery() {
		return "INSERT INTO users(login,password)"
				+ "VALUES(?,?)";
	}
}
