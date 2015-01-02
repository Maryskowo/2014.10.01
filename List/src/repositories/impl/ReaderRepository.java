package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Reader;
import domain.User;
import repositories.IReaderRepository;
import unitofwork.IUnitOfWork;

public class ReaderRepository
extends Repository<Reader>
implements IReaderRepository
{

	Db db;
	
	public ReaderRepository(Connection connection, IEntityBuilder<Reader> builder, IUnitOfWork uow) {
		super(connection,builder, uow);
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

	@Override
	protected void setUpUpdateQuery(Reader entity) throws SQLException {
		update.setString(1, entity.getTitle());
		update.setString(2, entity.getType());
		update.setString(3, entity.getCategory());
		update.setInt(4, entity.getPages());
		update.setInt(5,  entity.getScore());
		update.setInt(6,  entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(Reader entity) throws SQLException {
		insert.setString(1, entity.getTitle());
		insert.setString(2, entity.getType());
		insert.setString(3, entity.getCategory());
		insert.setInt(4, entity.getPages());
		insert.setInt(5,  entity.getScore());
		
	}

	@Override
	protected String getTableName() {
		return "readers";
	}

	@Override
	protected String getUpdateQuery() {
		return "update readers set (title,type,category,pages,score)=(?,?,?,?,?)"
				+ "where id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "insert into readers(title,type,category,pages,score) values(?,?,?,?,?)";
	}

}
