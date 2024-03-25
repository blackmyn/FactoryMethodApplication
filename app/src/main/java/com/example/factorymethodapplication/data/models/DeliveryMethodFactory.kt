package com.example.factorymethodapplication.data.models

import com.example.factorymethodapplication.data.interfaces.TransportMode

interface DeliveryMethodFactory {
    fun createDeliveryMethod(): TransportMode
}