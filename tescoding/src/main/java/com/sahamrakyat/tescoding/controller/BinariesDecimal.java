package com.sahamrakyat.tescoding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BinariesDecimal {

    @GetMapping("/binary-to-decimal/{id}")
    public Integer BinaryToDecimal(@PathVariable Integer id){
        int decimal = 0;
        Integer n = 0;
        while(true){
            if(id == 0){
                break;
            } else {
                Integer temp = id%10;
                decimal += temp*Math.pow(2, n);
                id = id/10;
                n++;
            }
        }
        return decimal;
    }

    @GetMapping("/decimal-to-binary/{id}")
    public String DecimalToBinary(@PathVariable Integer id){
        int binary[] = new int[40];
        String temp = "";
        int index = 0;
        while(id > 0){
            binary[index++] = id%2;
            id = id/2;
        }
        for(int i = index-1;i >= 0;i--){
            String temp1 = String.valueOf(binary[i]);
            temp += temp1;
        }
        return temp;
    }
}
