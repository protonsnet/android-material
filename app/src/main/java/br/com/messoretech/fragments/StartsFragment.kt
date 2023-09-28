package br.com.messoretech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.messoretech.R

class StartsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?, state: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frament_starts, group, false)
    }

    companion object{
        fun newInstance() = StartsFragment()
    }
}