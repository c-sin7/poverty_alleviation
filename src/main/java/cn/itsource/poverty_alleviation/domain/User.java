package cn.itsource.poverty_alleviation.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 注册时间
     */
    private LocalDateTime registrationTime;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLogin;

    /**
     * 用户头像的路径或链接
     */
    private String sculpture;

    /**
     * 个人简介
     */
    private String introduction;

    /**
     * 用户权限级别
     */
    private String privilege;


}
