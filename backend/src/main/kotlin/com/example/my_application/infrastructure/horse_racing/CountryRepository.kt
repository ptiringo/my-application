package com.example.my_application.infrastructure.horse_racing

import com.example.my_application.domain.horse_racing.Country
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CountryRepository : PanacheRepository<Country>
