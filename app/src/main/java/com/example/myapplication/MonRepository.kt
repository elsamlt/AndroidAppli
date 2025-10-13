package com.example.myapplication

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.serialization.kotlinx.json.*
import android.util.Log
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.request.request

class MonRepository {
    val client = HttpClient(CIO) {

        install(ContentNegotiation) {
            json()
        }

        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.ALL
            logger = object : Logger {
                override fun log(message: String) {
                    Log.d("Ktor-Logger", message)
                }
            }
        }

    }

    // récupération des races de chiens depuis l'API
    suspend fun getChien() : List<Chien> {
        val url = "https://api.thedogapi.com/v1/breeds"
        return client.request(url).body()
    }
}