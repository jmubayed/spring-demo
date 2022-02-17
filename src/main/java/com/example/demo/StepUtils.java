package com.example.demo;

import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
public class StepUtils {

    private List<String> headersValues;
    private List<Map<String, String>> rowsValues;

    public List<String> getHeadersValues() {
        return headersValues;
    }

    public void setHeadersValues(List<String> headersValues) {
        this.headersValues = headersValues;
    }

    public List<Map<String, String>> getRowsValues() {
        return rowsValues;
    }

    public void setRowsValues(List<Map<String, String>> rowsValues) {
        this.rowsValues = rowsValues;
    }
}
