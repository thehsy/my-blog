package com.jicl.entity;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_tag
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Tag implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     * Database Column Remarks:
     *   标签名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_name
     *
     * @mbg.generated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}