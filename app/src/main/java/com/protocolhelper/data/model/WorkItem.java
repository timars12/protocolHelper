package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "workItem", foreignKeys = @ForeignKey(entity = Work.class,
        parentColumns = "work_id",
        childColumns = "work_id",
        onDelete = CASCADE,
        onUpdate = CASCADE))
public class WorkItem {

    @ColumnInfo(name = "work_id")
    public long workId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long id;

    @Embedded
    public DescriptionInstrument instrument;
}
