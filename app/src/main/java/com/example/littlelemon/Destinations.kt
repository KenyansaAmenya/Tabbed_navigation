package com.example.littlelemon

interface Destinations {
    val route: String
    val icon: Int
    val title: String
}
object Menu: Destinations {
    override val route: String = "menu"
    override val icon: Int = R.drawable.ic_menu
    override val title: String = "Menu"
}
object Home: Destinations {
    override val route: String = "home"
    override val icon: Int = R.drawable.ic_menu
    override val title: String = "Home"
}
object Location: Destinations {
    override val route: String = "location"
    override val icon: Int = R.drawable.ic_menu
    override val title: String = "Location"
}

