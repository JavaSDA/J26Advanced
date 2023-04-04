package com.company.practicalEx.longestword;

@FunctionalInterface
public interface LengthFunction<T> {
    int getLength(T element);
}
