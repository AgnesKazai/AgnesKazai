package com.greenfox.aze.reddit.redditapp.services;


import java.util.List;


public interface GenericService<Type> {

    void addItem(Type item);

    List<Type> getAllItem();

    void deleteItem(Type item);

    void updateItem(Type item);

    Type findItemById(Long id);
}
