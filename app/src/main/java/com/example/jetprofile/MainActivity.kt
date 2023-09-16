package com.example.jetprofile

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.components.CompanySection
import com.example.jetprofile.components.DetailSection
import com.example.jetprofile.components.Label
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),

    ){

        //profile画像
        //idの中身のR.drawable.image　は　res/drawable/imageと同じ
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "プロフィール",
            modifier = Modifier
                //sizeで縦と横の指定ができる
                .size(100.dp)
                //RoundedCornerShapeで画像の角を丸くする
                .clip(RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.height(20.dp))

        //名前
        Text(
            text = "松原　立洋",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        //空の行
        Spacer(modifier = Modifier.height(20.dp))

        //職業
        Text(
            text = "職業：大学院生",
            color = Color.Gray,
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        CompanySection()

        Spacer(modifier = Modifier.height(20.dp))

        //詳細ボタン
        var isShowDetail by remember {
            mutableStateOf(false)
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            //初期のボタンの背景色を変更
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF85F6A)),
            onClick = {isShowDetail = !isShowDetail},
        ){
            Text(
                text = "詳細を表示",
                color = Color.White,
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        //趣味と居住地
        if(isShowDetail) {
            DetailSection()
        }
    }
}
