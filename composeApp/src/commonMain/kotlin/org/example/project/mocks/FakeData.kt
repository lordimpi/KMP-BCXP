package org.example.project.data

import org.example.project.models.BicicletaData

object FakeData {
    fun getBikes(): List<BicicletaData> {
        return listOf(
            BicicletaData(
                id = 1,
                nombre = "Bicicleta urbana",
                descripcion = "Diseñada para la ciudad, con marco ligero y estilo clásico. Ideal para trayectos cortos.",
                disponibilidad = "Disponible",
                imagenUrl = "https://cdn1.totalcommerce.cloud/homesentry/product-image/es/bicicleta-en-acero-clark-bike-dynamic-6-velocidades-rin-26-5.webp"
            ),
            BicicletaData(
                id = 2,
                nombre = "Bicicleta MTB",
                descripcion = "Montañera resistente con suspensión delantera y cambios de 24 velocidades para terrenos difíciles.",
                disponibilidad = "Disponible",
                imagenUrl = "https://homesale.com.co/cdn/shop/products/roadmaster-storm-bicicletas-roadmaster-710824.jpg?v=1707348003"
            ),
            BicicletaData(
                id = 3,
                nombre = "Bicicleta RRX",
                descripcion = "Modelo deportivo con frenos de disco y diseño aerodinámico. Perfecta para entrenamiento urbano.",
                disponibilidad = "Disponible",
                imagenUrl = "https://homesale.com.co/cdn/shop/products/roadmaster-storm-bicicletas-roadmaster-710824.jpg?v=1707348003"
            ),
            BicicletaData(
                id = 4,
                nombre = "Bicicleta XZD",
                descripcion = "Edición especial con marco de aluminio y asiento ergonómico. Ideal para largos recorridos.",
                disponibilidad = "Disponible",
                imagenUrl = "https://homesale.com.co/cdn/shop/products/roadmaster-storm-bicicletas-roadmaster-710824.jpg?v=1707348003"
            ),
            BicicletaData(
                id = 5,
                nombre = "Bicicleta SSA",
                descripcion = "Modelo híbrido para ciudad y campo, equipada con neumáticos anchos y buena suspensión.",
                disponibilidad = "Disponible",
                imagenUrl = "https://homesale.com.co/cdn/shop/products/roadmaster-storm-bicicletas-roadmaster-710824.jpg?v=1707348003"
            ),
            BicicletaData(
                id = 6,
                nombre = "Bicicleta XKS",
                descripcion = "Versátil y moderna, con diseño compacto, cambios rápidos y estructura robusta.",
                disponibilidad = "Disponible",
                imagenUrl = "https://homesale.com.co/cdn/shop/products/roadmaster-storm-bicicletas-roadmaster-710824.jpg?v=1707348003"
            )
        )
    }
}