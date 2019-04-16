package com.xnt.dhq.mapper;

import com.xnt.dhq.model.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by afu on 2019-03-19.
 */
@Mapper
public interface DeviceMapper {
    int insert(Device device);
    int deleteById(Long id);
    Device selectById(Long id);
}