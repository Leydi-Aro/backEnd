package com.example.rentstate.properties.api.resource.propertyResource;

import com.example.rentstate.properties.domain.model.valueobjects.Categories;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreatePropertyResource {
    private String name;
    private String description;
    private String characteristics;
    private String location;
    private Categories category;
    private boolean available;
    private Long authorId;
    private Long renterId;
}
