package com.bkt.msscmilkservice.web.controller;


import com.bkt.msscmilkservice.web.model.MilkDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/milk")
@RestController
public class MilkController {

    @GetMapping({"/{milkId}"})
    public ResponseEntity<MilkDto> getBeerById(@PathVariable("milkId") UUID milkId){
        // todo impl
        return new ResponseEntity<>(MilkDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewMilk(@RequestBody MilkDto milkDto){

        return new ResponseEntity(MilkDto.builder().build(), HttpStatus.CREATED);
    }

    @PutMapping({"/{milkId}"})
    public ResponseEntity updateMilkById(@PathVariable("milkId") UUID milkId, @RequestBody MilkDto milkDto ){

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

/*    @DeleteMapping({"/{milkId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMilk(@PathVariable("milkId") UUID milkId){
        milkService.deleteMilk(milkId);
    }*/
}
