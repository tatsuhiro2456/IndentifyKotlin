package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
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

                            }

                    }

                }
            }
        }
    }
}
