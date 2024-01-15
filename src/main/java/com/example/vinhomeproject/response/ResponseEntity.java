package com.example.vinhomeproject.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ResponseEntity {
    private String messages;
    private Object object;
}
