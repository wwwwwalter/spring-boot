package com.walter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
    public static Logger logger = LoggerFactory.getLogger(ConfigInfoController.class);
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/initConfig")
    @ResponseBody
    public String initConfig(){
        logger.info(configInfo.toString());
        return configInfo.toString();
    }
}
