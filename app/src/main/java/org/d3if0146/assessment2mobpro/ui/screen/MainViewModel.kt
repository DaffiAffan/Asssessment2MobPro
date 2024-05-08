package org.d3if0146.assessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if0146.assessment2mobpro.model.Mobil

class MainViewModel : ViewModel() {

    val data = getDataDummy()

    private fun getDataDummy(): List<Mobil> {
        val data = mutableListOf<Mobil>()
        for (i in 29 downTo 20) {
            data.add(
                Mobil(
                    i.toLong(),
                    "Mobil $i Maret",
                    "Yey, hari ini belajar  membuat aplikasi  Android counter dan berhasil. Hehe.. Mudah2an modul selanjutnya juga lancar. Aamiin.",
                    "2024-03-$i 14:42:56"
                )
            )
        }
        return data
    }

}