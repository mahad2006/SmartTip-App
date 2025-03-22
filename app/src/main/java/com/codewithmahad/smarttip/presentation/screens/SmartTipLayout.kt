package com.codewithmahad.smarttip.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SmartTipLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(4.dp),

        ) {
        Box(
            modifier = Modifier
                .padding(4.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(Color.DarkGray)
                .fillMaxWidth()
                .size(150.dp)
        ) {
            Text(
                text = "Bill Total",
                fontSize = 24.sp,
                modifier = Modifier.align(alignment = Alignment.Center),
                color = Color.LightGray
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.Gray)
                    .weight(1F)
                    .size(130.dp)
            ) {
                Text(
                    text = "Tip",
                    fontSize = 24.sp,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.Gray)
                    .weight(1F)
                    .clip(RoundedCornerShape(32.dp))
                    .size(130.dp)
            ) {
                Text(
                    text = "Tip Total",
                    fontSize = 24.sp,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    color = Color.White
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.Gray)
                    .weight(1F)
                    .size(130.dp)
            ) {
                Text(
                    text = "Split",
                    fontSize = 24.sp,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color.Gray)
                    .weight(1F)
                    .size(130.dp)
            ) {
                Text(
                    text = "Split Total",
                    fontSize = 24.sp,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    color = Color.White
                )
            }
        }
    }
}
