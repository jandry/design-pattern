package com.tetras;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryTest {

    private void assertExecutor(CommandExecutor executor) {

        executor.connect("localhost", 1521, "toto", "password");
        assertNotNull(executor.execute("query"));
        executor.close();
    }

    @Test
    public void testOracle() {
        CommandExecutor executor = CommandExecutorFactory.getCommandExecutor(DbType.oracle);
        assertTrue(executor instanceof OracleCommandExecutor);
        assertExecutor(executor);
    }

    @Test
    public void testMariaDb() {
        CommandExecutor executor = CommandExecutorFactory.getCommandExecutor(DbType.mariaDb);
        assertTrue(executor instanceof MariaDbCommandExecutor);
        assertExecutor(executor);
    }

}