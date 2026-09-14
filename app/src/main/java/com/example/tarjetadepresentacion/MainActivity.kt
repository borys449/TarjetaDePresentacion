package com.example.tarjetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFD2E8D4)
            ) {
                BusinessCardApp()
            }
        }
    }
}

@Composable
fun BusinessCardApp() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Spacer(modifier = Modifier.height(32.dp))

        ProfileSection(
            fullName = "Borys Macias",
            title = "Estudiante de Ingeniería de Software"
        )

        ContactSection(
            phone = "+593 09 6529 74",
            social = "@borysmacias",
            email = "borysmacias156@gmail.com"
        )
    }
}

@Composable
fun ProfileSection(
    fullName: String,
    title: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Espacio para la imagen/logo
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(Color(0xFF073042)),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "BM",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = fullName,
            fontSize = 32.sp,
            fontWeight = FontWeight.Light,
            color = Color(0xFF1B1B1B)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B)
        )
    }
}

@Composable
fun ContactSection(
    phone: String,
    social: String,
    email: String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        ContactRow(
            icon = Icons.Default.Phone,
            text = phone
        )

        ContactRow(
            icon = Icons.Default.Share,
            text = social
        )

        ContactRow(
            icon = Icons.Default.Email,
            text = email
        )
    }
}

@Composable
fun ContactRow(
    icon: ImageVector,
    text: String
) {

    Row(
        modifier = Modifier.width(250.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(24.dp))

        Text(
            text = text,
            fontSize = 14.sp,
            color = Color(0xFF2C312E)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4)
    ) {
        BusinessCardApp()
    }
}
