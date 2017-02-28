package com.skeye.yagout.dal.service;

import com.skeye.yagout.dal.model.YagoutPermissions;
import com.skeye.yagout.dal.model.YagoutPermissionsExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface YagoutPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int countByExample(YagoutPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int deleteByExample(YagoutPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer permissionsNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int insert(YagoutPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int insertSelective(YagoutPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    List<YagoutPermissions> selectByExample(YagoutPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    YagoutPermissions selectByPrimaryKey(Integer permissionsNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YagoutPermissions record, @Param("example") YagoutPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YagoutPermissions record, @Param("example") YagoutPermissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YagoutPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yagout_permissions
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YagoutPermissions record);
    
    Set<String> getPermissionsByUserName(String userName);
    
}