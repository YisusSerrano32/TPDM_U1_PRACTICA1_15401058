package jesusserrano.ittepic.edu.tpdm_u1_practica1_15401058

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var image : ImageView ?= null
    var etiqueta : TextView ?= null
    var regresar : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        image = findViewById(R.id.imagenactivity2)
        etiqueta = findViewById(R.id.descrip)
        regresar = findViewById(R.id.regresar)

        var bundle : Bundle = intent.extras
        var recupImag = bundle.getInt("FOTO")
        image?.setImageResource(recupImag)

        var cadena = intent.extras?.getString("DESCRIPCION")

        etiqueta?.setText(cadena)

        regresar?.setOnClickListener {
            finish()
        }

    }
}
