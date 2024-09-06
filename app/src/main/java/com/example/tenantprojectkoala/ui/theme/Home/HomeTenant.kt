package com.example.tenantprojectkoala.ui.theme.Home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tenantprojectkoala.R
import com.example.tenantprojectkoala.navigation.ROUTE_HOME_MAIN
import com.example.tenantprojectkoala.navigation.ROUTE_VIEW_HOUSES


@Composable
fun HomeTenant(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.city),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
                .fillMaxWidth()
        ){
//            ConstraintLayout{
//            }
            Box (modifier = Modifier
                .fillMaxWidth()
                .height(245.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color.Green, Color.Blue)
                    ),
                    shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp)
                )


            ){
                Row(
                    modifier = Modifier
                        .padding(top = 48.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth()
                ){
                    Column (
                        modifier = Modifier
                            .height(100.dp)
                            .padding(start = 14.dp)
                            .weight(0.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = "Homepage",
                            color = Color.White,
                            fontSize = 20.sp)

                        Text(text = "Welcome to the Homepage",
                            color = Color.White,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp, start = 5.dp)

                        )
                    }
                    Image(painter = painterResource(id = R.drawable.background),
                        contentDescription = null,
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .clickable { })
                }

            }
            var text by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "Search for...") },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.searchimg),
                        contentDescription = null,
                        modifier = Modifier
                            .size(43.dp)
                            .padding(end = 6.dp)
                    )
                },
                shape = RoundedCornerShape(50.dp),
//            colors = TextFieldDefaults.outlinedTextFieldColors(
//                focusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
//                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e")),
//                focusedBorderColor = Color.Transparent,
//                unfocusedBorderColor = Color.Transparent
//            )
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, end = 24.dp, start = 24.dp)
                    .shadow(3.dp, shape = RoundedCornerShape(25.dp))
            )
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 24.dp, end = 24.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color.Green, Color.Blue)
                    ),
                    shape = RoundedCornerShape(20.dp)
                ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

            }




            Box (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, end = 24.dp, start = 24.dp)
                .height(325.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color.Green, Color.Blue)
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
            ){
                Column {
                    Row {
                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.viewhouse),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                                    .clickable { navController.navigate(ROUTE_VIEW_HOUSES) }
                            )
                            Text(text = "ViewHouses",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.favorite),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                                    .clickable { }
                            )
                            Text(text = "Favorite ",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.home1),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                                    .clickable { navController.navigate(ROUTE_HOME_MAIN) }

                            )
                            Text(text = "Home",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }
                    }
                    Row {
                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.info),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Info",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.profile1),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Profile ",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.settings),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Settings",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                color = Color.Black
                            )
                        }
                    }
                    Row {
                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.measege),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Messages",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.notification1),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Notification",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                color = Color.Black
                            )
                        }

                        Column (modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 15.dp)
                            .height(80.dp)
                            .width(80.dp)
                            .background(
                                color = Color.LightGray,
                                shape = RoundedCornerShape(15.dp)
                            ),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Image(painter = painterResource(id = R.drawable.logout1),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(50.dp)
                            )
                            Text(text = "Log Out",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic,
                                color = Color.Black
                            )
                        }
                    }

                }
            }
        }

    }
}





@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomeTenantPreview() {
    HomeTenant(rememberNavController())
}