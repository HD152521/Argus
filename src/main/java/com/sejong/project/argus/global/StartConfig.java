//package com.sejong.project.argus.global;
//
//import com.sejong.project.argus.taskSchedule.SchedulerService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class StartConfig implements CommandLineRunner {
//
////    private final FcmService fcmService;
//    private final SchedulerService schedulerService;
//
//    @Override
//    public void run (String... args){
//        System.out.println("run에서 실행");
////        LocalDateTime now = LocalDateTime.now();
////        System.out.println("start fcm"+now);
////        int nowMinute = now.getMinute();
////
////        if(!(nowMinute%10==0)) nowMinute += 10 - nowMinute%10;
////        nowMinute%=60;
////
////        System.out.println("최초 실행시 "+nowMinute);
//
////        schedulerService.setCron(nowMinute);
//        schedulerService.startScheduler();
//    }
//}
