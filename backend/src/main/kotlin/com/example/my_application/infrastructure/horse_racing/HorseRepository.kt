package com.example.my_application.infrastructure.horse_racing

import com.example.my_application.domain.horse_racing.horse.Horse
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class HorseRepository : PanacheRepository<Horse>
