package ru.netology.nmedia.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.netology.nmedia.BuildConfig
import ru.netology.nmedia.databinding.FragmentImageAttachBinding
import ru.netology.nmedia.view.load


class ImageAttachFragment : Fragment() {

    //private val viewModel: ImageAttachViewModel by activityViewModels()

    companion object {
        fun newInstance() = ImageAttachFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentImageAttachBinding.inflate(
            inflater,
            container,
            false
        )
        val url = arguments?.getString("Url")
        binding.imageAttachView.load("${BuildConfig.BASE_URL}/media/${url}")
        return binding.root
    }



}