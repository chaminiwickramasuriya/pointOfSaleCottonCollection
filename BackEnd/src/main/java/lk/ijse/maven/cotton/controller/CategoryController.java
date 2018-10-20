package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.CategoryDTO;
import lk.ijse.maven.cotton.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 9/6/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping( value = "/post",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCategory(@RequestBody CategoryDTO categoryDTO){
        return categoryService.saveCategory(categoryDTO);
    }

    @PostMapping(value = "/file",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveFile(@RequestParam("file") MultipartFile file){
        System.out.println(file.getOriginalFilename());
        return categoryService.uploadImage(file);
    }

    @GetMapping(value = "/file",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InputStreamResource> getImage(@RequestParam("file") String path) {
        return categoryService.getImage(path);
    }
//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<InputStreamResource> getImage() {
//        return categoryService.getImage();
//    }

    @DeleteMapping(value = "/{catCode}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public  boolean deleteCategory(@PathVariable("catCode") String categoryCode){
        return categoryService.deleteCategory(categoryCode);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CategoryDTO>getAllCategories(){return categoryService.getAllCategories();}

    @GetMapping(value = "/{catName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryDTO searchItems(@PathVariable("catName") String catName) {
        System.out.println("catName");
        System.out.println(catName);
        return categoryService.searchCategory(catName);
    }

    @GetMapping(value = "{catCode}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryDTO getItem(@PathVariable("catCode") String catCode){
        return categoryService.getItem(catCode);
    }
}
