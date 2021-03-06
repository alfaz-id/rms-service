package id.alfaz.rms.controller;


import id.alfaz.rms.helper.context.ApiContext;
import id.alfaz.rms.helper.model.ApiResponse;
import id.alfaz.rms.helper.model.PageRequest;
import id.alfaz.rms.model.request.brand.BrandRequest;
import id.alfaz.rms.model.response.brand.BrandResponse;
import id.alfaz.rms.model.response.brand.GetListBrandResponse;
import id.alfaz.rms.service.BrandService;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "Master Brand")
@RestController
@RequestMapping(value = "/v1/brand")
public class BrandController {

    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @ApiOperation("Get list Brand")
    @ApiImplicitParams({
            @ApiImplicitParam(name = ApiContext.outletId, value = "Outlet ID", paramType = "header")
    })
    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public GetListBrandResponse list(PageRequest pageRequest){
        return brandService.execute(pageRequest);
    }

    @ApiOperation("Post add Brand")
    @ApiImplicitParams({
            @ApiImplicitParam(name = ApiContext.outletId, value = "Outlet ID", paramType = "header"),
            @ApiImplicitParam(name = ApiContext.employeeId, value = "Employee, ID", paramType = "header")
    })
    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse add(@Valid @RequestBody BrandRequest request){
        return brandService.add(request);
    }

    @ApiOperation("Put update brand")
    @ApiImplicitParams({
            @ApiImplicitParam(name = ApiContext.outletId, value = "Outlet ID", paramType = "header"),
            @ApiImplicitParam(name = ApiContext.employeeId, value = "Employee, ID", paramType = "header")
    })
    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse update(String brandId,@Valid @RequestBody BrandRequest request){
        return brandService.update(brandId,request);
    }

    @ApiOperation("Get detail Brand")
    @ApiImplicitParams({
            @ApiImplicitParam(name = ApiContext.outletId, value = "Outlet ID", paramType = "header")
    })
    @GetMapping(value = "/detail",produces = MediaType.APPLICATION_JSON_VALUE)
    public BrandResponse detail(String brandId){
        return brandService.detail(brandId);
    }
}
