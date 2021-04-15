package com.api.marveldex.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.api.marveldex.R
import kotlinx.android.synthetic.main.fragment_recepcao.*
import kotlin.system.exitProcess


class RecepcaoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recepcao, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_entrar.setOnClickListener {
            findNavController().navigate(R.id.timeLineFragment)
        }

        button_sair.setOnClickListener {
            exitProcess(0)
        }
    }
}