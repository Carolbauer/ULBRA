package br.com.ulbra.`as`.data.di

import br.com.ulbra.`as`.data.CharactersApi
import br.com.ulbra.`as`.data.dataSources.CharactersDataSource
import br.com.ulbra.`as`.data.repositories.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    @Singleton
    fun providesDataSourceModule(
        api: CharactersApi
    )
            : CharactersDataSource{
        return CharactersDataSource(api)
    }
}