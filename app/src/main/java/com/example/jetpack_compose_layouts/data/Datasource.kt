package com.example.jetpack_compose_layouts.data

import com.example.jetpack_compose_layouts.R
import com.example.jetpack_compose_layouts.model.Affirmation
import com.example.jetpack_compose_layouts.model.Topic

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.architecture),
        Topic(R.string.automotive, 30, R.drawable.automotive),
        Topic(R.string.biology, 90, R.drawable.biology),
        Topic(R.string.crafts, 121, R.drawable.crafts),
        Topic(R.string.business, 78, R.drawable.business),
        Topic(R.string.culinary, 118, R.drawable.culinary),
        Topic(R.string.design, 423, R.drawable.design),
        Topic(R.string.ecology, 28, R.drawable.ecology),
        Topic(R.string.engineering, 67, R.drawable.engineering),
        Topic(R.string.fashion, 92, R.drawable.fashion),
        Topic(R.string.finance, 100, R.drawable.finance),
        Topic(R.string.film, 165, R.drawable.film),
        Topic(R.string.gaming, 37, R.drawable.gaming),
        Topic(R.string.geology, 290, R.drawable.geology),
        Topic(R.string.drawing, 326, R.drawable.drawing),
        Topic(R.string.history, 189, R.drawable.history),
        Topic(R.string.journalism, 96, R.drawable.journalism),
        Topic(R.string.law, 58, R.drawable.law),
        Topic(R.string.lifestyle, 305, R.drawable.lifestyle),
        Topic(R.string.music, 212, R.drawable.music),
        Topic(R.string.painting, 172, R.drawable.painting),
        Topic(R.string.photography, 321, R.drawable.photography),
        Topic(R.string.physics, 41, R.drawable.physics),
        Topic(R.string.tech, 118, R.drawable.tech)
    )
}
