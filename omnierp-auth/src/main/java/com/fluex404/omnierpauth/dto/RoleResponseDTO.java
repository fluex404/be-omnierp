package com.fluex404.omnierpauth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponseDTO {
    private Long id;
    private String name;
    private List<PrivilageResponseDTO> privilages = new ArrayList<>();
}
