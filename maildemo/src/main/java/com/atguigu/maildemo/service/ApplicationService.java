package com.atguigu.maildemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ApplicationService {
//    @Autowired
//    JavaMailSenderImpl mailSender;
//    String text = "";
//    public void toRegister(String mail) {
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        //邮件设置
//        simpleMailMessage.setSubject("验证码");
//        Random random = new Random();
//        for (int i = 0; i < 4; i++) {
//            text += random.nextInt(9);
//        }
//        System.out.println(text);
//        simpleMailMessage.setText("您好，验证码为："+text);
//        simpleMailMessage.setTo(mail);
//        simpleMailMessage.setFrom("2544823084@qq.com");
//        mailSender.send(simpleMailMessage);
        public int toRegister(int a,int b){
           int x=a;
           int y=b;
           int sum=x+y;
           toCode(sum);
            return sum;
        }
        public int toCode(int sum) {
            System.out.println(sum);
            return sum;
        }


//    public boolean verifi(String code) {
//        if(text.equals(code)){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
