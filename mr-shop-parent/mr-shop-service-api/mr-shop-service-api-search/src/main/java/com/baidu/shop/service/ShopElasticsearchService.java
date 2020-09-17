package com.baidu.shop.service;

import com.alibaba.fastjson.JSONObject;
import com.baidu.shop.base.Result;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ShopElasticsearchService
 * @Description: TODO
 * @Author xiaopengyan
 * @Date 2020/9/16
 * @Version V1.0
 **/
@Api(tags = "es接口")
public interface ShopElasticsearchService {

    @ApiOperation(value = "清空ES中的商品数据")
    @GetMapping(value = "es/clearGoodsEsData")
    Result<JsonObject> clearGoodsEsData();


    @ApiOperation(value = "ES商品数据初始化")
    @GetMapping(value = "es/initGoodsEsData")
    Result<JSONObject> initGoodsEsData();
}