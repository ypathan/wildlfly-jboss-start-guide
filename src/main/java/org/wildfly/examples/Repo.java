package org.wildfly.examples;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface Repo extends CrudRepository<Book, Long> {
}
