package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.User;
import domain.Watcher;
import repositories.IWatcherRepository;

public class WatcherRepository implements IWatcherRepository{

	Db db;
	
	public WatcherRepository(Db db){
		this.db = db;
	}
	
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
	}

}
