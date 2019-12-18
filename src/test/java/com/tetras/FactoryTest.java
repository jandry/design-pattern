package com.tetras;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testOracle() {
        OracleCommandExecutor executor = new OracleCommandExecutor();
        assertTrue(executor instanceof OracleCommandExecutor);
        executor.connect("localhost", 1521, "toto", "password");
        assertNotNull(executor.execute("query"));
        executor.close();
    }

    @Test
    public void testMariaDb() {
        MariaDbCommandExecutor executor = new MariaDbCommandExecutor();
        assertTrue(executor instanceof MariaDbCommandExecutor);
        executor.connect("localhost", 1521, "toto", "password");
        assertNotNull(executor.execute("query"));
        executor.close();
    }
}