package com.codemouse.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class ResultSetTest {

	@Test
	public void testConstructorInject() throws ClassNotFoundException,
			SQLException {
		String driverName = "net.sourceforge.jtds.jdbc.Driver";
		String url = "jdbc:jtds:sqlserver://172.19.4.85:1432;DatabaseName=sword_qianan_dts;SelectMethod=Cursor";
		String user = "sa";
		String password = "135246";

		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url, user, password);
		cursorHoldabilitySupport(conn);
	}

	@SuppressWarnings("unused")
	private void cursorHoldabilitySupport(Connection conn) throws SQLException {

		DatabaseMetaData dbMetaData = conn.getMetaData();
		System.out.println("ResultSet.HOLD_CURSORS_OVER_COMMIT = "
				+ ResultSet.HOLD_CURSORS_OVER_COMMIT);

		System.out.println("ResultSet.CLOSE_CURSORS_AT_COMMIT = "
				+ ResultSet.CLOSE_CURSORS_AT_COMMIT);

		System.out.println("Default cursor holdability: "
				+ dbMetaData.getResultSetHoldability());

		System.out
				.println("Support TYPE_FORWARD_ONLY?"
						+ dbMetaData
								.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
		System.out
				.println("Support TYPE_SCROLL_SENSITIVE?"
						+ dbMetaData
								.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
		System.out
		.println("Support TYPE_SCROLL_INSENSITIVE?"
				+ dbMetaData
						.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
		
		System.out
		.println("Support TYPE_FORWARD_ONLY and CONCUR_READ_ONLY?"
				+ dbMetaData
						.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY));
		System.out
		.println("Support TYPE_FORWARD_ONLY and CONCUR_UPDATABLE?"
				+ dbMetaData
						.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE));

		System.out
				.println("Supports HOLD_CURSORS_OVER_COMMIT? "
						+ dbMetaData
								.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));

		System.out
				.println("Supports CLOSE_CURSORS_AT_COMMIT? "
						+ dbMetaData
								.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT));
	}
}
