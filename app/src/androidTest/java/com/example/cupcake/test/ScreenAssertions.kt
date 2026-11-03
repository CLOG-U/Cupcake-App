package com.example.cupcake.test

import androidx.navigation.NavController
import org.junit.Assert.assertEquals

/**
 * Comprueba que la ruta actual del NavController sea la esperada.
 */
fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}
