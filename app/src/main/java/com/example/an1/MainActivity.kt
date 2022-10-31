package com.example.an1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.ConvButton)
        val num:EditText = findViewById(R.id.Num)
        val result:TextView = findViewById(R.id.ConvRes)
        var flag:String = "km_to_mile"
        val spinnerval:Spinner = findViewById(R.id.SpCon)
        var options = arrayOf("Meter","Centimeter","Millimeter","Micrometer","Nanometer","Mile","Yard","Inch","Feet")
        spinnerval.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        button.setOnClickListener{ view->
            var x :Double = num.text.toString().toDouble();
            if (flag=="Meter")
                result.text= meter(x).toString()
            else if (flag == "Centimeter")
                result.text = centimeter(x).toString()
            else if(flag=="Millimeter")
                result.text = millimeter(x).toString()
            else if(flag=="Micrometer")
                result.text = micrometer(x).toString()
            else if(flag=="Nanometer")
                result.text = nanometer(x).toString()
            else if(flag=="Mile")
                result.text = mile(x).toString()
            else if(flag=="Yard")
                result.text = yard(x).toString()
            else if(flag=="Inch")
                result.text = inch(x).toString()
            else if(flag=="Feet")
                result.text = feet(x).toString()
        }
        spinnerval.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag= options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}


public  fun meter(a:Double):Double{
    return a*1000;
}

public  fun centimeter(a:Double):Double{
    return a*100000;
}

public  fun millimeter(a:Double):Double{
    return a*1000000;
}

public  fun micrometer(a:Double):Double{
    return a*1000000000;
}

public  fun nanometer(a:Double):Double{
    return a*1000000000000;
}

public  fun mile(a:Double):Double{
    return a*0.621371;
}

public  fun yard(a:Double):Double{
    return a*1093.613298;
}

public fun inch(a:Double):Double{
    return a*39370.07874;
}

public fun feet(a:Double):Double{
    return a*3280.839895;
}

