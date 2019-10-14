package com.bfxy.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 输入输出的接口
 */
public interface Barista {
	  
    String OUTPUT_CHANNEL = "output_channel";

    String INPUT_CHANNEL = "input_channel";

    //注解@Output声明了它是一个输出类型的通道
    @Output(Barista.OUTPUT_CHANNEL)
    MessageChannel output();

    //注解@Input声明了它是一个输入类型的通道
	@Input(Barista.INPUT_CHANNEL)
    SubscribableChannel input();

}  