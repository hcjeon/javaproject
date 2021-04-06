package com.hcjeon.apis.data;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResultMain {
    @ApiModelProperty(notes = "parameter1", required = true)
    private String pm1;
    @ApiModelProperty(notes = "parameter2", required = true)
    private int pm2;
    @ApiModelProperty(notes = "parameter3", required = true)
    private int pm3;
}
