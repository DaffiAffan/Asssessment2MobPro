package org.d3if0146.assessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import org.d3if0146.assessment2mobpro.database.MobilDao
import org.d3if0146.assessment2mobpro.model.Mobil

class MainViewModel(dao: MobilDao) : ViewModel() {

    val data: StateFlow<List<Mobil>> = dao.getMobil().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = emptyList()
    )


}