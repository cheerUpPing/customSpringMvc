package com.elon.controller;

import com.elon.core.anotation.AutoWire;
import com.elon.core.anotation.Controller;
import com.elon.core.anotation.RequestMapping;
import com.elon.service.impl.HarmonyService;

/**
 * 2017/2/14 15:22.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Controller(name = "harmonyController")
@RequestMapping(value = "/harmony")
public class HarmonyController {

    @AutoWire
    private HarmonyService harmonyService;

    @RequestMapping(value = "/doGreen")
    public String doGreen(String param) {
        return harmonyService.doGreen(param);
    }

    @RequestMapping(value = "/doDinner")
    public String doDinner(String param) {
        return harmonyService.doDinner(param);
    }

}
