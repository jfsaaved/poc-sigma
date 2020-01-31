package com.sigma.pocsigma.controller;

import com.sigma.pocsigma.model.Image;
import com.sigma.pocsigma.repository.ImageRepository;
import com.sigma.pocsigma.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping("image/${id}")
    public Image findById(@RequestParam Integer id) {
        return imageService.findById(id);
    }

    @PostMapping("image")
    public void save(@RequestBody Image image) {
        imageService.save(image);
    }

    @PutMapping("image/${id}")
    public void update(@RequestParam Integer id, @RequestBody Image image) {
        imageService.update(id, image);
    }

    @DeleteMapping("image/${id}")
    public void delete(@RequestParam Integer id) {
        imageService.delete(id);
    }

}
