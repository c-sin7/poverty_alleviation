package cn.itsource.poverty_alleviation.mapper;

import cn.itsource.poverty_alleviation.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
