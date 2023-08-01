package cl.awakelabs.ejercicio2

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelabs.ejercicio2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}