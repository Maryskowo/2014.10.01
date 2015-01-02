package repositories;

import domain.Person;
import domain.Role;

public interface ICatalogRepository {

	public IUserRepository getUsers();
	public IRepository<Person> getPersons();
	public IRepository<Role> getRoles();
	public IReaderRepository getReader();
	public IWatcherRepository getWatcher();
}
