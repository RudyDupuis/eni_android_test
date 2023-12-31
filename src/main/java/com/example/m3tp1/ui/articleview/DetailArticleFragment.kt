package com.example.m3tp1.ui.articleview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.m3tp1.databinding.FragmentDetailArticleBinding

class DetailArticleFragment : Fragment() {

    private lateinit var binding: FragmentDetailArticleBinding
    private val args: DetailArticleFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailArticleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val article = args.article
        binding.article = article

        binding.textViewTitre.setOnClickListener{
            Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/search?q=eni-shop ${article.titre}")).apply {
                startActivity(this)
            }
        }

    }

}