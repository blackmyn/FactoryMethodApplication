package com.example.factorymethodapplication.data.models

import com.example.factorymethodapplication.data.interfaces.TransportMode

enum class TrackConstruction{
    Ballasted, Noballast
}

class RailroadTransport(
    override val nameCompany: String,
    override val maxLoadSize: Double,
    override val maxLoadCapacity: Double,
    private val trackSize : Int,
    private val trackConstruction : TrackConstruction
) : TransportMode {
    override fun deliver(): String {
        return "Company name: $nameCompany," +
                "\n Maximum load capacity: $maxLoadCapacity," +
                "\n Maximum load size: $maxLoadSize," +
                "\n Track size: $trackSize," +
                "\n Track construction: $trackConstruction"
    }
}