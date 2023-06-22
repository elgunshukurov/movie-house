package web.app.moviehouse.dto;

import lombok.Data;

@Data
public class UserDto {
    private String id;

    private String firstName;
    private String lastName;
    private String password;

}
