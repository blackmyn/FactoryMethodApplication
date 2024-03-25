package com.example.factorymethodapplication.data.factories

import com.example.factorymethodapplication.data.interfaces.TransportMode
import com.example.factorymethodapplication.data.models.DeliveryMethodFactory
import com.example.factorymethodapplication.data.models.RailroadTransport
import com.example.factorymethodapplication.data.models.TrackConstruction

class RailRoadTransportFactory(
    private val nameCompany: String,
    private val maxLoadSize: Double,
    private val maxLoadCapacity: Double,
    private val trackSize : Int,
    private val trackConstruction : TrackConstruction
) : DeliveryMethodFactory {
    override fun createDeliveryMethod(): TransportMode {
       return RailroadTransport(nameCompany, maxLoadSize, maxLoadCapacity, trackSize, trackConstruction)
    }
}