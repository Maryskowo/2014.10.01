package repositories;

import java.util.List;

import domain.User;
import domain.Watcher;

public interface IWatcherRepository extends IRepository<Watcher>{

	public List<User> bWatcher(Watcher watcher);
	public List<User> bWatcher(String watcherTitle);
	public List<User> bWatcher(int watcherId);
}
