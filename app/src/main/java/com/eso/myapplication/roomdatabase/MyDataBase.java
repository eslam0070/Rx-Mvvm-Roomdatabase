package com.eso.myapplication.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.eso.myapplication.model.PostsModel;

@Database(entities = {PostsModel.class},version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {

    public static final String DB_NAME = "posts database";
    private static MyDataBase dataBase;
    public abstract PostDao postDao();


    public static void init(Context context) {
        if (dataBase == null) {
            //initialize
            dataBase = Room.databaseBuilder(context,
                    MyDataBase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();

        }
    }

    public static MyDataBase  getInstance(){
        return dataBase;
    }
}
