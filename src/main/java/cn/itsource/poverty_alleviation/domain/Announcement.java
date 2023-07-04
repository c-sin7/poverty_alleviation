package cn.itsource.poverty_alleviation.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 公告表
 * </p>
 *
 * @author sin
 * @since 2023-07-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Announcement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用于唯一标识每个公告的数字或字符串。
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 公告的标题。
     */
    private String title;

    /**
     * 公告的详细内容。
     */
    private String content;

    /**
     * 发布公告的人员或组织的标识符或名称。
     */
    private String publisher;

    /**
     * 公告发布的日期和时间。
     */
    private LocalDateTime publishTime;

    /**
     * 公告生效的开始日期和时间。
     */
    private LocalDateTime startTime;

    /**
     * 公告生效的结束日期和时间。
     */
    private LocalDateTime endTime;

    /**
     * 表示公告的重要程度或优先级，如低、中、高等。
     */
    private String priority;

    /**
     * 表示公告的状态，如草稿、发布、下线等。
     */
    private String status;

    /**
     * 公告的类别或类型，如通知、公告、警示等。
     */
    private String type;


}
