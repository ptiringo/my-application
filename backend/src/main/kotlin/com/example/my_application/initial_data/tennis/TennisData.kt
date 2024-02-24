package com.example.my_application.initial_data.tennis

import com.example.my_application.application.tennis.RegisterAsProCommand
import com.example.my_application.application.tennis.RegisterTournamentCommand
import com.example.my_application.domain.tennis.Country
import com.example.my_application.domain.tennis.tournament.TennisSurface
import com.example.my_application.domain.tennis.tournament.TournamentCategory
import java.time.LocalDate

val MONTE_CARLO = RegisterTournamentCommand(
    name = "Monte-Carlo Masters",
    location = "Monte-Carlo",
    tournamentCategory = TournamentCategory.ATP_TOUR_MASTERS_1000,
    tennisSurface = TennisSurface.CLAY
)

val AUSTRALIAN_OPEN = RegisterTournamentCommand(
    name = "Australian Open",
    location = "Melbourne",
    tournamentCategory = TournamentCategory.GRAND_SLAM,
    tennisSurface = TennisSurface.HARD
)

val RAFAEL_NADAL = RegisterAsProCommand(
    firstName = "Rafael",
    familyName = "Nadal",
    dateOfBirth = LocalDate.of(1986, 6, 3),
    country = Country.Spain
)

val NOVAK_DJOKOVIC = RegisterAsProCommand(
    firstName = "Novak",
    familyName = "Djokovic",
    dateOfBirth = LocalDate.of(1987, 5, 22),
    country = Country.Serbia
)

val DANIIL_MEDVEDEV = RegisterAsProCommand(
    firstName = "Daniil",
    familyName = "Medvedev",
    dateOfBirth = LocalDate.of(1996, 2, 11),
    country = Country.Russia
)

val KEI_NISHIKORI = RegisterAsProCommand(
    firstName = "圭",
    familyName = "錦織",
    dateOfBirth = LocalDate.of(1989, 12, 29),
    country = Country.Japan
)

val ALEX_DE_MINAUR = RegisterAsProCommand(
    firstName = "De Minaur",
    familyName = "Alex",
    dateOfBirth = LocalDate.of(1999, 2, 17),
    country = Country.Australia
)

val GRIGOR_DIMITROV = RegisterAsProCommand(
    firstName = "Grigor",
    familyName = "Dimitrov",
    dateOfBirth = LocalDate.of(1991, 5, 16),
    country = Country.Bulgaria
)

val ANDREY_RUBLEV = RegisterAsProCommand(
    firstName = "Andrey",
    familyName = "Rublev",
    dateOfBirth = LocalDate.of(1997, 10, 20),
    country = Country.Russia
)

val CARLOS_ALCARAZ = RegisterAsProCommand(
    firstName = "Carlos",
    familyName = "Alcaraz",
    dateOfBirth = LocalDate.of(2003, 5, 5),
    country = Country.Spain
)

val ALEXANDER_ZVEREV = RegisterAsProCommand(
    firstName = "Alexander",
    familyName = "Zverev",
    dateOfBirth = LocalDate.of(1997, 4, 20),
    country = Country.Germany
)

val SAKAMOTO_REI = RegisterAsProCommand(
    firstName = "坂本",
    familyName = "怜",
    dateOfBirth = LocalDate.of(2006, 6, 24),
    country = Country.Japan
)

val STEFANOS_TSITSIPAS = RegisterAsProCommand(
    firstName = "Stefanos",
    familyName = "Tsitsipas",
    dateOfBirth = LocalDate.of(1998, 8, 12),
    country = Country.Greece
)

val ROGER_FEDERER = RegisterAsProCommand(
    firstName = "Roger",
    familyName = "Federer",
    dateOfBirth = LocalDate.of(1981, 8, 8),
    country = Country.Switzerland
)

val MILOS_RAONIC = RegisterAsProCommand(
    firstName = "Milos",
    familyName = "Raonic",
    dateOfBirth = LocalDate.of(1990, 12, 27),
    country = Country.Canada
)

val NICOLAS_JARRY = RegisterAsProCommand(
    firstName = "Nicolas",
    familyName = "Jarry",
    dateOfBirth = LocalDate.of(1995, 10, 11),
    country = Country.Chile
)
