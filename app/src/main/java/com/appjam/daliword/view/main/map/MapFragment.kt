package com.appjam.daliword.view.main.map

import com.appjam.daliword.R
import com.appjam.daliword.databinding.FragmentMapBinding
import com.selfpro.dailyrecord.util.base.BaseFragment
import androidx.fragment.app.viewModels

class MapFragment: BaseFragment<FragmentMapBinding, MapViewModel>(R.layout.fragment_map) , {
    override val viewModel: MapViewModel by viewModels()

    override fun start() {

    }
}