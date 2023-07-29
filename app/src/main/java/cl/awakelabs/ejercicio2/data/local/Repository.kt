package cl.awakelabs.ejercicio2.data.local

import androidx.lifecycle.LiveData

class Repository(private val itemDao: ItemDao) {
    suspend fun insertItem(item: Item) {
        itemDao.insertItem(item)

    }
    fun getItem(): LiveData<List<Item>> {
        return itemDao.getAllItems()//obtiene tareas
    }

}