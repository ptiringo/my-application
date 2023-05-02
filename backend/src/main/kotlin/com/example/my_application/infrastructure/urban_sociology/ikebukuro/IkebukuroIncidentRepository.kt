package com.example.my_application.infrastructure.urban_sociology.ikebukuro

import com.example.my_application.domain.urban_sociology.ikebukuro.IkebukuroIncident
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class IkebukuroIncidentRepository : PanacheRepository<IkebukuroIncident>
