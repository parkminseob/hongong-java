package com.practiceExample.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<Message>();

    messageQueue.offer(new Message("sendMail","홍길동"));
    messageQueue.offer(new Message("sendSMS", "박민섭"));
    messageQueue.offer(new Message("sendKakaotalk", "최미선"));

    while(!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch(message.command) {
        case "sendMail":
          System.out.println(message.to + "님에게 메일을 보냈습니다.");
          break;
        case "sendSMS":
          System.out.println(message.to + "님에게 메일을 보냈습니다.");
          break;
        case "sendKakaotalk":
          System.out.println(message.to + "님에게 메일을 보냈습니다.");
          break;
      }
    }
  }
}