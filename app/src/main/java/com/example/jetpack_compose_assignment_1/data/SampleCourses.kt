package com.example.jetpack_compose_assignment_1.data

import com.example.jetpack_compose_assignment_1.model.Course

object SampleCourses {
    val courses = listOf(
        Course(
            id = "1",
            title = "Introduction to Computer Science",
            code = "CS101",
            creditHours = 3,
            description = "An introductory course covering fundamental concepts of computer science, programming, and problem-solving techniques.",
            prerequisites = "None"
        ),
        Course(
            id = "2",
            title = "Data Structures and Algorithms",
            code = "CS201",
            creditHours = 4,
            description = "Study of fundamental data structures and algorithms, including arrays, linked lists, trees, graphs, and their applications.",
            prerequisites = "CS101"
        ),
        Course(
            id = "3",
            title = "Database Systems",
            code = "CS301",
            creditHours = 3,
            description = "Introduction to database design, SQL, normalization, and database management systems.",
            prerequisites = "CS201"
        ),
        Course(
            id = "4",
            title = "Mobile App Development",
            code = "CS401",
            creditHours = 4,
            description = "Learn to develop mobile applications using modern frameworks and tools.",
            prerequisites = "CS201, CS301"
        ),
        Course(
            id = "5",
            title = "Software Engineering",
            code = "CS501",
            creditHours = 3,
            description = "Study of software development methodologies, design patterns, and best practices.",
            prerequisites = "CS301"
        )
    )
} 