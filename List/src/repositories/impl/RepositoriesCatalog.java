package repositories.impl;

import repositories.IReaderRepository;
import repositories.ICatalogRepository;
import repositories.IWatcherRepository;

public class RepositoriesCatalog implements ICatalogRepository{

	Db db = new Db();
	
	public IReaderRepository getReader() {
		return new ReaderRepository(db);
	}

	public IWatcherRepository getWatcher() {
		return new WatcherRepository(db);
	}

}
