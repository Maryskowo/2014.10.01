package repositories.impl;

import java.util.List;

import domain.Role;
import domain.User;
import repositories.IUserRepository;

public class UserRepository implements IUserRepository{

	Db db;

	
	public UserRepository(Db db) {
		super();
		this.db = db;
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
	public void add(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
