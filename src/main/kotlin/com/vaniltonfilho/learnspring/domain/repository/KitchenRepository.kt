package com.vaniltonfilho.learnspring.domain.repository

import com.vaniltonfilho.learnspring.domain.model.Kitchen
import org.springframework.data.mongodb.repository.MongoRepository

interface KitchenRepository : MongoRepository<Kitchen, String>