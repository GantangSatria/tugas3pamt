package com.gsatria.tugas3pamt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import com.gsatria.tugas3pamt.screen.DetailScreen
import com.gsatria.tugas3pamt.screen.LoginScreen
import com.gsatria.tugas3pamt.screen.RegistrationScreen
import com.gsatria.tugas3pamt.viewmodel.RegistrationViewModel
import com.gsatria.tugas3pamt.NavGraph

class MainActivity : ComponentActivity() {
    private val viewModel:  RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavGraph(viewModel)

                    // DetailScreen(onDaftarClick = {}, viewModel = viewModel)
//                    LoginScreen(onLoginClick = {}) { }
//                    RegistrationScreen(viewModel)
            }
        }
    }
}