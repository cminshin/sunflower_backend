package Sunflower.Sunflowerspring.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserJoinRequest {
    private String id;
    private String password;
    private String userName;
}
