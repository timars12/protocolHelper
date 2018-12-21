package com.protocolhelper.data.model;

import android.arch.persistence.room.ColumnInfo;

public class DescriptionInstrument {

    @ColumnInfo(name = "name_instrument")
    public String nameInstrument;

    @ColumnInfo(name = "way_of_protection")
    public String wayOfProtection;

    @ColumnInfo(name = "nominal_amperage")
    public String nominalAmperage; //номінальна сила струму

    @ColumnInfo(name = "estimated_minimum_amperage")
    public String estimatedMinimumAmperage; //розрахункова мінімальна сила струму

    @ColumnInfo(name = "max_resistance")
    public String maxResistance; //макс опір

    @ColumnInfo(name = "measured_resistance")
    public String measuredResistance; //виміряний опір

    @ColumnInfo(name = "notes")
    public String notes; //примітки
}
