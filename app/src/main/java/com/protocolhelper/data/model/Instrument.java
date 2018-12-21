package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Instrument {
    @ColumnInfo(name = "instrument_id")
    @PrimaryKey(autoGenerate = true)
    public Integer instrumentId;

    @ColumnInfo(name = "name")
    public String name;

    @Embedded
    public DescriptionInstrument instrument;
}
