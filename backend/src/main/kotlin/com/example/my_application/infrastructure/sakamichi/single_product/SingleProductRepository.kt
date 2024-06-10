package com.example.my_application.infrastructure.sakamichi.single_product

import com.example.my_application.domain.sakamichi.single_product.SingleProduct
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class SingleProductRepository : PanacheRepository<SingleProduct>
