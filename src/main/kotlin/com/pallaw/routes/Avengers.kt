package com.pallaw.routes

import com.pallaw.data.model.Avenger
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

/**
 * for testing on emulator - change localhost to 10.0.2.2
 * for testing on real device -  change localhost to ipv4 ip address of your computer
 */
private const val BASE_URL = "http://192.168.1.18:8080"

private val avengers = listOf(
    Avenger("Aneka", "Leader of Dora Milaje, Fighters of wakanda", "$BASE_URL/img_avengers/img_aneka.jpeg"),
    Avenger("Ant Man", "He can resize", "$BASE_URL/img_avengers/img_ant_man.jpeg"),
    Avenger("Black Widow", "Trained agent", "$BASE_URL/img_avengers/img_black_widow.jpeg"),
    Avenger("Captain America", "A super human and leader of avengers", "$BASE_URL/img_avengers/img_captain_america.jpeg"),
    Avenger("Captain Marvel", "Super woman of universe", "$BASE_URL/img_avengers/img_captain_marvel.jpeg"),
    Avenger("Hawk eye", "Trained archer", "$BASE_URL/img_avengers/img_hawk_eye.jpeg"),
    Avenger("Iron Man", "Genius, Billionaire, Playboy, Philanthropist", "$BASE_URL/img_avengers/img_iron_man.jpeg"),
    Avenger("War Machine", "A soldier in iron suit", "$BASE_URL/img_avengers/img_war_machine.jpeg"),
    Avenger("Nebula", "Daughter of thanos", "$BASE_URL/img_avengers/img_nebula.jpeg"),
    Avenger("Rocket racoon", "Spacejet pilot", "$BASE_URL/img_avengers/img_rocket_racoon.jpeg"),
    Avenger("Thor", "King of Asguard", "$BASE_URL/img_avengers/img_thor.jpeg"),
)

fun Route.randomAvengers() {
    get("/randomAvengers") {
        call.respond(
            HttpStatusCode.OK,
            avengers.random()
        )
    }
}