package com.jacobyang.ydd_marry.entity;/**
 * @Author: JacobYang
 * @Date: 2021/9/13 16:57
 * @Description:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: Invitation
 * @Description: TODO
 * @Author: JacobYang
 * @Date: 2021/9/13 16:57
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invitation {

    private Long id;

    private String address;

    /**
     * 0 不播放 1播放
     */
    private Integer autoPlay;

    private String boy;

    private String boyPhone;

    private Date date;

    private String girl;

    private String girlPhone;

    private String hotel;

    private String image;

    private Double latitude;

    private Double longitude;

    private String lunar;

    private String music;
}
