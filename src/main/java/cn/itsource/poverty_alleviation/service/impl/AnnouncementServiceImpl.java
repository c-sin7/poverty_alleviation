package cn.itsource.poverty_alleviation.service.impl;

import cn.itsource.poverty_alleviation.domain.Announcement;
import cn.itsource.poverty_alleviation.mapper.AnnouncementMapper;
import cn.itsource.poverty_alleviation.service.AnnouncementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告表 服务实现类
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements AnnouncementService {
    @Autowired
    private AnnouncementMapper announcementMapper;

}
