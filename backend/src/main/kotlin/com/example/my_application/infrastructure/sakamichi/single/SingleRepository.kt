package com.example.my_application.infrastructure.sakamichi.single

import com.example.my_application.domain.sakamichi.single.Single
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class SingleRepository : PanacheRepository<Single>
