/*
 * Copyright (c) 2025, Atakan Akın
 *
 * @author "Atakan Akın"
 * @Link https://github.com/atakanakin
 */

package dev.atakanakin.common.showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import dev.atakanakin.common.showcase.ui.theme.CommonShowcaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CommonShowcaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Text(
                        text = "Hello Android",
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}
