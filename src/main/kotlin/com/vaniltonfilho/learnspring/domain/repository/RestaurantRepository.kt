package com.vaniltonfilho.learnspring.domain.repository

import com.vaniltonfilho.learnspring.domain.model.Restaurant
import org.springframework.data.mongodb.repository.MongoRepository

interface RestaurantRepository : MongoRepository<Restaurant, String>