package com.gsatria.tugas3pamt

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gsatria.tugas3pamt.screen.DetailScreen
import com.gsatria.tugas3pamt.screen.LoginScreen
import com.gsatria.tugas3pamt.screen.RegistrationScreen
import com.gsatria.tugas3pamt.viewmodel.RegistrationViewModel

object Routes {
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val DETAIL = "detail"
}

@Composable
// fun NavGraph(viewModel: RegistrationViewModel) {
fun NavGraph() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LOGIN
    ) {
        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginClick = { navController.navigate(Routes.DETAIL) },
                onRegisterClick = { navController.navigate(Routes.REGISTER) }
            )
        }

        composable(Routes.REGISTER) {
            RegistrationScreen(
                // viewModel = viewModel,
                onSimpanClick = { navController.navigate(Routes.DETAIL) }
            )
        }

        composable(Routes.DETAIL) {
            DetailScreen(
                // viewModel = viewModel,
                onDaftarClick = { navController.navigate(Routes.REGISTER) }
            )
        }
    }
}
