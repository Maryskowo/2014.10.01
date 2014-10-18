package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.*;

public class Db {

	List<Role> roles = new ArrayList<Role>();
	List<User> users = new ArrayList<User>();
	List<Privilege> privileges = new ArrayList<Privilege>();
	List<Reader> readers = new ArrayList<Reader>();
	List<Watcher> watchers = new ArrayList<Watcher>();
}
