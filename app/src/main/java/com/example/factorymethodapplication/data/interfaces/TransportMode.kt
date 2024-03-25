package com.example.factorymethodapplication.data.interfaces

interface TransportMode {
    val nameCompany: String
    val maxLoadCapacity: Double
    val maxLoadSize: Double
    fun deliver() : String
}