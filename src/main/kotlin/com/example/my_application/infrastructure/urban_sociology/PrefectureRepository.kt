package com.example.my_application.infrastructure.urban_sociology

import com.example.my_application.domain.urban_sociology.Prefecture
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PrefectureRepository: PanacheRepository<Prefecture>