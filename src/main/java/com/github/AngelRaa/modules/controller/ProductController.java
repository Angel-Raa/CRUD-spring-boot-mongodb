package com.github.AngelRaa.modules.controller;

import com.github.AngelRaa.modules.entity.Dto.ProductDto;
import com.github.AngelRaa.modules.service.interfaces.ProductService;
import com.github.AngelRaa.modules.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/all")
    public ResponseEntity<List<ProductDto>> getAll() {
        return ResponseEntity.ok(service.findAllProducts());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable(name = "productId") String productId) {
        return ResponseEntity.ok(service.findById(productId));
    }

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(service.save(productDto));
    }


    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<ApiResponse> deleteProduct(@PathVariable(name = "productId") String productId) {
        return ResponseEntity.ok(service.delete(productId));
    }

   @PutMapping("/update/{productId}")
   public ResponseEntity<ApiResponse> updateProduct(@PathVariable(name = "productId") String productId, @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(service.update(productId, productDto));
   }
    @DeleteMapping("/delete-by-name/{name}")
    public ResponseEntity<ApiResponse> deleteProductByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(service.deleteByName(name));
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<ProductDto>> searchProduct(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(service.findAllProductsByName(name));
    }
}
