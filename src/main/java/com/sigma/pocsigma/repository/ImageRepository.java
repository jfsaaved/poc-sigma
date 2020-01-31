package com.sigma.pocsigma.repository;

import com.sigma.pocsigma.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends CrudRepository<Image, Integer> {


}