package com.example.ErrorRecreate

import com.example.ErrorRecreate.interfaces.input.InputSource
import com.example.ErrorRecreate.interfaces.output.OutputDestiny
import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.messaging.Message
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.support.MessageBuilder

@SpringBootApplication
@Slf4j
@EnableBinding(value = InputSource.class)
class ErrorRecreateApplication {

	static void main(String[] args) {
		SpringApplication.run ErrorRecreateApplication, args
	}

	@StreamListener(InputSource.INPUT)
	@SendTo(OutputDestiny.OUTPUT)
	String processMessage(Message<String> event) {
		log.info('message' + event)
		//populating the key as 1 just for testing purposes. I have tried with string values as well
		Message<String> outputMessage = MessageBuilder.withPayload(event.getPayload()).setHeader('myKey', 1).build()
		log.info('out' + outputMessage)
		return outputMessage

	}
}
