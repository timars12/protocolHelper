package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "workProtocol")
public class WorkProtocol {
    @ColumnInfo(name = "work_protocol_id")
    @PrimaryKey(autoGenerate = true)
    public long id;

    //TODO add шапку для протокола
}
