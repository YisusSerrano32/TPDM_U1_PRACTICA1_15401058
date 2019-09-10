package jesusserrano.ittepic.edu.tpdm_u1_practica1_15401058

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var foto1 : ImageView ?= null
    var foto2 : ImageView ?= null
    var foto3 : ImageView ?= null
    var foto4 : ImageView ?= null
    var foto5 : ImageView ?= null
    var foto6 : ImageView ?= null
    var foto7 : ImageView ?= null
    var foto8 : ImageView ?= null
    var foto9 : ImageView ?= null
    var foto10 : ImageView ?= null
    var foto11 : ImageView ?= null
    var foto12 : ImageView ?= null
    var foto13 : ImageView ?= null
    var foto14 : ImageView ?= null
    var foto15 : ImageView ?= null

    var drawable =0
    var descrip=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        foto1 = findViewById(R.id.foto1)
        foto2 = findViewById(R.id.foto2)
        foto3 = findViewById(R.id.foto3)
        foto4 = findViewById(R.id.foto4)
        foto5 = findViewById(R.id.foto5)
        foto6 = findViewById(R.id.foto6)
        foto7 = findViewById(R.id.foto7)
        foto8 = findViewById(R.id.foto8)
        foto9 = findViewById(R.id.foto9)
        foto10 = findViewById(R.id.foto10)
        foto11 = findViewById(R.id.foto11)
        foto12 = findViewById(R.id.foto12)
        foto13 = findViewById(R.id.foto13)
        foto14 = findViewById(R.id.foto14)
        foto15 = findViewById(R.id.foto15)


        var otroActivity = Intent(this, Main2Activity::class.java)

        foto1?.setOnClickListener {
            drawable = R.drawable.foto1
            descrip="Con mi hermana, primos, sobrinos y mi novia en el cine para ver Spiderman"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto2?.setOnClickListener {
            drawable = R.drawable.foto2
            descrip="Con la familia despidiendo a mi hermana en la central de autobuses"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto3?.setOnClickListener {
            drawable = R.drawable.foto3
            descrip="En el cine con la familia viendo thor 2"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto4?.setOnClickListener {
            drawable = R.drawable.foto4
            descrip="Domingo en familia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto5?.setOnClickListener {
            drawable = R.drawable.foto5
            descrip="En el cumpleaños de mi amiga de la prepa con mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto6?.setOnClickListener {
            drawable = R.drawable.foto6
            descrip="Graduacion de mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto7?.setOnClickListener {
            drawable = R.drawable.foto7
            descrip="Cumpleaños de la amiga de mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto8?.setOnClickListener {
            drawable = R.drawable.foto8
            descrip="Bautizo de mi sobrino"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto9?.setOnClickListener {
            drawable = R.drawable.foto9
            descrip="Cumpleaños del abuelo de mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto10?.setOnClickListener {
            drawable = R.drawable.foto10
            descrip="Fotos de graduacion en la contaduria con mi amiga"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto11?.setOnClickListener {
            drawable = R.drawable.foto11
            descrip="Cumpleaños de una sobrina de mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto12?.setOnClickListener {
            drawable = R.drawable.foto12
            descrip="Cumpleaños de mi sobrino"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto13?.setOnClickListener {
            drawable = R.drawable.foto13
            descrip="En la playa con su familia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto14?.setOnClickListener {
            drawable = R.drawable.foto14
            descrip="Cita doble con una amiga de mi novia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
        foto15?.setOnClickListener {
            drawable = R.drawable.foto15
            descrip="Salida con amigos de la infancia"
            otroActivity.putExtra("FOTO", drawable)
            otroActivity.putExtra("DESCRIPCION",descrip)
            startActivity(otroActivity) //Llama al activity Main2Activity
        }
    }
}