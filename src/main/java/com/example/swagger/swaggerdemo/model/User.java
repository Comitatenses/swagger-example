package com.example.swagger.swaggerdemo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Schema(description = "User Api model documentation", title = "Model")
public class User
{
    @Schema(description = "Unique id field of user object", title = "Model")
    private int Id;

    @Schema(description = "UserName field of user object", title = "Model")
    private String userName;

    @Schema(description = "firstName field of user object", title = "Model")
    private String firstName;

    @Schema(description = "lastName field of user object", title = "Model")
    private String lastName;

    @Schema(description = "emailAddress field of user object", title = "Model")
    private String emailAddress;

    @Schema(description = "Date field of user object", title = "Model")
    private Date date;
}
