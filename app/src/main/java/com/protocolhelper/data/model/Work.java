package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "work", foreignKeys = @ForeignKey(entity = TypeWork.class,
        parentColumns = "type_work_id",
        childColumns = "type_work_id",
        onDelete = CASCADE,
        onUpdate = CASCADE))
public class Work {

    @ColumnInfo(name = "type_work_id")
    public long typeWorkId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "work_id")
    public long workId;

    @ColumnInfo(name = "type_work_name")
    public String typeWorkName;
}
