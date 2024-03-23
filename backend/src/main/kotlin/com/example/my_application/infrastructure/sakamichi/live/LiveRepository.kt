package com.example.my_application.infrastructure.sakamichi.live

import com.example.my_application.domain.sakamichi.live.Live
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class LiveRepository : PanacheRepository<Live>
