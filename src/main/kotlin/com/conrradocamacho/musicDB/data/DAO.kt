package com.conrradocamacho.musicDB.data

import javax.persistence.EntityManager

abstract class DAO<TModel, TEntity>(val manager: EntityManager, val entityType: Class<TEntity>) {

    abstract fun toEntity(obj: TModel): TEntity

    abstract fun toModel(entity: TEntity): TModel

    open fun getList(): List<TModel> {
        val query = manager.createQuery("FROM ${entityType.simpleName}", entityType)
        return query.resultList.map { entity -> toModel(entity) }
    }

    open fun add(obj: TModel) {
        val entity = toEntity(obj)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }

    open fun getById(id: Int): TModel {
        val entity = getEntityById(id)
        return toModel(entity)
    }

    open fun delete(id: Int) {
        val entity = getEntityById(id)
        manager.transaction.begin()
        manager.remove(entity)
        manager.transaction.commit()
    }

    open fun alter(obj: TModel) {
        val entity = toEntity(obj)
        manager.transaction.begin()
        manager.merge(entity)
        manager.transaction.commit()
    }

    private fun getEntityById(id: Int): TEntity {
        val query = manager.createQuery("FROM ${entityType.simpleName} WHERE id=:id", entityType)
        query.setParameter("id", id)
        val entity = query.singleResult
        return entity
    }
}