package com.example.factorymethodapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.factorymethodapplication.data.factories.AirTransportFactory
import com.example.factorymethodapplication.data.factories.AutoTransportFactory
import com.example.factorymethodapplication.data.factories.RailRoadTransportFactory
import com.example.factorymethodapplication.data.factories.WaterDeliveryFactory
import com.example.factorymethodapplication.data.models.DeliveryMethodFactory
import com.example.factorymethodapplication.data.models.TrackConstruction
import com.example.factorymethodapplication.data.models.TransportType
import com.example.factorymethodapplication.data.models.Type
import com.example.factorymethodapplication.data.models.TypeTransport

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val waterDeliveryFactory = WaterDeliveryFactory(500.55, "WaterDeliveryCompany",TypeTransport.River,105.25)
        val airDeliveryFactory = AirTransportFactory("AirDeliveryCompany", 25.15,100.5, Type.International,TransportType.Cargo)
        val railroadTransportFactory = RailRoadTransportFactory("RailRoadCompany",99.99,500.53,25,TrackConstruction.Ballasted)
        val autoDeliveryFactory = AutoTransportFactory("AutoCompany",340.99,450.99)
        val returnTextView : TextView = findViewById(R.id.returnTextView)
        val textView: TextView = findViewById(R.id.deliveryType)
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val radioButtons = listOf(
            findViewById<RadioButton>(R.id.radioButton),
            findViewById<RadioButton>(R.id.radioButton2),
            findViewById<RadioButton>(R.id.radioButton3),
            findViewById<RadioButton>(R.id.radioButton4))
        val countries = listOf("Russia", "USA", "Belarus", "Germany")
        for (i in radioButtons.indices) {
            radioButtons[i].text = countries[i]
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = group.findViewById<RadioButton>(checkedId)
            val selectedCountry = selectedRadioButton.text.toString()
            when (selectedCountry) {
                "Russia" -> {
                    textView.text = "Railway selected"
                    returnTextView.text = railroadTransportFactory.createDeliveryMethod().deliver()
                }
                "USA" -> {
                    textView.text = "Water selected"
                    returnTextView.text = waterDeliveryFactory.createDeliveryMethod().deliver()
                }
                "Belarus" -> {
                    textView.text = "Ground selected"
                    returnTextView.text = autoDeliveryFactory.createDeliveryMethod().deliver()
                }
                "Germany" -> {
                    textView.text = "Avia selected"
                    returnTextView.text = airDeliveryFactory.createDeliveryMethod().deliver()
                }
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}