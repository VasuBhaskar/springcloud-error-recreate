package com.example.ErrorRecreate.interfaces.input

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

/**
 * Created by z001txk on 7/5/18.
 */
interface InputSource {
    String INPUT = 'input1'

    @Input(InputSource.INPUT)
    SubscribableChannel input1()
}
