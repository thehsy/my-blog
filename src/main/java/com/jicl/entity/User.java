package com.jicl.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class User implements Serializable {
    /**
     * Database Column Remarks:
     *   用户id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户登录名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   昵称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     * Database Column Remarks:
     *   登录密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   角色类型：1-超级管理员；2-普通管理员；3-VIP用户；4-普通用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_role
     *
     * @mbg.generated
     */
    private String userRole;

    /**
     * Database Column Remarks:
     *   用户状态：0-封禁；1-正常
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_status
     *
     * @mbg.generated
     */
    private String userStatus;

    /**
     * Database Column Remarks:
     *   联系方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   用户头像
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.head_portrait
     *
     * @mbg.generated
     */
    private String headPortrait;

    /**
     * Database Column Remarks:
     *   注册时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.register_time
     *
     * @mbg.generated
     */
    private Date registerTime;

    /**
     * Database Column Remarks:
     *   最后登录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_login_time
     *
     * @mbg.generated
     */
    private Date lastLoginTime;

    /**
     * Database Column Remarks:
     *   最后登录ip
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_login_ip
     *
     * @mbg.generated
     */
    private String lastLoginIp;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.del_flag
     *
     * @mbg.generated
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}