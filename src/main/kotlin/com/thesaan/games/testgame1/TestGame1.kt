package com.thesaan.games.testgame1

import com.github.dwursteisen.minigdx.GameContext
import com.github.dwursteisen.minigdx.ecs.Engine
import com.github.dwursteisen.minigdx.ecs.entities.EntityFactory
import com.github.dwursteisen.minigdx.ecs.systems.System
import com.github.dwursteisen.minigdx.game.Game


class TestGame1(gameContext: GameContext): Game {

lateinit var context:GameContext

    override val gameContext: GameContext
        get() = context

    init {
        this.context = gameContext
    }


    override fun createEntities(entityFactory: EntityFactory) {
        TODO("Not yet implemented")
    }

    override fun createSystems(engine: Engine): List<System> {
        TODO("Not yet implemented")
    }

}