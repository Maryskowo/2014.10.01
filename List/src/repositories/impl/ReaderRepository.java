package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Reader;
import domain.User;
import repositories.IReaderRepository;

public class ReaderRepository implements IReaderRepository{

	Db db;
	
	public ReaderRepository(Db db){
		super();
		this.db = db;
	}
	
	public void add(Reader entity) {
		db.readers.add(entity);
		
	}

	public void update(Reader entity) {
		
	}

	
	public void delete(Reader entity) {
		db.readers.remove(entity);
		
	}

	
	public Reader get(int id) {
		for(Reader r : db.readers){
			if(r.getId() == id){
				return r;
			}
		}
		return null;
	}

	
	public List<Reader> getAll() {
		return db.readers;
	}

	public List<User> bReader(Reader reader) {
		return bReader(reader.getId());
	}
	
	public List<User> bReader(String readerTitle) {
		for(Reader r : db.readers)
			if(r.getTitle() == readerTitle)
				return r.getUsers();
			return new ArrayList<User>();
	}

	public List<User> bReader(int readerId) {
		for(Reader r : db.readers)
			if(r.getId() == readerId)
				return r.getUsers();
			return new ArrayList<User>();
	}

}
