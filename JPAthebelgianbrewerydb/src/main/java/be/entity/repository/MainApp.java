package be.entity.repository;

import be.entity.model.Category;

public class MainApp {
    public static void main(String[] args) {

        Category category = new Category();
        category.setCategoryName("my category name");
        category.setId(4);

        CategoryRepository categoryRepository  = new CategoryRepository();

        categoryRepository.addCategory(category);
        System.out.println("added category" + category.toString());

        categoryRepository.updateCategory(category);
        System.out.println("updated category" + category.toString());

        //categoryRepository.deleteCategory(category);
        //System.out.println("deleted category" + category.toString());

        category = categoryRepository.findById(4);
        if (category != null) {
            System.out.println("found category" + category.toString());
        }else {
            System.out.println("not found");
        }


        categoryRepository.close();



    }
}
