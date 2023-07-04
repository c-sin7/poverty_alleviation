package cn.itsource.poverty_alleviation.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 贫困户帮扶情况表
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SupportSituation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 帮扶情况ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 贫困户ID
     */
    private Integer poorHouseholdId;

    /**
     * 帮扶项目
     */
    private String supportProject;

    /**
     * 帮扶内容
     */
    private String supportContent;

    /**
     * 开始日期
     */
    private LocalDate startDate;

    /**
     * 结束日期
     */
    private LocalDate endDate;

    /**
     * 帮扶人员
     */
    private String supportPersonnel;

    /**
     * 帮扶状态
     */
    private String supportStatus;

    /**
     * 帮扶结果
     */
    private String supportResult;

    /**
     * 备注
     */
    private String remark;


}
