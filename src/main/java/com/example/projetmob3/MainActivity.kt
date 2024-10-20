package com.example.projetmob3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetmob3.ui.theme.Projetmob3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Projetmob3Theme { Hope()
            }
        }
    }
    @Composable
    fun Hope() {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val icon1 = painterResource(R.drawable.android_logo)
                Image(
                    painter = icon1,
                    contentDescription = "ProfilePic",

                    modifier = Modifier.size(185.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "KOBLE AGBATOU ANGE ALEX",
                    fontSize = 22.sp, fontWeight = FontWeight.W500,
                    color = Color.DarkGray
                ) // TITLE
                Text(
                    text = "Expert en Développement Web",
                    fontSize = 16.sp, fontWeight = FontWeight.W700,
                    color = Color.Gray, // Gris
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "tel",
                        modifier = Modifier.size(24.dp),
                        tint = Color.Black
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "(+225) 01 40 20 68 23",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                ) {
                   val img2 = painterResource(R.drawable.premium_vector___square_linkedin_logo_isolated_on_white_background)
                    Image(
                       painter = img2,
                        contentDescription = "Linkedin",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "ALEX KOBLE", fontSize = 20.sp, fontWeight = FontWeight.W500)
                }
                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                ){
                    val mail = painterResource(R.drawable.email_free_icons_designed_by_freepik)
                   Image(
                        painter = mail,
                        contentDescription = "Mail",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "koblealex9@.com", fontSize = 20.sp, fontWeight = FontWeight.W500)
                }
            }
        }
    }
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun CardPreview() {
        Projetmob3Theme {
            Hope()
        }
//
    }
}