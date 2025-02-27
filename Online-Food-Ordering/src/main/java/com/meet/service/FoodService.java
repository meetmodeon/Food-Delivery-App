package com.meet.service;

import com.meet.model.Category;
import com.meet.model.Food;
import com.meet.model.Restaurant;
import com.meet.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
    void deleteFood(Long foodId)throws Exception;
    public List<Food> getRestaurantsFood(Long restaurantId,boolean isVegetarian,boolean isNonVeg,boolean isSeasonal,String foodCategory);
    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long foodId) throws Exception;
    public Food updateAvailabilityStatus(Long foodId) throws Exception;

}
