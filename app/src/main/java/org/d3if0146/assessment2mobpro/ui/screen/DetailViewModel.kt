package org.d3if0146.assessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if0146.assessment2mobpro.database.MobilDao
import org.d3if0146.assessment2mobpro.model.Mobil

class DetailViewModel(private val dao: MobilDao) : ViewModel() {

    fun insert(nama: String, jenis: String, merek: String) {
        val mobil = Mobil(
            nama = nama,
            jenis = jenis,
            merek = merek,
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(mobil)
        }
    }
    suspend fun getMobil(id: Long): Mobil? {
        return dao.getMobilById(id)
    }

    fun update(id: Long, nama: String, jenis: String, merek: String) {
        val mobil = Mobil(
            id      = id,
            nama = nama,
            jenis   = jenis,
            merek = merek,
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(mobil)
        }
    }
    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}