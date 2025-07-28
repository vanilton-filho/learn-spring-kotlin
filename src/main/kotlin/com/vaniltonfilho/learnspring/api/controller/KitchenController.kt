package com.vaniltonfilho.learnspring.api.controller

import com.vaniltonfilho.learnspring.domain.model.Kitchen
import com.vaniltonfilho.learnspring.domain.repository.KitchenRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kitchens")
class KitchenController(private val kitchenRepository: KitchenRepository) {

    @GetMapping
    fun getAllKitchens(): List<Kitchen> = kitchenRepository.findAll();

    @PostMapping
    fun createKitchen(@RequestBody kitchen: Kitchen): Kitchen = kitchenRepository.save(kitchen);
}