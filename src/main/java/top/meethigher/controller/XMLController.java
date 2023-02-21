package top.meethigher.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import top.meethigher.controller.model.Machine;
import top.meethigher.controller.model.Resp;

import java.awt.*;

/**
 * @author chenchuancheng
 * @see [SpringBoot系列之xml传参与返回实战演练 - 掘金](https://juejin.cn/post/7127640912049471519)
 * @since 2023/2/21 10:21
 */
@RestController
public class XMLController {


    /**
     * 模拟数据库
     */
    private volatile static Machine DB;


    @PostMapping(path = "xml/insert", produces = MediaType.APPLICATION_XML_VALUE)
    public Resp insert(@RequestBody Machine machine) {
        DB = machine;
        return new Resp(0, "成功", null);
    }

    @GetMapping(path = "xml/query", produces = MediaType.APPLICATION_XML_VALUE)
    public Resp<Machine> query() {
        return new Resp<>(0, "成功", DB);
    }


}
