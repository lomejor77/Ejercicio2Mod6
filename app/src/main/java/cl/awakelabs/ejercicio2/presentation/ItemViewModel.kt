package cl.awakelabs.ejercicio2.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import cl.awakelabs.ejercicio2.data.local.Item
import cl.awakelabs.ejercicio2.data.local.ItemDB
import cl.awakelabs.ejercicio2.data.local.Repository
import kotlinx.coroutines.launch

class ItemViewModel(application: Application) : AndroidViewModel(application) {

    private val  repository: Repository
    init {
        repository = Repository(ItemDB.getDatabase(application).getItemDao())
    }
    fun obtainTask(): LiveData<List<Item>> {
        return repository.getItem()
    }
    fun insertTask(item: Item) = viewModelScope.launch {
        repository.insertItem(item)
    }
}