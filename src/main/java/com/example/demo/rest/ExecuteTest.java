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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
        List<String> headers = Arrays.asList("ID", "Name", "Salary", "Status");
        List<Map<String, Object>> rows = new ArrayList<>();
        rows.add(Map.of("ID", "1", "Name", "Jim",  "Status", "active"));
        rows.add(Map.of("ID", "2", "Name", "Sally", "Status", "inactive"));
        stepUtils.setHeadersValues(headers);
        stepUtils.setRowsValues(rows);
        return new ResponseEntity("el test a ido bien ver tabla de resultados -> http://localhost:9010/results", HttpStatus.CREATED);
    }

}
