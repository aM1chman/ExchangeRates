package com.arlitin.retrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arlitin.retrofit.data.repository.Repository
import com.arlitin.retrofit.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }

}