package com.prodyna.training.spring.dao;

import com.prodyna.training.spring.domain.Actor;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "actors", itemResourceRel = "actor", path = "actors")
public interface ActorRepository extends JpaRepository<Actor, Long> {


    /**
     * Task 1
     * @param name
     * @return
     */

    /**
     * Task 2
     * @param brand
     * @return
     */

    /**
     * Task 3
     * @param postalCode
     * @return
     */

    /**
     * Task 4
     * @param street
     * @param sort
     */


}
