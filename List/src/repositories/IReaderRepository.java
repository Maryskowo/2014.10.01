package repositories;

import java.util.List;

import domain.Reader;
import domain.User;

public interface IReaderRepository extends IRepository<Reader>{

	public List<User> bReader(Reader reader);
	public List<User> bReader(String title);
	public List<User> bReader(int readerId);
	
}
