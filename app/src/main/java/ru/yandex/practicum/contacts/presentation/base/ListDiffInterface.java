package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    boolean theSameAs(T t);
    @Override
    public boolean equals(Object o);
}
