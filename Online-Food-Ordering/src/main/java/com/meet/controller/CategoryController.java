package com.meet.controller;

import com.meet.model.Category;
import com.meet.model.User;
import com.meet.service.CategoryService;
import com.meet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    private UserService userService;

    @PostMapping("/admin/category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category,
                                                   @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);

        Category createdCategory = categoryService.createCategory(category.getName(),user.getId());

        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

    @GetMapping("/category/restaurant")
    public ResponseEntity<List<Category>> getRestaurantCategory(
                                                          @RequestHeader("Authorization") String jwt) throws Exception {
       User user = userService.findUserByJwtToken(jwt);

       List<Category> categories = categoryService.findCategoryByRestaurantId(user.getId());

       return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
