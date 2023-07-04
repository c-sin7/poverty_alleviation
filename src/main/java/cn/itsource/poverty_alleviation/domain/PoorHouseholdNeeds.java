package cn.itsource.poverty_alleviation.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 贫困户需求情况表
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PoorHouseholdNeeds implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需求ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 社会保险需求
     */
    private Boolean socialInsurance;

    /**
     * 社会救助福利补贴需求
     */
    private Boolean socialAssistanceWelfareSubsidy;

    /**
     * 托养服务需求
     */
    private Boolean fosterCareServices;

    /**
     * 康复需求
     */
    private Boolean rehabilitation;

    /**
     * 无障碍改造需求
     */
    private Boolean accessibilityImprovement;

    /**
     * 教育需求
     */
    private Boolean education;

    /**
     * 文化体育需求
     */
    private Boolean cultureSports;

    /**
     * 就业需求
     */
    private Boolean employment;

    /**
     * 扶贫需求
     */
    private Boolean povertyAlleviation;

    /**
     * 维权需求
     */
    private Boolean rightsProtection;

    /**
     * 改善基本生活条件需求
     */
    private Boolean improvementBasicLivingConditions;


}
