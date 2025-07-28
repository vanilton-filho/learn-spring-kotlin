package com.vaniltonfilho.learnspring.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "restaurants")
data class Restaurant(
    @Id val id: String? = null,
    val name: String,
    @DBRef
    val kitchen: Kitchen
)