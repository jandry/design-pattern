package com.tetras;

public class MariaDbCommandExecutor implements CommandExecutor {

    public void connect(String host, int port, String user, String password) {

    }

    public Result execute(String query) {
        return new Result();
    }

    public void close() {

    }
}