package cl.awakelabs.ejercicio2.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
/*
* data class
* */
@Entity(tableName = "tbl_item")
data class Item(val name: String, val price: Int, val qty: Int){
    @PrimaryKey(autoGenerate = true) var id: Long = 0

}
