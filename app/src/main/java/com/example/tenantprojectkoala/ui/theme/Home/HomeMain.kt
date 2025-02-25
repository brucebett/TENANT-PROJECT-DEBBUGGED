package com.example.tenantprojectkoala.ui.theme.Home

//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tenantprojectkoala.R
import com.example.tenantprojectkoala.navigation.ROUTE_LANDLORD_REGISTER
import com.example.tenantprojectkoala.navigation.ROUTE_TENANT_LOGIN
import com.example.tenantprojectkoala.navigation.ROUTE_TENANT_REGISTER
import com.example.tenantprojectkoala.ui.theme.Blue
import com.example.tenantprojectkoala.ui.theme.Green

@Composable
fun Homemain(navController: NavController,
             text: String,
            textColor: Color,
            gradient: Brush,
            onClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "You Are Welcome",
            fontSize = 35.sp,
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.LineThrough,

            modifier = Modifier
                .padding(35.dp)
                .fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .height(220.dp)
            .scale(1.4f),
            painter = painterResource(id = R.drawable.logomain) ,
            contentDescription = "Logo")

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Are You",
            fontSize = 35.sp,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 1.8.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(15.dp)

            )
        Spacer(modifier = Modifier.height(10.dp))
        Button(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .height(160.dp)
            .fillMaxWidth()
            .padding(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            contentPadding = PaddingValues(5.dp),


            onClick = { navController.navigate(ROUTE_LANDLORD_REGISTER) }
//               modifier = Modifier
//               .padding(16.dp)
//               .height(50.dp)
//                .fillMaxWidth()
        )
        {
            Box(
                modifier = Modifier
                    .background(gradient)
                    .padding(horizontal = 9.dp, vertical = 15.dp)
                    .fillMaxWidth(),

                contentAlignment = Alignment.Center

            ) {
                Text(text = "A LANDLORD?",
                     color = textColor,
//                    modifier = Modifier
//                        .width(300.dp),
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.5.sp,

                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(0.dp))
        Text(text = "or",
            fontSize = 35.sp,
            color = Color.Green,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 1.8.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(15.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .height(160.dp)
            .fillMaxWidth()
            .padding(10.dp)
            ,

            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(5.dp),

            onClick = { navController.navigate(ROUTE_TENANT_REGISTER)}


        )
        {
            Box(
                modifier = Modifier
                    .background(gradient)
                    .padding(horizontal = 9.dp, vertical = 15.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "A TENANT?",
                    color = textColor,
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.5.sp
                    )
                )
            }
        }



    }


    }







@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Home(){
    Homemain(
        rememberNavController(),
        text = "Button",
        textColor = Color.Black,
        gradient = Brush.horizontalGradient(
        colors = listOf(Blue, Green)
    )) {}
}