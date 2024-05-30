package com.example.faqscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faqscreen.ui.theme.FAQScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FAQScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    Column(modifier=modifier,
        verticalArrangement = Arrangement.Center,
        Alignment.CenterHorizontally){
        Image(painter = painterResource(id = R.drawable.faq), contentDescription = "FAQ Image",
            modifier=Modifier.width(400.dp)
                .height(200.dp)
        )
        Text(
            text = "1. What happens if i enter the wrong OTP during account verification?",
            color = Color.Blue,
            fontSize=20.sp
        )

        Text(
            text =
            "If you enter the wrong OTP, you will be shown an error message and will have to" +
                    " re-enter the correct code. Please mention the correct OTP that you receive on your" +
                    " registered mobile number via SMS to proceed with the verification process successfully.",
        )
        Text(
            text = "2. Where can i contact if i face any issues while booking a hotel room using the app?",
            color = Color.Blue,
            fontSize=20.sp
        )
        Text(
            text =
            "If yor face any issues during your booking process you can reach out to our customer support team" +
                    "by at dummy@book_nest.com or call us at 9999999999."
        )
        Text(text =
        "Is my personal information secure when using this app?",
            color = Color.Blue,
            fontSize=20.sp
        )
        Text(text =
        "Yes, we value the trust of our users and prioritise the security of their personal information" +
                ". All your data, including personal details and booking information is secure with us" +
                "and protected using encryption protocols to ensure confidentiality.")


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FAQScreenTheme {
        Greeting()
    }
}