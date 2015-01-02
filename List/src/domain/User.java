package domain;
import java.util.ArrayList;
import java.util.List;


public class User extends Entity {

	
	private String login;
	
	private String userName;
	private String password;
	//private String type;
	private List<Reader> reader;
	private List<Watcher> watcher;
	private double avgPages;
	private double avgTime;
	private double avgReaderScore;
	private double avgWatcherScore;
	//private String avgReader;
	//private double avgWatcher;
	private Person person;
	private List<Role> roles;
	private List<Reader> readers;
	private List<Watcher> watchers;
	
	public User(){
		this.reader = new ArrayList<Reader>();
		this.watcher = new ArrayList<Watcher>();
		roles = new ArrayList<Role>();
		readers = new ArrayList<Reader>();
		watchers = new ArrayList<Watcher>();
	}

	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}*/

	public List<Reader> getReader() {
		return reader;
	}

	public void setReader(List<Reader> reader) {
		this.reader = reader;
	}

	public List<Watcher> getWatcher() {
		return watcher;
	}

	public void setWatcher(List<Watcher> watcher) {
		this.watcher = watcher;
	}


	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public double getAvgPages() {
		for(int i = 0; reader.size() > i; i++){
			avgPages = avgPages + reader.get(i).getPages();
			if(reader.size() == i){ avgPages = avgPages / (double)i;}
		}
		
		return avgPages;
	}

	public double getAvgTime() {
		for(int i = 0; watcher.size() > i; i++){
			avgTime = avgTime + watcher.get(i).getTimeInMinutes();
			if(watcher.size() == i){ avgTime = avgTime / (double)i;}
		}
		return avgTime;
	}

	public double getAvgReaderScore() {
		for(int i = 0; reader.size() > i; i++){
			avgReaderScore = avgReaderScore + reader.get(i).getScore();
			if(reader.size() == i){ avgReaderScore = avgReaderScore / (double)i;}
		}
		return avgReaderScore;
	}

	public double getAvgWatcherScore() {
		for(int i = 0; watcher.size() > i; i++){
			avgWatcherScore = avgWatcherScore + watcher.get(i).getScore();
			if(watcher.size() == i){ avgWatcherScore = avgWatcherScore / (double)i;}
		}
		return avgWatcherScore;
	}

	public List<Reader> getReaders() {
		return readers;
	}

	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}

	public List<Watcher> getWatchers() {
		return watchers;
	}

	public void setWatchers(List<Watcher> watchers) {
		this.watchers = watchers;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
