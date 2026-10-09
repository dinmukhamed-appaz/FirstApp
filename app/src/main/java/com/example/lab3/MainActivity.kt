package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3.ui.theme.Lab3Theme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD1E8D9)
                ){
                    BusinessCard()
                }
            }
        }
    }
}
@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .background(Color(0xFF073042))
                    .padding(8.dp)
            )
            Text(
                text = stringResource(R.string.full_name),
                fontSize = 32.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
            )
            Text(
                text = stringResource(R.string.title),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF006D3B)
            )
        }

        Column(
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.Phone,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = stringResource(R.string.phone_number),
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = stringResource(R.string.share_handle),
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(0xFF006D3B),
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab3Theme {
        BusinessCard()
    }
}