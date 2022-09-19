package com.arlitin.retrofit.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.arlitin.retrofit.R
import kotlinx.coroutines.*

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            Navigation.findNavController(view)
                .navigate(R.id.action_splashFragment_to_rootFragment)
        }
        return view
    }

}