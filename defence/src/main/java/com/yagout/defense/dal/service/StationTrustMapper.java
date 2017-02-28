package com.yagout.defense.dal.service;

import java.util.List;
import java.util.Map;

import com.yagout.defense.dal.model.StationTrust;

public interface StationTrustMapper {
	int batchUpdate(Map<String,List<StationTrust>> stationTrustList);
	
	int batchInsert(Map<String,List<StationTrust>> stationTrustList);
	
	int deleteStationTrusts(List<String> macs);
	
    List<Map<String,Object>> selectAll(Map<String,Object> map);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    int deleteByPrimaryKey(String mac);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    int insert(StationTrust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    int insertSelective(StationTrust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    StationTrust selectByPrimaryKey(String mac);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    int updateByPrimaryKeySelective(StationTrust record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table station_trust
     *
     * @mbggenerated Thu Feb 09 10:30:45 CST 2017
     */
    int updateByPrimaryKey(StationTrust record);
    
    List<StationTrust> selectList();
}