package com.yagout.defense.dal.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yagout.defense.dal.model.UserLogEventType;
import com.yagout.defense.dal.model.UserLogEventTypeExample;

public interface UserLogEventTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int countByExample(UserLogEventTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int deleteByExample(UserLogEventTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer eventType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int insert(UserLogEventType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int insertSelective(UserLogEventType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    List<UserLogEventType> selectByExample(UserLogEventTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    UserLogEventType selectByPrimaryKey(Integer eventType);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserLogEventType record, @Param("example") UserLogEventTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserLogEventType record, @Param("example") UserLogEventTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserLogEventType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log_event_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserLogEventType record);
}