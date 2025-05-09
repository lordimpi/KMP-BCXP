package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.data.FakeData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogoScreen() {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Catálogo de Bicicletas") })
    }) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            items(FakeData.getBikes()) { bike ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    onClick = {
                        // Aquí se puede añadir navegación o acción futura
                    }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(bike.nombre, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(bike.descripcion)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Disponibilidad: ${bike.disponibilidad}")
                    }
                }
            }
        }
    }
}