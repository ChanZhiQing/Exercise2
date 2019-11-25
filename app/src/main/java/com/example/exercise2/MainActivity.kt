package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val weight:Double = editTextWeight.text.toString().toDouble();
            val height:Double = editTextHeight.text.toString().toDouble();
            val heightm:Double = height/100
            val bmi:Double =  weight /(heightm *heightm);

            textViewBMI.text = "BMI: %.2f m2".format(bmi);
            if(bmi < 18.5){
                imageViewProfile.setImageResource(R.drawable.under);
        }else if(bmi >=18.5 && bmi<=24.9){
                imageViewProfile.setImageResource(R.drawable.normal);
            }else{
                imageViewProfile.setImageResource(R.drawable.over);
            }
        }
        buttonReset.setOnClickListener(){
            editTextWeight.text = null;
            editTextHeight.text = null;
            textViewBMI.text = "BMI: ";
            imageViewProfile.setImageResource(R.drawable.empty);
        }
    }

}
