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
}