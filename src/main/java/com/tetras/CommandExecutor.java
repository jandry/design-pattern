package com.tetras;

public interface CommandExecutor {

    void connect(String host, int port, String user, String password);

    Result execute(String query);

    void close();
}