package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityTopAppBarBinding

class TopAppBarActivity : AppCompatActivity() {

    private val binding by lazy { ActivityTopAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.topAppBar.setNavigationOnClickListener {
            toast("Clicou no menu de navegação")
        }

        binding.topAppBar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.favorite -> {
                    toast("Favorite")
                    true
                }
                R.id.search -> {
                    toast("Search")
                    true
                }
                R.id.more -> {
                    toast("More")
                    true
                }
                else -> false
            }
        }
    }

    companion object{
        fun createIntent(context: Context) = Intent(context, TopAppBarActivity::class.java)
    }

}
