package com.example.ErrorRecreate

import com.example.ErrorRecreate.Config.StringToExpressionConverter
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.StreamMessageConverter
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ErrorRecreateApplication {

	static void main(String[] args) {
		SpringApplication.run ErrorRecreateApplication, args
	}

	@Bean
	@StreamMessageConverter
	StringToExpressionConverter customMessageConverter() {
		return new StringToExpressionConverter()
	}
}
