package com.example.edu.jpeople.util;

import com.sun.xml.internal.ws.api.message.Header;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;

/**
 * @author ASUS
 * @date 2018/11/27
 */
public class SetHeaders {
    public static HttpHeaders setEncoding() {
        HttpHeaders headers = new HttpHeaders();
        MediaType mediaType = new MediaType("text","html", Charset.forName("UTF-8"));
        headers.setContentType(mediaType);
        return headers;
    }
}
