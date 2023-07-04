package cn.itsource.poverty_alleviation.controller;


import cn.itsource.poverty_alleviation.service.FeedbackService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 群众反馈表 前端控制器
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Api(tags={"反馈信息"})
@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
}
