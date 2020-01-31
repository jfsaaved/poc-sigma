package com.sigma.pocsigma.repository;

import com.sigma.pocsigma.model.Image;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ImageRepository extends Repository<Image, Integer> {

    /**
     * Retrieve an {@link Owner} from the data store by id.
     * @param id the id to search for
     * @return the {@link Owner} if found
     */
    @Query("SELECT image FROM images WHERE id =:id")
    @Transactional(readOnly = true)
    Image findById(@Param("id") Integer id);

    @Query("SELECT image FROM images WHERE name =:name")
    @Transactional(readOnly = true)
    Image findByName(@Param("name") Integer id);

    /**
     * Save an {@link Owner} to the data store, either inserting or updating it.
     * @param owner the {@link Owner} to save
     */
    void save(Image image);

    void update(@Param("id") Integer id, Image image);

    void delete(@Param("id") Integer id);

}