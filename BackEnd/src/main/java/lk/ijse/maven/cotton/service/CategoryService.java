package lk.ijse.maven.cotton.service;

import lk.ijse.maven.cotton.dto.CategoryDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;


/**
 * Created by Ireshika Chamini on 9/6/2018.
 */
public interface CategoryService {

    public boolean saveCategory(CategoryDTO categoryDTO);

    public ArrayList<CategoryDTO> getAllCategories();

    public CategoryDTO getItem(String catCode);

    public  boolean deleteCategory(String categoryCode);

    public boolean uploadImage(MultipartFile file);

    public ResponseEntity<InputStreamResource> getImage(String path);

    public CategoryDTO searchCategory(String catName);
}
