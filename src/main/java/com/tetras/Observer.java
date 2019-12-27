package com.tetras;

public interface Observer<E> {

    void notify(E element);
}