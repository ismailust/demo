package com.example.demo.controller;


import com.example.demo.dto.KisiDto;
import com.example.demo.service.KisiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
@Api(value = "Kisi Adres Documentation")
public class KisiController {

    private final KisiService kisiService;

    @PostMapping
    @ApiOperation(value = "Yeni adres kaydet")
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }


    @GetMapping
    @ApiOperation(value = "Tumunu listele")
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return  ResponseEntity.ok(kisiService.getAll());
    }

}
