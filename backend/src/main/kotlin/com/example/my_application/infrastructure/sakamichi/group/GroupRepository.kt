package com.example.my_application.infrastructure.sakamichi.group

import com.example.my_application.domain.sakamichi.group.Group
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GroupRepository : PanacheRepository<Group>
