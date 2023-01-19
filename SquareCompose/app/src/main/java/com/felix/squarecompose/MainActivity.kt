package com.felix.squarecompose

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felix.squarecompose.ui.theme.SquareComposeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SquareComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SquareCompose()
                }
            }
        }
    }
}

@Composable
fun SquareCompose() {
    //preenche toda a tela horizontalmente
    Column(Modifier.fillMaxWidth()) {
    //coloca o peso 1f no Row de cima igual ao de baixo para ficar igual
        Row(Modifier.weight(1f)) {
            SquareComposeCard(
                title = stringResource(id = R.string.text_composable),
                description = stringResource(id = R.string.text_composable_descrip),
                backgroundColor = Color.Green,
                // esse modifier deixa o peso do card semelhante ao do lado dele
                modifier = Modifier.weight(1f)
            )
            SquareComposeCard(
                title = stringResource(id = R.string.image_composable),
                description = stringResource(id = R.string.image_composable_descrip),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            SquareComposeCard(
                title = stringResource(id = R.string.row_composable),
                description = stringResource(id = R.string.row_composable_descrip),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            SquareComposeCard(
                title = stringResource(id = R.string.column_composable),
                description = stringResource(id = R.string.column_composable_descrip),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun SquareComposeCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )

    }


}

@Preview(showBackground = true)
@Composable
fun SquareComposePreview() {
    SquareComposeTheme {
        SquareCompose()
    }
}
