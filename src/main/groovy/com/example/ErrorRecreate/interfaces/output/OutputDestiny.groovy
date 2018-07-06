package com.example.ErrorRecreate.interfaces.output

import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel

/**
 * Created by z001txk on 7/5/18.
 */
interface OutputDestiny {
    String OUTPUT = 'output1'

    @Output(OutputDestiny.OUTPUT)
    MessageChannel output1()
}