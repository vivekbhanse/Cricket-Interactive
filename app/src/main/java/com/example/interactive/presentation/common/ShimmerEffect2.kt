package com.example.interactive.presentation.common


import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.interactive.R
import com.example.interactive.presentation.Dimens
import com.example.interactive.presentation.Dimens.Dimens16
import com.example.interactive.presentation.Dimens.Dimens8
import com.example.interactive.presentation.Dimens.MediumPadding1


@Composable
fun Modifier.shimmerEffect2(): Modifier {
    val transition = rememberInfiniteTransition()
    val alpha by transition.animateFloat(
        initialValue = 0.2f, targetValue = 0.9f, animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1000), repeatMode = RepeatMode.Reverse
        )
    )

    return this.then(
        Modifier.background(colorResource(id = R.color.shimmer).copy(alpha = alpha))
    )
}

@Composable
fun MatchCardShimmerEffect2(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(horizontal = MediumPadding1) // Ensuring consistent spacing
    ) {
        Box(
            modifier = Modifier
                .size(Dimens.ArticleCardSize)
                .clip(MaterialTheme.shapes.medium)
                .shimmerEffect2()
        )
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .height(Dimens.ArticleCardSize)
                .padding(horizontal = Dimens.ExtraSmallPadding)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens8)
                    .background(Color.Transparent),
                shape = RoundedCornerShape(Dimens16),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(Dimens8)
                ) {

                }
            }
        }


    }
}
@Composable
fun ShimmerEffect2() {
    Column(verticalArrangement = Arrangement.spacedBy(MediumPadding1)) {
        repeat(10) {
            MatchCardShimmerEffect2()
        }
    }
}


