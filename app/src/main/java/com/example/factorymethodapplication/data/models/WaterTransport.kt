package com.example.factorymethodapplication.data.models

import com.example.factorymethodapplication.data.interfaces.TransportMode

enum class TypeTransport{
    River, Maritime
}

class WaterTransport(
    override val nameCompany: String,
    override val maxLoadCapacity: Double,
    override val maxLoadSize: Double,
    private val type : TypeTransport
) : TransportMode {
    override fun deliver(): String {
        return "Company name: $nameCompany," +
                "\nMaximum load capacity: $maxLoadCapacity," +
                "\nMaximum load size: $maxLoadSize," +
                "\nDelivery type: $type"
    }
}