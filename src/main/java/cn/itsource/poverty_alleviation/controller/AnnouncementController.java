package cn.itsource.poverty_alleviation.controller;


import cn.itsource.poverty_alleviation.domain.Announcement;
import cn.itsource.poverty_alleviation.domain.common.AjaxResult;
import cn.itsource.poverty_alleviation.service.AnnouncementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static cn.itsource.poverty_alleviation.domain.common.AjaxResult.success;

/**
 * <p>
 * 公告表 前端控制器
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Api(tags={"公告信息"})
@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    @ApiOperation("查询信息")
//    @PreAuthorize("@ss.hasPermi('announcement:info:list')")
    @GetMapping("/list")
    public AjaxResult list(Announcement announcement)
    {
//        startPage();
        List<Announcement> list = announcementService.list();
//        return getDataTable(list);
        return success(list);
    }

    @ApiOperation("根据id获取公告信息详情")
    @GetMapping(value = "/{announcementId}")
    public AjaxResult getInfo(@PathVariable("announcementId") Integer announcementId)
    {
        return success(announcementService.selectAnnouncementInfoById(announcementId));
    }

}
