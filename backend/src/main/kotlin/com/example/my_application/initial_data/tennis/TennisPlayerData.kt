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
    dominantHand = DominantHand.Left,
    backhandStyle = BackhandStyle.OneHanded
)

val NOVAK_DJOKOVIC = RegisterAsProCommand(
    firstName = "Novak",
    familyName = "Djokovic",
    dateOfBirth = LocalDate.of(1987, 5, 22),
    country = Country.Serbia,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val DANIIL_MEDVEDEV = RegisterAsProCommand(
    firstName = "Daniil",
    familyName = "Medvedev",
    dateOfBirth = LocalDate.of(1996, 2, 11),
    country = Country.Russia,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val KEI_NISHIKORI = RegisterAsProCommand(
    firstName = "圭",
    familyName = "錦織",
    dateOfBirth = LocalDate.of(1989, 12, 29),
    country = Country.Japan,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val ALEX_DE_MINAUR = RegisterAsProCommand(
    firstName = "De Minaur",
    familyName = "Alex",
    dateOfBirth = LocalDate.of(1999, 2, 17),
    country = Country.Australia,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val GRIGOR_DIMITROV = RegisterAsProCommand(
    firstName = "Grigor",
    familyName = "Dimitrov",
    dateOfBirth = LocalDate.of(1991, 5, 16),
    country = Country.Bulgaria,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded
)

val ANDREY_RUBLEV = RegisterAsProCommand(
    firstName = "Andrey",
    familyName = "Rublev",
    dateOfBirth = LocalDate.of(1997, 10, 20),
    country = Country.Russia,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val CARLOS_ALCARAZ = RegisterAsProCommand(
    firstName = "Carlos",
    familyName = "Alcaraz",
    dateOfBirth = LocalDate.of(2003, 5, 5),
    country = Country.Spain,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val ALEXANDER_ZVEREV = RegisterAsProCommand(
    firstName = "Alexander",
    familyName = "Zverev",
    dateOfBirth = LocalDate.of(1997, 4, 20),
    country = Country.Germany,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val SAKAMOTO_REI = RegisterAsProCommand(
    firstName = "坂本",
    familyName = "怜",
    dateOfBirth = LocalDate.of(2006, 6, 24),
    country = Country.Japan,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val STEFANOS_TSITSIPAS = RegisterAsProCommand(
    firstName = "Stefanos",
    familyName = "Tsitsipas",
    dateOfBirth = LocalDate.of(1998, 8, 12),
    country = Country.Greece,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded
)

val ROGER_FEDERER = RegisterAsProCommand(
    firstName = "Roger",
    familyName = "Federer",
    dateOfBirth = LocalDate.of(1981, 8, 8),
    country = Country.Switzerland,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded
)

val MILOS_RAONIC = RegisterAsProCommand(
    firstName = "Milos",
    familyName = "Raonic",
    dateOfBirth = LocalDate.of(1990, 12, 27),
    country = Country.Canada,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val NICOLAS_JARRY = RegisterAsProCommand(
    firstName = "Nicolas",
    familyName = "Jarry",
    dateOfBirth = LocalDate.of(1995, 10, 11),
    country = Country.Chile,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val ALEXANDER_BUBLIK = RegisterAsProCommand(
    firstName = "Alexander",
    familyName = "Bublik",
    dateOfBirth = LocalDate.of(1997, 6, 17),
    country = Country.Kazakhstan,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val THANASI_KOKKINAKIS = RegisterAsProCommand(
    firstName = "Thanasi",
    familyName = "Kokkinakis",
    dateOfBirth = LocalDate.of(1996, 4, 10),
    country = Country.Australia,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val JAN_LENNARD_STRUFF = RegisterAsProCommand(
    firstName = "Jan-Lennard",
    familyName = "Struff",
    dateOfBirth = LocalDate.of(1990, 4, 25),
    country = Country.Germany,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val FELIX_AUGER_ALIASSIME = RegisterAsProCommand(
    firstName = "Felix",
    familyName = "Auger-Aliassime",
    dateOfBirth = LocalDate.of(2000, 8, 8),
    country = Country.Canada,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val JANNIK_SINNER = RegisterAsProCommand(
    firstName = "Jannik",
    familyName = "Sinner",
    dateOfBirth = LocalDate.of(2001, 8, 16),
    country = Country.Italy,
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded
)

val TOMMY_PAUL = RegisterAsProCommand(
    firstName = "Tommy",
    familyName = "Paul",
    dateOfBirth = LocalDate.of(1997, 5, 17),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.USA
)

val OSAKA_NAOMI = RegisterAsProCommand(
    firstName = "Naomi",
    familyName = "Osaka",
    dateOfBirth = LocalDate.of(1997, 10, 16),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.Japan
)

val SEBASTIAN_OFNER = RegisterAsProCommand(
    firstName = "Sebastian",
    familyName = "Ofner",
    dateOfBirth = LocalDate.of(1996, 5, 12),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.Austria
)

val DOMINIC_THIEM = RegisterAsProCommand(
    firstName = "Dominic",
    familyName = "Thiem",
    dateOfBirth = LocalDate.of(1993, 9, 3),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded,
    country = Country.Austria
)

val CASPER_RUUD = RegisterAsProCommand(
    firstName = "Casper",
    familyName = "Ruud",
    dateOfBirth = LocalDate.of(1998, 12, 22),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.Norway
)

val MIKHAIL_YOUZHNY = RegisterAsProCommand(
    firstName = "Mikhail",
    familyName = "Youzhny",
    dateOfBirth = LocalDate.of(1982, 6, 25),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded,
    country = Country.Russia
)

val TOMAS_MACHAC = RegisterAsProCommand(
    firstName = "Tomas",
    familyName = "Machac",
    dateOfBirth = LocalDate.of(2000, 10, 13),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.CzechRepublic
)

val RICHARD_GASQUET = RegisterAsProCommand(
    firstName = "Richard",
    familyName = "Gasquet",
    dateOfBirth = LocalDate.of(1986, 6, 18),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.OneHanded,
    country = Country.France
)

val BORNA_CORIC = RegisterAsProCommand(
    firstName = "Borna",
    familyName = "Coric",
    dateOfBirth = LocalDate.of(1996, 11, 14),
    dominantHand = DominantHand.Right,
    backhandStyle = BackhandStyle.TwoHanded,
    country = Country.Croatia
)
