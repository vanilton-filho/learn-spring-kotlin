package com.vaniltonfilho.learnspring.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "kitchens")
data class Kitchen(
    @Id val id: String? = null, val name: String)
