package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Reader;

public class ReaderBuilder implements IEntityBuilder<Reader>{

	@Override
	public Reader build(ResultSet rs) throws SQLException {
		Reader reader = new Reader();
		reader.setId(rs.getInt("id"));
		reader.setTitle(rs.getString("title"));
		reader.setType(rs.getString("type"));
		reader.setCategory(rs.getString("Category"));
		reader.setPages(rs.getInt("pages"));
		reader.setScore(rs.getInt("score"));
		
		return reader;
	}

}
