package com.moran.search.engine.repository;

import org.springframework.data.repository.CrudRepository;

import com.moran.search.engine.models.search.CompositKey;
import com.moran.search.engine.models.search.WordCount;

public interface SiteWordCountRepository extends CrudRepository<WordCount, CompositKey> {

}
