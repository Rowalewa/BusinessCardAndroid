package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {
                    Greeting("Jane Doe", "Android Developer")
                    Contact("+11 (123) 444 555 666", "@AndroidDev", "jen.doe@android.com")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, role: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = name,
            modifier = modifier.fillMaxWidth().padding(20.dp).background(color = Color.DarkGray),
            fontSize = 80.sp,
            lineHeight = 100.sp
        )
        Text(
            text = role,
            modifier = modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}
@Composable
fun Contact(phone: String, instagram: String, email:String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            text = phone,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            modifier = Modifier.fillMaxWidth()
                .padding(18.dp)
                .background(color = Color.Cyan),
            textAlign = TextAlign.Center
        )
        Text(
            text = instagram,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            modifier = Modifier.fillMaxWidth()
                .padding(18.dp)
                .background(color = Color.Cyan),
            textAlign = TextAlign.Center
        )
        Text(
            text = email,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            modifier = Modifier.fillMaxWidth().
            padding(18.dp).
            background(color = Color.Cyan),
            textAlign = TextAlign.Center
        )

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview"
)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Column {
            Greeting("Jane Doe", "Android Developer")
            Contact("+11 (123) 444 555 666", "@AndroidDev", "jen.doe@android.com")
        }
    }
}