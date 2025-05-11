package com.example.jetpack_compose_assignment_1.model

data class Course(
    val id: String,
    val title: String,
    val code: String,
    val creditHours: Int,
    val description: String,
    val prerequisites: String
) 