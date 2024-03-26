package br.edu.utfpr.pb.pw25s.server.security;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationsResponseDto {

    private String token;

}
