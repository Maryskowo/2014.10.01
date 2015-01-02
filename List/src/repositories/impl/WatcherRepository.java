package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;
import domain.Watcher;
import repositories.IWatcherRepository;
import unitofwork.IUnitOfWork;

public class WatcherRepository
extends Repository<Watcher> 
implements IWatcherRepository
{

	
	
	public WatcherRepository(Connection connection, IEntityBuilder<Watcher> builder, IUnitOfWork uow) {
		super(connection,builder, uow);
	}
	
	/*Db db;
	
	public void add(Watcher entity) {
		db.watchers.add(entity);
		
	}

	public void update(Watcher entity) {
		
		
	}

	
	public void delete(Watcher entity) {
		db.watchers.remove(entity);
		
	}

	
	public Watcher get(int id) {
		for(Watcher w : db.watchers){
			if(w.getId() == id){
				return w;
			}
		}
		return null;
	}

	public List<Watcher> getAll() {
		return db.watchers;
	}

	public List<User> bWatcher(Watcher watcher) {
		return bWatcher(watcher.getId());
	}
	
	public List<User> bWatcher(String watcherTitle) {
		for(Watcher w : db.watchers)
			if(w.getTitle() == watcherTitle)
				return w.getUsers();
			return new ArrayList<User>();
			
	}

	public List<User> bWatcher(int watcherId) {
		for(Watcher w : db.watchers)
			if(w.getId() == watcherId)
				return w.getUsers();
			return new ArrayList<User>();
	}*/
	@Override
	public List<User> bWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> bWatcher(String watcherTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> bWatcher(int watcherId) {
		// TODO Auto-generated method stub
		return null;
	}
	//___________________________________________________________________________________
	
	@Override
	protected void setUpUpdateQuery(Watcher entity) throws SQLException {
		update.setString(1, entity.getTitle());
		update.setString(2, entity.getType());
		update.setString(3, entity.getCategory());
		update.setInt(4, entity.getScore());
		update.setInt(5, entity.getEpisodes());
		update.setInt(6, entity.getTimeInMinutes());
		update.setInt(7,  entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(Watcher entity) throws SQLException {
		
		insert.setString(1, entity.getTitle());
		insert.setString(2, entity.getType());
		insert.setString(3, entity.getCategory());
		insert.setInt(4, entity.getScore());
		insert.setInt(5, entity.getEpisodes());
		insert.setInt(6, entity.getTimeInMinutes());
		
	}

	@Override
	protected String getTableName() {
		return "watchers";
	}

	@Override
	protected String getUpdateQuery() {
		return 
				"UPDATE watchers SET (title,type,category,score,episodes,timeInMinutes=(?,?,?,?,?,?) WHERE id=?";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO watchers(title,type,category,score,episodes,timeInMinutes)"
				+ "VALUES(?,?,?,?,?,?)";
	}

}
