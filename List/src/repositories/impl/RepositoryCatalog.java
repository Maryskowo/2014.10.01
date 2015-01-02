package repositories.impl;

import java.sql.Connection;

import domain.Person;
import domain.Role;
import repositories.IReaderRepository;
import repositories.ICatalogRepository;
import repositories.IRepository;
import repositories.IUserRepository;
import repositories.IWatcherRepository;
import unitofwork.IUnitOfWork;

public class RepositoryCatalog implements ICatalogRepository{

	
	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}
	
	Db db = new Db();
	
	public IReaderRepository getReader() {
		return new ReaderRepository(connection, new ReaderBuilder(), uow);
	}

	public IWatcherRepository getWatcher() {
		return new WatcherRepository(connection, new WatcherBuilder(), uow);
	}

	@Override
	public IUserRepository getUsers() {
		return new UserRepository(connection, new UserBuilder(), uow);
	}

	@Override
	public IRepository<Person> getPersons() {
		return new PersonRepository(connection, new PersonBuilder(), uow);
	}

	@Override
	public IRepository<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
