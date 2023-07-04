package cn.itsource.poverty_alleviation.service.impl;

import cn.itsource.poverty_alleviation.domain.User;
import cn.itsource.poverty_alleviation.mapper.UserMapper;
import cn.itsource.poverty_alleviation.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
