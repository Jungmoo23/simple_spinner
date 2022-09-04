package kr.co.so.softcapus.spinnneer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.te1)

        val sp = findViewById<Spinner>(R.id.spinner)
        var spdata =resources.getStringArray(R.array.itmess)
        var spap:ArrayAdapter<String>  = ArrayAdapter<String>(this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,spdata)



        sp.adapter = spap
        sp.setSelection(1)
        sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                text.setText("1")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

    }
}