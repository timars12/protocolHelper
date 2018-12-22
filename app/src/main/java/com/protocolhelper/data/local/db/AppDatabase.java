package com.protocolhelper.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.protocolhelper.data.local.db.dao.InstrumentDao;
import com.protocolhelper.data.model.Instrument;
import com.protocolhelper.data.model.TypeWork;
import com.protocolhelper.data.model.Work;
import com.protocolhelper.data.model.WorkItem;
import com.protocolhelper.data.model.WorkProtocol;

@Database(entities = {Instrument.class, WorkProtocol.class, TypeWork.class, Work.class, WorkItem.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public synchronized static AppDatabase getInstance(Context context, String dbName) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context, dbName);
        }
        return INSTANCE;
    }

    private static AppDatabase buildDatabase(final Context context, String dbName) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
//                .addCallback(new Callback() {
//                    @Override
//                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
//                        super.onCreate(db);
//                        Executors.newSingleThreadScheduledExecutor().execute(() -> getInstance(context, dbName).profileDao().insertAll(populateProfiles()));
//                    }
//                })
                .build();
    }

    public abstract InstrumentDao instrumentDao();
}
