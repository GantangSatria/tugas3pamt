package com.gsatria.tugas3pamt.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gsatria.tugas3pamt.viewmodel.RegistrationViewModel

@Composable
fun DetailScreen(
    viewModel: RegistrationViewModel,
    onDaftarClick: () -> Unit
) {
    val nim = viewModel.nim.value
    val nama = viewModel.nama.value
    val email = viewModel.email.value
    val alamat = viewModel.alamat.value

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F8FA)),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Detail Mahasiswa",
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    ),
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text("NIM: $nim", modifier = Modifier.padding(vertical = 4.dp), fontWeight = FontWeight.SemiBold)
                Text("Nama: $nama", modifier = Modifier.padding(vertical = 4.dp), fontWeight = FontWeight.SemiBold)
                Text("Email: $email", modifier = Modifier.padding(vertical = 4.dp), fontWeight = FontWeight.SemiBold)
                Text("Alamat: $alamat", modifier = Modifier.padding(vertical = 4.dp), fontWeight = FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = onDaftarClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("DAFTAR", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailScreenPreview() {
    val dummyViewModel = RegistrationViewModel().apply {
        nim.value = "235150701111036"
        nama.value = "Gantang Satria"
        email.value = "gantang610@student.ub.ac.id"
        alamat.value = "Malang"
    }

    DetailScreen(
        viewModel = dummyViewModel,
        onDaftarClick = {}
    )
}