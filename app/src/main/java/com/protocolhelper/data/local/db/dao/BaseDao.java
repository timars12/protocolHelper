package com.protocolhelper.data.local.db.dao;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

import java.util.List;

public interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(T obj);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(T... obj);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<T> list);

    @Update
    void update(T obj);

    @Delete
    void delete(T obj);
}
