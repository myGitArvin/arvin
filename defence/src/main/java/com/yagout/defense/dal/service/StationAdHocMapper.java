package com.yagout.defense.dal.service;

import com.yagout.defense.dal.model.StationAdHoc;
import com.yagout.defense.dal.model.StationAdHocExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StationAdHocMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int countByExample(StationAdHocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int deleteByExample(StationAdHocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String mac);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int insert(StationAdHoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int insertSelective(StationAdHoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    List<StationAdHoc> selectByExample(StationAdHocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    StationAdHoc selectByPrimaryKey(String mac);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StationAdHoc record, @Param("example") StationAdHocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StationAdHoc record, @Param("example") StationAdHocExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StationAdHoc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_ad_hoc
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StationAdHoc record);
    
    List<Map<String,Object>> selectAll(Map<String,Object> map);
}