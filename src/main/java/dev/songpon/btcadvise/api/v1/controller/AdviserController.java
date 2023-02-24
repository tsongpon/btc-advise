package dev.songpon.btcadvise.api.v1.controller;

import dev.songpon.btcadvise.service.AdviserService;
import dev.songpon.btcadvise.api.v1.mapper.AdviseMapper;
import dev.songpon.btcadvise.api.v1.response.AdviseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdviserController {

    private AdviserService adviserService;

    @Autowired
    public AdviserController(AdviserService adviserService) {
        this.adviserService = adviserService;
    }

    @GetMapping("/v1/advise")
    public AdviseResponse getAdviser(@RequestParam String baseCoin) {
        var adviser = adviserService.getAdvise(baseCoin);
        return AdviseMapper.mapResponse(adviser);
    }
}
