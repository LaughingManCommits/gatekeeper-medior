package com.gate.keeper.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class StaticResourcesResponseDto {
    private List<String> resources;
}
