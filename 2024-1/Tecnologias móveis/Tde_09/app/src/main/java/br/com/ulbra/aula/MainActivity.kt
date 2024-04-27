package br.com.ulbra.aula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val assunto = findViewById<EditText>(R.id.etAssunto)
        val destinatario = findViewById<EditText>(R.id.etDestinatário)
        val mensagem = findViewById<EditText>(R.id.etMensagem)

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_SUBJECT, assunto.text.toString())
                putExtra(Intent.EXTRA_TEXT, mensagem.text.toString())
            }
                assunto.text.clear()
                destinatario.text.clear()
                mensagem.text.clear()

                startActivity(intent)

            }

        }
    }
