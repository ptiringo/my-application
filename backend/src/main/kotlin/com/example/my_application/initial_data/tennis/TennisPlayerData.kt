package com.example.my_application.initial_data.tennis

import com.example.my_application.application.tennis.RegisterAsProCommand
import com.example.my_application.domain.tennis.Country
import com.example.my_application.domain.tennis.player.BackhandStyle
import com.example.my_application.domain.tennis.player.DominantHand
import java.time.LocalDate

val RAFAEL_NADAL = RegisterAsProCommand(
    firstName = "Rafael",
    familyName = "Nadal",
    dateOfBirth = LocalDate.of(1986, 6, 3),
    country = Country.Spain,
    dominantHand = DominantHand.LEFT,
    backhandStyle = BackhandStyle.ONE_HANDED
)

val NOVAK_DJOKOVIC = RegisterAsProCommand(
    firstName = "Novak",
    familyName = "Djokovic",
    dateOfBirth = LocalDate.of(1987, 5, 22),
    country = Country.Serbia,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val DANIIL_MEDVEDEV = RegisterAsProCommand(
    firstName = "Daniil",
    familyName = "Medvedev",
    dateOfBirth = LocalDate.of(1996, 2, 11),
    country = Country.Russia,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val KEI_NISHIKORI = RegisterAsProCommand(
    firstName = "圭",
    familyName = "錦織",
    dateOfBirth = LocalDate.of(1989, 12, 29),
    country = Country.Japan,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val ALEX_DE_MINAUR = RegisterAsProCommand(
    firstName = "De Minaur",
    familyName = "Alex",
    dateOfBirth = LocalDate.of(1999, 2, 17),
    country = Country.Australia,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val GRIGOR_DIMITROV = RegisterAsProCommand(
    firstName = "Grigor",
    familyName = "Dimitrov",
    dateOfBirth = LocalDate.of(1991, 5, 16),
    country = Country.Bulgaria,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.ONE_HANDED
)

val ANDREY_RUBLEV = RegisterAsProCommand(
    firstName = "Andrey",
    familyName = "Rublev",
    dateOfBirth = LocalDate.of(1997, 10, 20),
    country = Country.Russia,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val CARLOS_ALCARAZ = RegisterAsProCommand(
    firstName = "Carlos",
    familyName = "Alcaraz",
    dateOfBirth = LocalDate.of(2003, 5, 5),
    country = Country.Spain,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val ALEXANDER_ZVEREV = RegisterAsProCommand(
    firstName = "Alexander",
    familyName = "Zverev",
    dateOfBirth = LocalDate.of(1997, 4, 20),
    country = Country.Germany,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val SAKAMOTO_REI = RegisterAsProCommand(
    firstName = "坂本",
    familyName = "怜",
    dateOfBirth = LocalDate.of(2006, 6, 24),
    country = Country.Japan,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val STEFANOS_TSITSIPAS = RegisterAsProCommand(
    firstName = "Stefanos",
    familyName = "Tsitsipas",
    dateOfBirth = LocalDate.of(1998, 8, 12),
    country = Country.Greece,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.ONE_HANDED
)

val ROGER_FEDERER = RegisterAsProCommand(
    firstName = "Roger",
    familyName = "Federer",
    dateOfBirth = LocalDate.of(1981, 8, 8),
    country = Country.Switzerland,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.ONE_HANDED
)

val MILOS_RAONIC = RegisterAsProCommand(
    firstName = "Milos",
    familyName = "Raonic",
    dateOfBirth = LocalDate.of(1990, 12, 27),
    country = Country.Canada,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val NICOLAS_JARRY = RegisterAsProCommand(
    firstName = "Nicolas",
    familyName = "Jarry",
    dateOfBirth = LocalDate.of(1995, 10, 11),
    country = Country.Chile,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val ALEXANDER_BUBLIK = RegisterAsProCommand(
    firstName = "Alexander",
    familyName = "Bublik",
    dateOfBirth = LocalDate.of(1997, 6, 17),
    country = Country.Kazakhstan,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val THANASI_KOKKINAKIS = RegisterAsProCommand(
    firstName = "Thanasi",
    familyName = "Kokkinakis",
    dateOfBirth = LocalDate.of(1996, 4, 10),
    country = Country.Australia,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val JAN_LENNARD_STRUFF = RegisterAsProCommand(
    firstName = "Jan-Lennard",
    familyName = "Struff",
    dateOfBirth = LocalDate.of(1990, 4, 25),
    country = Country.Germany,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val FELIX_AUGER_ALIASSIME = RegisterAsProCommand(
    firstName = "Felix",
    familyName = "Auger-Aliassime",
    dateOfBirth = LocalDate.of(2000, 8, 8),
    country = Country.Canada,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val JANNIK_SINNER = RegisterAsProCommand(
    firstName = "Jannik",
    familyName = "Sinner",
    dateOfBirth = LocalDate.of(2001, 8, 16),
    country = Country.Italy,
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED
)

val TOMMY_PAUL = RegisterAsProCommand(
    firstName = "Tommy",
    familyName = "Paul",
    dateOfBirth = LocalDate.of(1997, 5, 17),
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED,
    country = Country.USA
)

val OSAKA_NAOMI = RegisterAsProCommand(
    firstName = "Naomi",
    familyName = "Osaka",
    dateOfBirth = LocalDate.of(1997, 10, 16),
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED,
    country = Country.Japan
)

val SEBASTIAN_OFNER = RegisterAsProCommand(
    firstName = "Sebastian",
    familyName = "Ofner",
    dateOfBirth = LocalDate.of(1996, 5, 12),
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED,
    country = Country.Austria
)

val DOMINIC_THIEM = RegisterAsProCommand(
    firstName = "Dominic",
    familyName = "Thiem",
    dateOfBirth = LocalDate.of(1993, 9, 3),
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.ONE_HANDED,
    country = Country.Austria
)

val CASPER_RUUD = RegisterAsProCommand(
    firstName = "Casper",
    familyName = "Ruud",
    dateOfBirth = LocalDate.of(1998, 12, 22),
    dominantHand = DominantHand.RIGHT,
    backhandStyle = BackhandStyle.TWO_HANDED,
    country = Country.Norway
)
