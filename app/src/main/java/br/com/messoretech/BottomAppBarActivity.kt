package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityBottomAppBarBinding

class BottomAppBarActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBottomAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.bottomAppBar.setNavigationOnClickListener {
            toast("Clicou no menu de navegação")
        }

        binding.bottomAppBar.setOnMenuItemClickListener {
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
        fun createIntent(context: Context) = Intent(context, BottomAppBarActivity::class.java)
    }

}
