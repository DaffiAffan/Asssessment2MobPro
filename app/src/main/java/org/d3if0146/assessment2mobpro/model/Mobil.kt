package org.d3if0146.assessment2mobpro.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mobil")
data class Mobil(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val jenis: String,
    val merek: String,
)
