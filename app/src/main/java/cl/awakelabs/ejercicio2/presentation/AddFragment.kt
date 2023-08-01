package cl.awakelabs.ejercicio2.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.awakelabs.ejercicio2.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    lateinit var binding: FragmentAddBinding
    private val itemViewModel: ItemViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(layoutInflater, container, false)

        initListener()

        // Inflate the layout for this fragment
        return binding.root

    }
    private fun initListener() {
        binding.btnAdd.setOnClickListener {
            val nombre = binding.editName.text.toString()
            val precio = binding.editPrice.text.toString().toInt()
            val cantidad = binding.editQty.text.toString().toInt()

            itemViewModel.insertTask(nombre,precio,cantidad)

        }


    }


}