package app.christopher.mvvmnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import javax.inject.Inject

@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

    class Callback @Inject constructor(
    ) : RoomDatabase.Callback()
}