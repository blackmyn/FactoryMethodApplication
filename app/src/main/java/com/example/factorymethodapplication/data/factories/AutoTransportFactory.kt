package com.example.factorymethodapplication.data.factories

import com.example.factorymethodapplication.data.interfaces.TransportMode
import com.example.factorymethodapplication.data.models.AutoTransport
import com.example.factorymethodapplication.data.models.DeliveryMethodFactory

class AutoTransportFactory(
    private val nameCompany: String,
    private val maxLoadCapacity: Double,
    private val maxLoadSize: Double,
): DeliveryMethodFactory {
    override fun createDeliveryMethod(): TransportMode {
        return AutoTransport(nameCompany,maxLoadCapacity,maxLoadSize)
    }
}