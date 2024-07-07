package br.com.ulbra.`as`.data.di

import br.com.ulbra.`as`.data.dataSources.CharactersDataSource
import br.com.ulbra.`as`.data.repositories.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providesCharacteresRepository(
        charactersDataSource: CharactersDataSource
    )
    : CharacterRepository{
        return CharacterRepository(charactersDataSource)
    }
}