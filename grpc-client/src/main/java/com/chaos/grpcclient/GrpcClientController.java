package com.chaos.grpcclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/remote")
    public String testRemote(@RequestParam(defaultValue = "liaopeng") String param) {
        return grpcClientService.testRemote(param);
    }
}
