package com.github.mikegr.loksek

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.mikepenz.markdown.compose.Markdown
import com.mikepenz.markdown.m3.markdownColor
import com.mikepenz.markdown.m3.markdownTypography
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
    }
}

@Composable
fun MainScreen() {
    Markdown( content =
        """
            # Header
            * Liste
            * More           
            #Hashtags
            
        """.trimIndent(),
        colors = markdownColor(),
        typography = markdownTypography()
    )
}