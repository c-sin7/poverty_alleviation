package cn.itsource.poverty_alleviation.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 贫困户基本信息表
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PoorHouseholdInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 贫困户ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 民族
     */
    private String ethnicity;

    /**
     * 残疾证号
     */
    private String disabilityCertificate;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 户籍所在地
     */
    private String residence;

    /**
     * 家庭人数
     */
    private Integer familySize;

    /**
     * 残疾情况
     */
    private String disabilityCondition;

    /**
     * 联系方式
     */
    private String contactNumber;

    /**
     * 家庭收入
     */
    private BigDecimal familyIncome;

    /**
     * 家庭住房情况
     */
    private String housingSituation;

    /**
     * 受教育程度
     */
    private String educationLevel;

    /**
     * 婚姻状况
     */
    private String maritalStatus;


}
