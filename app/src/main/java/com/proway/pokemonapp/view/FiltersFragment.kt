package com.proway.pokemonapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.proway.pokemonapp.R
import com.proway.pokemonapp.view_model.FiltersViewModel


class FiltersFragment : BottomSheetDialogFragment() {

    companion object {
        fun newInstance() = FiltersFragment()
    }

    private lateinit var viewModel: FiltersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.filters_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(FiltersViewModel::class.java)
    }

    override fun getTheme(): Int = R.style.CustomBottomSheetDialog
}