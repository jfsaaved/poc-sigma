package com.sigma.pocsigma.controller;

import com.sigma.pocsigma.model.Image;
import com.sigma.pocsigma.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @GetMapping("image/${id}")
    public Image findById(@RequestParam Integer id) {
        return imageRepository.findById(id);
    }

    @PostMapping("image")
    public void save(@RequestBody Image image) {
        imageRepository.save(image);
    }

    @PutMapping("image/${id}")
    public void update(@RequestParam Integer id, @RequestBody Image image) {
        imageRepository.update(id, image);
    }

    @DeleteMapping("iamge/${id}")
    public void delete(@RequestParam Integer id) {
        imageRepository.delete(id);
    }

}
