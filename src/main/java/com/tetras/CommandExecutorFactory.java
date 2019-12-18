package com.tetras;

public class CommandExecutorFactory {

    public static CommandExecutor getCommandExecutor(DbType type) {
        if (DbType.oracle.equals(type))
            return new OracleCommandExecutor();
        else if (DbType.mariaDb.equals(type))
            return new MariaDbCommandExecutor();
        else
            throw new IllegalArgumentException();
    }
}