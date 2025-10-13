package com.example.myapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// Modèle de données pour les informations de chaque chien
@Serializable
data class Chien(
    val id: Int,
    val name: String,
    val bred_for: String?,
    val breed_group: String?,
    val temperament: String?,
    val life_span: String?,

    // Poids du chien
    val weight: Weight?,

    // Taille du chien
    val height: Height?,

    // Image du chien
    val image: Image?
)

// Modèle pour la taille du chien
@Serializable
data class Height(
    val imperial: String?, // taille impériale (ex: 22-24)
    val metric: String?    // taille métrique (ex: 56-61)
)

// Modèle pour le poids du chien
@Serializable
data class Weight(
    val imperial: String?, // poids impérial (ex: 50-60)
    val metric: String?    // poids métrique (ex: 22-27)
)

// Modèle pour l'image du chien
@Serializable
data class Image(
    val url: String // URL de l'image
)
