package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Watcher;

public class WatcherBuilder implements IEntityBuilder<Watcher>{

	@Override
	public Watcher build(ResultSet rs) throws SQLException {
		Watcher watcher = new Watcher();
		watcher.setId(rs.getInt("id"));
		watcher.setTitle(rs.getString("title"));
		watcher.setType(rs.getString("type"));
		watcher.setCategory(rs.getString("category"));
		watcher.setScore(rs.getInt("score"));
		watcher.setEpisodes(rs.getInt("episodes"));
		watcher.setTimeInMinutes(rs.getInt("timeinminutes"));
		return watcher;
	}

}
