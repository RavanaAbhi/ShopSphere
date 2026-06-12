package com.dev.data.di

import android.content.Context
import com.dev.data.datasource.assets.ProductAssetDataSource
import com.dev.data.repository.ProductRepositoryImpl
import com.dev.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideProductAssetDataSource(
        @ApplicationContext context: Context
    ) = ProductAssetDataSource(context)

    @Provides
    @Singleton
    fun provideProductRepository(
        dataSource: ProductAssetDataSource
    ): ProductRepository {

        return ProductRepositoryImpl(
            dataSource
        )
    }
}