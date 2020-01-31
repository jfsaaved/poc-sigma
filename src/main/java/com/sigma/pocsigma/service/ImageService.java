package com.sigma.pocsigma.service;

import com.sigma.pocsigma.model.Image;
import com.sigma.pocsigma.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image findById(Integer id){
        return imageRepository.findById(id).orElse(null);
    }

    public Image save(Image image){
        return imageRepository.save(image);
    }

    public Image update(Integer id, Image image){
        Image newImage = imageRepository.findById(id).orElse(null);
        if(newImage != null) newImage.setName(image.getName());
        return imageRepository.save(newImage);
    }

    public void delete(Integer id){
        imageRepository.deleteById(id);
    }


}
