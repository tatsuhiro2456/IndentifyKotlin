package com.example.jetprofile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection(){
    Column(
        //startで左寄せ
        horizontalAlignment = Alignment.Start,
        //fillmMaxWidthで幅をいっぱいにする
        modifier = Modifier.fillMaxWidth(),
    ) {
        //会社名
        Text(
            text = "大学院",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "修士2年",
            color = Color.Gray,
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        //email
        Label(icon = Icons.Default.Email, text = "Email")


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "tatsuhiro2456@gmail.com",
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(5.dp))

        //線の描画
        Divider(
            //線の角を完全に丸くする
            modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
            //線の太さ指定
            thickness = 2.dp
        )
    }
}