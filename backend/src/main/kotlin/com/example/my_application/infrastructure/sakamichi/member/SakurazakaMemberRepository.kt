package com.example.my_application.infrastructure.sakamichi.member

import com.example.my_application.domain.sakamichi.member.SakurazakaMember
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class SakurazakaMemberRepository : PanacheRepository<SakurazakaMember>
