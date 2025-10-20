package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
//import coil.compose.rememberAsyncImagePainter
import com.example.myapplication.model.Chien

@Composable
fun DogListItem(dog: Chien) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
//                painter = rememberAsyncImagePainter(dog.imageUrl),
                contentDescription = dog.name,
                modifier = Modifier
                    .size(64.dp)
                    .padding(end = 12.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.weight(1f)) {
                Text(text = dog.name, fontWeight = FontWeight.Bold)
                Text(text = dog.breed_group ?: "Unknown group", style = MaterialTheme.typography.bodySmall)
                Text(text = dog.life_span ?: "", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}