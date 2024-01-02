package com.example.my_application.infrastructure.horse_racing.trainer

import com.example.my_application.domain.horse_racing.trainer.Trainer
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TrainerRepository : PanacheRepository<Trainer>
