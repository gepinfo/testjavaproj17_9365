package com.default_service.gcam.model;

import com.default_service.gcam.dto.ResourceResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResourceMapper {
    ResourceResponseDto toDto(Resource resource);
}
