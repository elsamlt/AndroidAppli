package com.example.myapplication.model

import kotlinx.serialization.Serializable

// Modèle de données pour les informations de chaque chien
@Serializable
class Chien(
    val id: Int,
    val name: String,
    val bred_for: String,
    val breed_group: String,
    val temperament: String,
    val life_span: String,
    val origin: String,
    val reference_image_id: String,
    val weight: Weight,
    val height: Height
)

// Modèle pour la taille du chien
@Serializable
class Height(
    val imperial: String?,
    val metric: String?
)

// Modèle pour le poids du chien
@Serializable
class Weight(
    val imperial: String?,
    val metric: String?
)

@Serializable
class DogImage(
    val id: String,
    val url: String,
    val width: Int,
    val height: Int
)

// Modèle pour l'image du chien
//val imageUrl: String?
//    get() = reference_image_id?.let { "https://cdn2.thedogapi.com/images/$it.jpg" }

