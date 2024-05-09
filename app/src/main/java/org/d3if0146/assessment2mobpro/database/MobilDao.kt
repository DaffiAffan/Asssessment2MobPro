package org.d3if0146.assessment2mobpro.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import org.d3if0146.assessment2mobpro.model.Mobil

@Dao
interface MobilDao {

    @Insert
    suspend fun insert(mobil: Mobil)
    @Update
    suspend fun update(mobil: Mobil)
    @Query("SELECT * FROM mobil ORDER BY merek DESC")
    fun getMobil(): Flow<List<Mobil>>

    @Query("SELECT * FROM mobil WHERE id = :id")
    suspend fun getMobilById(id: Long): Mobil?


    @Query("DELETE FROM mobil WHERE id = :id")
    suspend fun deleteById(id: Long)
}