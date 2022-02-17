package com.example.demo.rest;

import com.example.demo.StepUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/Test")
public class ExecuteTest {

    @Autowired
    private StepUtils stepUtils;

    @RequestMapping(value = "/ExecuteTest", method = RequestMethod.POST)
    @ApiOperation(
            value = "Este metodo valida la conectividad de todas",
            notes = "<a href=\"http://localhost:9010/results\" target=\"_blank\">Resultados</a>",
            response = ExecuteTest.class
    )
    public ResponseEntity executeTest(@RequestBody String jsonTest){
        List<String> headers = Arrays.asList("ID", "Name","Status");
        List<Map<String, String>> rows = new ArrayList<>();
        rows.add(new HashMap<String, String>(){{
            put("ID", "1");
            put("Name", "Jim");
            put("Status", "active");
        }});
        rows.add(new HashMap<String, String>(){{
            put("ID", "2");
            put("Name", "Sally");
            put("Status", "inactive");
        }});
        stepUtils.setHeadersValues(headers);
        stepUtils.setRowsValues(rows);
        return new ResponseEntity("el test a ido bien ver tabla de resultados -> http://localhost:9010/results", HttpStatus.CREATED);
    }

}
