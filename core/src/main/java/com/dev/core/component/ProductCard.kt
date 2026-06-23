package com.dev.core.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dev.domain.model.Product

@Composable
fun ProductCard(
    product: Product,
    onClick: (Int) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick(product.id)
            }
    ) {

        Column {

            NetworkImage(
                imageUrl = product.imageUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = product.title,
                maxLines = 2
            )

            PriceText(
                price = product.price
            )

            RatingBar(
                rating = product.rating
            )
        }
    }
}