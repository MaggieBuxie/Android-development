package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.intellij.lang.annotations.JdkConstants
import kotlin.contracts.contract


class DashBoardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DashBoard()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "dashboard background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()// Ensure the Image modifier fills the Box

        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text(text = "KRA") },
            navigationIcon = {
                IconButton(onClick = {/*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Home"
                    )
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White,
                titleContentColor = Color.Blue,
                navigationIconContentColor = Color.Red
            ),

            actions = {
                IconButton(onClick = { /**TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "My Profile"
                    )
                }
                IconButton(onClick = { /**TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search Here"
                    )
                }
                IconButton(onClick = { /**TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Menu"
                    )
                }


            })
        Row(modifier = Modifier.wrapContentWidth()) {
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo1),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo2),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo3),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }

        }
        Row(modifier = Modifier.wrapContentWidth()) {
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo4),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo5),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }
            Card(
                modifier = Modifier.padding(10.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Box(modifier = Modifier.height(70.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.logo6),
                        contentDescription = "New Client"
                    )
                    Box(
                        modifier = Modifier.matchParentSize()
                            .padding(10.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            color = Color.Blue,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            text = "NEW CLIENT"
                        )
                    }

                }
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardPreview() {
    DashBoard()
}

