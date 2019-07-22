/**
 * @Project Name:life-admin-api
 * @Package Name:cn.hoofungson.life.admin.api.domain.vo.item
 * @Since JDK 1.8
 */
package cn.hoofungson.life.admin.api.domain.vo.item;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: 流水项VO
 * @Author 胡松 hoofungson@163.com
 * @Date 2019-07-22 17:16
 * @Version V1.0
 */
@Data
public class ItemVO implements Serializable {

    private Long id;
    private String name;
    private BigDecimal money;
    private Date createTime;
    private Date updateTime;
}
