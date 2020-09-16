package qboinstitute.com.appmiprimeraappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //definia el elemento TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DeclaracionDeArrayList()
        //Realizabamos la instancia utilizando el método findViewById(R.layot.tvtitulo)
        //Seteamos los datos. setText() getText()
        var titulo : String?
        titulo = tvtitulo.text.toString()
        tvtitulo.text = "HOLA MUNDO"

    }


    fun DeclaracionDeVariables(){
        var nombre = "Luis"
        val apellido = "Salvatierra"
        var precio = 31
        var peso : Double
        var edad : Int
        var esalto : Boolean
        esalto = true
    }

    fun DeclaracionDeVariablesNull(){
        var nombrenulo : String?
        nombrenulo = null
        var ciudad = null
    }

    fun DeclaracionDeArrayList(){
        val participantes = ArrayList<String>()
        participantes.add("Alan")
        participantes.add("Jesús")
        participantes.add("Daniel")
        participantes.add("Anderson")
        participantes.add("Juan")
        for (nombre in participantes){
            if(nombre =="Alan"){
                Log.i("TAGArray", nombre)
            }else{
                Log.i("TAGArray", "No tiene Apellido")
            }
        }
        participantes.forEach {
            Log.i("TAG", it)
        }

    }
    fun MetodoSinRetorno(a: Int, b: Int){
        var suma = a + b
        var resta = a- b
        var multi = a * b
        var divi = a / b
    }
    fun MetodoConRetorno(a: Int, b: Int): Int{
     return (a * 100) / b
    }



}