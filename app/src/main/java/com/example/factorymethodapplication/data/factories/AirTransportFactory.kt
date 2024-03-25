package com.example.factorymethodapplication.data.factories

import com.example.factorymethodapplication.data.interfaces.TransportMode
import com.example.factorymethodapplication.data.models.AirTransport
import com.example.factorymethodapplication.data.models.DeliveryMethodFactory
import com.example.factorymethodapplication.data.models.TransportType
import com.example.factorymethodapplication.data.models.Type

class AirTransportFactory(
    private val nameCompany: String,
    private val maxLoadCapacity: Double,
    private val maxLoadSize: Double,
    private val deliveryType: Type,
    private val transportType : TransportType
) : DeliveryMethodFactory {
    override fun createDeliveryMethod(): TransportMode {
        return AirTransport(nameCompany, maxLoadCapacity, maxLoadSize, deliveryType, transportType)
    }
}