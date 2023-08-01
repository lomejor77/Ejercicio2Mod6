package cl.awakelabs.ejercicio2

import androidx.lifecycle.LiveData
import cl.awakelabs.ejercicio2.data.local.Item
import cl.awakelabs.ejercicio2.data.local.ItemDao

class Repository(private val itemDao: ItemDao) {
    suspend fun insertItem(item: Item) {
        itemDao.insertItem(item)

    }
    fun getItem(): LiveData<List<Item>> {
        return itemDao.getAllItems()//obtiene tareas
    }

}