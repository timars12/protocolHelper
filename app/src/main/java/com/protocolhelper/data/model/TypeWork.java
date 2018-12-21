package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "typeWork", foreignKeys = @ForeignKey(entity = WorkProtocol.class,
        parentColumns = "work_protocol_id",
        childColumns = "work_protocol_id",
        onDelete = CASCADE,
        onUpdate = CASCADE))
public class TypeWork {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "type_work_id")
    public long typeWorkId;

    @ColumnInfo(name = "work_protocol_id")
    public long workProtocolId;
}
