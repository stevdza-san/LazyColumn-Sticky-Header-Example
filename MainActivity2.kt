import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp
import com.example.composeapp.repository.PersonRepository
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()

                LazyColumn(
                    contentPadding = PaddingValues(12.dp)
                ) {
                    items(items = getAllData) { person ->
                        CustomItem(person = person)
                    }
                }
            }
        }
    }
}
