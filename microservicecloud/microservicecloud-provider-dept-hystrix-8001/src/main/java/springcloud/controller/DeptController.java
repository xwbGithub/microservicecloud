package springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springcloud.service.DeptService;

import java.util.List;

@RestController
@SuppressWarnings("SpringJavaAutowiringInspection")
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败抛出“错误信息后，胡自动范湖用@HystrixCommand标注好的fallbackMethod调用类中的指定方法”
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("该ID：" + id + "没有对应的信息，null--@HystrixCommand");
        dept.setDb_source("no this database in mysql");
        return dept;
    }
}
