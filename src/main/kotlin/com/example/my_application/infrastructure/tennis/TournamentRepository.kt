package com.example.my_application.infrastructure.tennis

import com.example.my_application.domain.tennis.Tournament
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TournamentRepository : PanacheRepository<Tournament>
