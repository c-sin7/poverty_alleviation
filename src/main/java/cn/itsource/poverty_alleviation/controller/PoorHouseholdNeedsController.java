package cn.itsource.poverty_alleviation.controller;


import cn.itsource.poverty_alleviation.service.PoorHouseholdNeedsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 贫困户需求情况表 前端控制器
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Api(tags={"贫困户需求情况信息"})
@RestController
@RequestMapping("/poor-household-needs")
public class PoorHouseholdNeedsController {
    @Autowired
    private PoorHouseholdNeedsService poorHouseholdNeedsService;

}
