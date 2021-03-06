package com.vickikbt.covid_19statapp.ui.global

import androidx.lifecycle.ViewModel
import com.vickikbt.covid_19statapp.db.repository.CoronaRepository
import com.vickikbt.covid_19statapp.util.lazyDefered
import java.text.DateFormat
import java.util.*

class GlobalFragmentViewModel(private val coronaRepository: CoronaRepository) : ViewModel() {
    val globalStatistics by lazyDefered {
        coronaRepository.getGlobalStat()
    }

    fun getDate(): String {
        val calendar: Calendar = Calendar.getInstance()
        return DateFormat.getDateInstance(DateFormat.FULL).format(calendar.time)
    }

}
