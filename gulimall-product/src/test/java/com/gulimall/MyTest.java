package com.gulimall;

import com.gulimall.entity.BrandEntity;
import com.gulimall.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Resource
    private BrandService brandService;

    @Test
    public void test1() {
        BrandEntity brand = new BrandEntity();
        brand.setName("XIAOMI");
        brand.setDescript("永远相信美好的事情即将发生");
        if (brandService.save(brand)) {
            System.out.println(brand);
        }
    }

    @Test
    public void test2() {
        System.out.println(brandService.removeById(1));
    }

}
