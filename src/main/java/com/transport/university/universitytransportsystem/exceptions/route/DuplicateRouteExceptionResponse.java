package com.transport.university.universitytransportsystem.exceptions.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DuplicateRouteExceptionResponse {
    private String route;
}
