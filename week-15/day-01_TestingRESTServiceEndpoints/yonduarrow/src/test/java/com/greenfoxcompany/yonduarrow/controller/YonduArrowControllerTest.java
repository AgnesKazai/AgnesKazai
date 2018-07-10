package com.greenfoxcompany.yonduarrow.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(YonduArrowController.class)
public class YonduArrowControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void YonduArrow_Successfull() throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.set("distance", "100.0");
        params.set("time", "10.0");

        mockMvc.perform(get("/yondu")
                .contentType(contentType)
                .params(params))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.distance", is(100.0)))
                .andExpect(jsonPath("$.time", is(10.0)))
                .andExpect(jsonPath("$.speed", is(10.0)));

    }
}
