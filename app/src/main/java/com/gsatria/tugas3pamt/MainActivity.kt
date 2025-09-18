package com.gsatria.tugas3pamt

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
import com.gsatria.tugas3pamt.ui.theme.Tugas3pamtTheme
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import com.gsatria.tugas3pamt.ui.RegistrationScreen
import com.gsatria.tugas3pamt.viewmodel.RegistrationViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(modifier = Modifier.fillMaxSize()) {
                    RegistrationScreen(viewModel)
            }
        }
    }
}