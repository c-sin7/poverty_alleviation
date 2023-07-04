package cn.itsource.poverty_alleviation.controller;


import cn.itsource.poverty_alleviation.domain.Announcement;
import cn.itsource.poverty_alleviation.domain.common.AjaxResult;
import cn.itsource.poverty_alleviation.service.AnnouncementService;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = {"公告信息"})
@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;

    /**
     * 查询信息
     *
     * @return
     */
    @ApiOperation("查询信息")
    @GetMapping("/list")
    public AjaxResult list() {
        List<Announcement> list = announcementService.list();
        return success(list);
    }


    /**
     * 增加公告信息
     *
     * @param announcement
     * @return
     */
    @ApiOperation("增加公告信息")
    @PostMapping
    public AjaxResult save(@RequestBody Announcement announcement) {
        boolean result = announcementService.save(announcement);
        return success(result);
    }

    /**
     * 根据id删除公告
     * @param announcementId
     * @return
     */
    @ApiOperation("根据id删除公告信息")
    @DeleteMapping("/{announcementId}")
    public AjaxResult removeById(@PathVariable Integer announcementId) {
        boolean result = announcementService.removeById(announcementId);
        return toAjax(result);
    }

    /**
     * 根据id获取公告信息详情
     *
     * @param announcementId
     * @return
     */
    @ApiOperation("根据id获取公告信息")
    @GetMapping(value = "/{announcementId}")
    public AjaxResult getById(@PathVariable("announcementId") Integer announcementId) {
        Announcement announcementServiceById = announcementService.getById(announcementId);
        return success(announcementServiceById);
    }

    @ApiOperation("根据id更改公告信息")
    @PutMapping
    public AjaxResult update(@RequestBody Announcement announcement){
        UpdateChainWrapper<Announcement> update = announcementService.update();
        return toAjax(update);
    }
}
