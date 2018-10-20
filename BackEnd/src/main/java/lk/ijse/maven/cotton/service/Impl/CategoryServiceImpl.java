package lk.ijse.maven.cotton.service.Impl;

import lk.ijse.maven.cotton.dto.CategoryDTO;
import lk.ijse.maven.cotton.entity.Category;
import lk.ijse.maven.cotton.repository.CategoryRepository;
import lk.ijse.maven.cotton.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Ireshika Chamini on 9/6/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    private String path;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCategory(CategoryDTO categoryDTO) {
        Category category=new Category();
        category.setCatCode(categoryDTO.getCatCode());
        category.setCatName(categoryDTO.getCatName());
        category.setCatPrice(categoryDTO.getCatPrice());
        category.setCatType(categoryDTO.getCatType());
        category.setQtyOnHand(categoryDTO.getQtyOnHand());
        category.setSize(categoryDTO.getSize());
        category.setImgPath(path);
        categoryRepository.save(category);
        return true;
    }

    @Override
    public boolean uploadImage(MultipartFile file) {
    if (!file.getOriginalFilename().isEmpty()) {
        BufferedOutputStream outputStream = null;
        try {

            outputStream = new BufferedOutputStream(
                    new FileOutputStream(
                            new File("F:/Server", file.getOriginalFilename())));
            path = "http://localhost:8080/api/v1/categories/file?file=F:/Server/" + file.getOriginalFilename();
            System.out.println(path);
            outputStream.write(file.getBytes());
            outputStream.flush();
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return true;
}

    @Override
    public CategoryDTO searchCategory(String catName) {
        return null;
    }


    @Override
    public ResponseEntity<InputStreamResource> getImage(String path) {
        String FILE_PATH=path;
        File file = new File(FILE_PATH);
        InputStreamResource resource = null;
        try {
            resource = new InputStreamResource(new FileInputStream(file));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename=" + file.getName())
                .contentType(MediaType.APPLICATION_PDF).contentLength(file.length())
                .body(resource);
    }

    @Override
    public ArrayList<CategoryDTO> getAllCategories() {
        List<Category>categories=categoryRepository.findAll();
        ArrayList<CategoryDTO>categoryDTOS=new ArrayList<>();
        for(Category category:categories){
            CategoryDTO categoryDTO=new CategoryDTO(category.getCatCode(),category.getCatName(),category.getCatType(),
                    category.getCatPrice(),category.getQtyOnHand(),category.getSize(),category.getImgPath());
            categoryDTOS.add(categoryDTO);
        }
        return categoryDTOS;
    }

    @Override
    public CategoryDTO getItem(String catCode) {
        Optional<Category> item=categoryRepository.findById(catCode);
        CategoryDTO itemDTO=new CategoryDTO(item.get().getCatCode(),item.get().getCatName(),item.get().getCatType(),item.get().getCatPrice(),item.get().getQtyOnHand(),item.get().getSize(),item.get().getImgPath());
        return itemDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCategory(String categoryCode) {
        categoryRepository.deleteById(categoryCode);
        return true;
    }



}
