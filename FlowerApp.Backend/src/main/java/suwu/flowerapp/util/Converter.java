package suwu.flowerapp.util;

import suwu.flowerapp.entity.food.Food;
import suwu.flowerapp.response.food.FoodItem;
import suwu.flowerapp.response.food.SupplierFoodDetailResponse;
import suwu.flowerapp.entity.food.Food;
import suwu.flowerapp.response.food.FoodItem;
import suwu.flowerapp.response.food.SupplierFoodDetailResponse;

public class Converter {

    public static FoodItem fromFoodToFoodItem(Food food) {
        return new FoodItem(food.getId(), food.getName(), food.getUrl(), food.getPrice(), food.isHasChoice(), food.getChoice());
    }

    public static SupplierFoodDetailResponse fromFoodToSupplierFoodDetailResponse(Food food) {
        return new SupplierFoodDetailResponse(food.getId(), food.getName(), food.getUrl(), food.getPrice(), food.isHasChoice(), food.getChoice(), food.getPort().getName());
    }
}
