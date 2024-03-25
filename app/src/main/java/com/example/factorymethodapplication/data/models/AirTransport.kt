package com.example.factorymethodapplication.data.models

import com.example.factorymethodapplication.data.interfaces.TransportMode

enum class Type{
    Intracity, LongDistance, International
}

enum class TransportType {
    Passenger, Cargo
}

class AirTransport(
    override val nameCompany: String,
    override val maxLoadCapacity: Double,
    override val maxLoadSize: Double,
    private val deliveryType: Type,
    private val transportType : TransportType
) : TransportMode {
    override fun deliver() : String{
        return "Company name: $nameCompany," +
                "\nMaximum load capacity: $maxLoadCapacity," +
                "\nMaximum load size: $maxLoadSize," +
                "\nDelivery type: $deliveryType," +
                "\nTransport type: $transportType"
    }
}