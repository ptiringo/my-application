package com.example.my_application.infrastructure.sakamichi

import com.example.my_application.domain.sakamichi.NogizakaMember
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class NogizakaMemberRepository : PanacheRepository<NogizakaMember>