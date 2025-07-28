package com.vaniltonfilho.learnspring.api.controller

import com.vaniltonfilho.learnspring.api.controller.dto.RestaurantDTO
import com.vaniltonfilho.learnspring.domain.model.Restaurant
import com.vaniltonfilho.learnspring.domain.repository.KitchenRepository
import com.vaniltonfilho.learnspring.domain.repository.RestaurantRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurants")
class RestaurantController(
    private val restaurantRepository: RestaurantRepository,
    private val kitchenRepository: KitchenRepository
) {

    @GetMapping
    fun listRestaurants(): List<Restaurant> = restaurantRepository.findAll()

    @PostMapping
    fun createRestaurant(@RequestBody dto: RestaurantDTO): Restaurant {
        val kitchen = kitchenRepository.findById(dto.kitchenId)
            .orElseThrow { RuntimeException("Kitchen not found") }

        val restaurant = Restaurant(name = dto.name, kitchen = kitchen)
        return restaurantRepository.save(restaurant)
    }
}