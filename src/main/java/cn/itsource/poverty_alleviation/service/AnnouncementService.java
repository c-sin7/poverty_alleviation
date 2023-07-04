package cn.itsource.poverty_alleviation.service;

import cn.itsource.poverty_alleviation.domain.Announcement;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 公告表 服务类
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
public interface AnnouncementService extends IService<Announcement> {

    Announcement selectAnnouncementInfoById(Integer announcementId);
}
