package net.halfrunt.jdbctm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class JdbcTmStatement implements Statement {

	private final Statement statement;

	public JdbcTmStatement(Statement statement) {
		this.statement = statement;
	}

	public void addBatch(String sql) throws SQLException {
		this.statement.addBatch(sql);
	}

	public void cancel() throws SQLException {
		this.statement.cancel();
	}

	public void clearBatch() throws SQLException {
		this.statement.clearBatch();
	}

	public void clearWarnings() throws SQLException {
		this.statement.clearWarnings();
	}

	public void close() throws SQLException {
		this.statement.close();
	}

	public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
		return this.statement.execute(sql, autoGeneratedKeys);
	}

	public boolean execute(String sql, int[] columnIndexes) throws SQLException {
		return this.statement.execute(sql, columnIndexes);
	}

	public boolean execute(String sql, String[] columnNames) throws SQLException {
		return this.statement.execute(sql, columnNames);
	}

	public boolean execute(String sql) throws SQLException {
		return this.statement.execute(sql);
	}

	public int[] executeBatch() throws SQLException {
		return this.statement.executeBatch();
	}

	public ResultSet executeQuery(String sql) throws SQLException {
		return this.statement.executeQuery(sql);
	}

	public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
		return this.statement.executeUpdate(sql, autoGeneratedKeys);
	}

	public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
		return this.statement.executeUpdate(sql, columnIndexes);
	}

	public int executeUpdate(String sql, String[] columnNames) throws SQLException {
		return this.statement.executeUpdate(sql, columnNames);
	}

	public int executeUpdate(String sql) throws SQLException {
		return this.statement.executeUpdate(sql);
	}

	public Connection getConnection() throws SQLException {
		return this.statement.getConnection();
	}

	public int getFetchDirection() throws SQLException {
		return this.statement.getFetchDirection();
	}

	public int getFetchSize() throws SQLException {
		return this.statement.getFetchSize();
	}

	public ResultSet getGeneratedKeys() throws SQLException {
		return this.statement.getGeneratedKeys();
	}

	public int getMaxFieldSize() throws SQLException {
		return this.statement.getMaxFieldSize();
	}

	public int getMaxRows() throws SQLException {
		return this.statement.getMaxRows();
	}

	public boolean getMoreResults() throws SQLException {
		return this.statement.getMoreResults();
	}

	public boolean getMoreResults(int current) throws SQLException {
		return this.statement.getMoreResults(current);
	}

	public int getQueryTimeout() throws SQLException {
		return this.statement.getQueryTimeout();
	}

	public ResultSet getResultSet() throws SQLException {
		return this.statement.getResultSet();
	}

	public int getResultSetConcurrency() throws SQLException {
		return this.statement.getResultSetConcurrency();
	}

	public int getResultSetHoldability() throws SQLException {
		return this.statement.getResultSetHoldability();
	}

	public int getResultSetType() throws SQLException {
		return this.statement.getResultSetType();
	}

	public int getUpdateCount() throws SQLException {
		return this.statement.getUpdateCount();
	}

	public SQLWarning getWarnings() throws SQLException {
		return this.statement.getWarnings();
	}

	public boolean isClosed() throws SQLException {
		return this.statement.isClosed();
	}

	public boolean isPoolable() throws SQLException {
		return this.statement.isPoolable();
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.statement.isWrapperFor(iface);
	}

	public void setCursorName(String name) throws SQLException {
		this.statement.setCursorName(name);
	}

	public void setEscapeProcessing(boolean enable) throws SQLException {
		this.statement.setEscapeProcessing(enable);
	}

	public void setFetchDirection(int direction) throws SQLException {
		this.statement.setFetchDirection(direction);
	}

	public void setFetchSize(int rows) throws SQLException {
		this.statement.setFetchSize(rows);
	}

	public void setMaxFieldSize(int max) throws SQLException {
		this.statement.setMaxFieldSize(max);
	}

	public void setMaxRows(int max) throws SQLException {
		this.statement.setMaxRows(max);
	}

	public void setPoolable(boolean poolable) throws SQLException {
		this.statement.setPoolable(poolable);
	}

	public void setQueryTimeout(int seconds) throws SQLException {
		this.statement.setQueryTimeout(seconds);
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return this.statement.unwrap(iface);
	}

}
