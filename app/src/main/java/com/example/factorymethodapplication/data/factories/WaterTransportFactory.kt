package com.example.factorymethodapplication.data.factories

import com.example.factorymethodapplication.data.interfaces.TransportMode
import com.example.factorymethodapplication.data.models.DeliveryMethodFactory
import com.example.factorymethodapplication.data.models.TypeTransport
import com.example.factorymethodapplication.data.models.WaterTransport

class WaterDeliveryFactory(
    private val maxLoadSize: Double,
    private val companyName: String,
    private val type: TypeTransport,
    private val maxLoadCapacity: Double
) : DeliveryMethodFactory {
    override fun createDeliveryMethod(): TransportMode {
        return WaterTransport(companyName, maxLoadSize, maxLoadCapacity, type)
    }
}