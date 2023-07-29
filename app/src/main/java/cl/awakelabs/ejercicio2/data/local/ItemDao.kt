package cl.awakelabs.ejercicio2.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {
   @Insert
   suspend fun insertItem(item: Item)

   @Query ("SELECT * FROM tbl_item ORDER BY id ASC")
   fun getAllItems(): LiveData<List<Item>>
}