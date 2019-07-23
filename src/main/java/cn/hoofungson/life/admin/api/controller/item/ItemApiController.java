/**
 * @Project Name:life-admin-api
 * @Package Name:cn.hoofungson.life.admin.api.controller.item
 * @Since JDK 1.8
 */
package cn.hoofungson.life.admin.api.controller.item;

import cn.hoofungson.life.admin.api.domain.vo.item.ItemVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 流水项API控制器
 * @Author 胡松 hoofungson@163.com
 * @Date 2019-07-22 17:17
 * @Version V1.0
 */
@Slf4j
@RequestMapping(value = "/rest/api/item")
@RestController
public class ItemApiController implements Serializable {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 获取流水项列表
     * **/
    @GetMapping
    public HttpEntity<Map<String, Object>> getList() throws URISyntaxException {
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("code", 200101L);
        List<ItemVO> itemVOList = this.restTemplate.getForObject(new URI("http://life-item-service//life/service/item"), List.class);
        map.put("result", itemVOList);
        map.put("message", "流水获取成功");
        return new HttpEntity<>(map);
    }
}
