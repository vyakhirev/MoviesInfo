package com.vyakhirev.filmsinfo.viewmodel.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vyakhirev.filmsinfo.viewmodel.FavoritesViewModel

class FavoritesViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FavoritesViewModel() as T
    }
}
