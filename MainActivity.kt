import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                val sections = listOf("A", "B", "C", "D", "E", "F", "G")

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    sections.forEach { section ->
                        stickyHeader {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.LightGray)
                                    .padding(12.dp),
                                text = "Section $section"
                            )
                        }
                        items(10) {
                            Text(
                                modifier = Modifier.padding(12.dp),
                                text = "Item $it from the section $section"
                            )
                        }
                    }
                }
            }
        }
    }
}
