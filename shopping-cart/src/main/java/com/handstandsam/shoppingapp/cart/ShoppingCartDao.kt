package com.handstandsam.shoppingapp.cart

import com.handstandsam.shoppingapp.models.ItemWithQuantity
import kotlinx.coroutines.channels.ReceiveChannel

/**
 * All actions to access and modify our [ShoppingCart] database.
 */
interface ShoppingCartDao {

    suspend fun selectAll(): List<ItemWithQuantity>

    suspend fun selectAllStream(): ReceiveChannel<List<ItemWithQuantity>>

    suspend fun findByLabel(label: String): ItemWithQuantity?

    suspend fun upsert(itemWithQuantity: ItemWithQuantity)

    suspend fun remove(itemWithQuantity: ItemWithQuantity)

    suspend fun empty()
}