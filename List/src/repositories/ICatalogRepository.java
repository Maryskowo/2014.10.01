package repositories;

public interface ICatalogRepository {

	public IReaderRepository getReader();
	public IWatcherRepository getWatcher();
}
