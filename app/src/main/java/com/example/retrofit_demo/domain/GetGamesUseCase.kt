package com.example.retrofit_demo.domain

import com.example.retrofit_demo.domain.item.GameItem
import com.example.retrofit_demo.repository.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem> {
        return gameRepository.getGames().shuffled()
    }
}