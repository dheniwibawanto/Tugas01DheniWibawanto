package com.example.tugas01dheniwibawanto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugas01dheniwibawanto.ui.theme.Tugas01DheniWibawantoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas01DheniWibawantoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Dheni Wibawanto",
                        address = "Villa Bukit Tidar C1/45 Malang",
                        nim = "24.51.0008",
                        prodi = "S1-Sistem Informasi",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, address: String, nim: String, prodi: String, modifier: Modifier = Modifier) {
    Text(
        text = "Nama: $name\nAddress: $address\nNIM: $nim\nProdi: $prodi",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas01DheniWibawantoTheme {
        Greeting(name = "Dheni Wibawanto", address = "Villa Bukit Tidar C1/45 Malang", nim = "24.51.0008", prodi = "S1-Sistem Informasi")
    }
}
