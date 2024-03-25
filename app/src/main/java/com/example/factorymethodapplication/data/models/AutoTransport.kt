package com.example.factorymethodapplication.data.models

import com.example.factorymethodapplication.data.interfaces.TransportMode

class AutoTransport(override val nameCompany: String,
    override val maxLoadCapacity: Double,
    override val maxLoadSize: Double)
    :TransportMode {
    override fun deliver(): String {
        return "Company name: $nameCompany," +
                "\nMaximum load capacity: $maxLoadCapacity," +
                "\nMaximum load size: $maxLoadSize"
    }
}