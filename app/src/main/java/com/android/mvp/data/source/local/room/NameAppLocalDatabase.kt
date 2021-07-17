package com.android.mvp.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.mvp.data.source.local.room.daos.UserDao
import com.android.mvp.data.source.local.room.entities.UserEntity

/**
 * LobeLocalDatabase using Persistence Room
 */

@Database(entities = [UserEntity::class], version = 5, exportSchema = false)
abstract class NameAppLocalDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
