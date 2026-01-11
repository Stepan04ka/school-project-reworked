package com.javafxapplicationtest.objects;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;


class DatabaseConnectionTest {

	private DatabaseConnection databaseConnection;

	@BeforeEach
	void initialize() throws Exception {
        databaseConnection = new DatabaseConnection();
        databaseConnection.openConnection();
        databaseConnection.createConnectionStatement();
	}

	@AfterEach
	void destroy() {
		databaseConnection.closeResources();
		databaseConnection = null;
	}

	@Test
	void connectionOpennedTest() {
		Assertions.assertNotNull(databaseConnection.getConnection());
		Assertions.assertNotNull(databaseConnection.getStatement());
	}

    @Test
	void exceptionDontThrowingWhileProccedingTheQueryTest() {
		Assertions.assertDoesNotThrow(() -> {
			databaseConnection.makeQuery("CREATE TABLE IF NOT EXISTS myfellas ("
			+ "id INT PRIMARY KEY,"
			+ "name VARCHAR(33),"
			+ "job VARCHAR(33)"
			+ ");");
	    });
	}

}