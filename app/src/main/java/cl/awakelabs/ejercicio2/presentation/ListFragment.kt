package cl.awakelabs.ejercicio2.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.awakelabs.ejercicio2.ItemAdapter
import cl.awakelabs.ejercicio2.R
import cl.awakelabs.ejercicio2.databinding.FragmentListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
   lateinit var binding: FragmentListBinding
   val itemViewModel: ItemViewModel by activityViewModels()
   val adapter = ItemAdapter() 

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)
        
        initList()
        return binding.root
        
    }

    private fun initList() {
        itemViewModel.obtainTask().observe(viewLifecycleOwner){
            adapter.setData(it)
        }
        binding.recyclerView.adapter = adapter 
    }


}