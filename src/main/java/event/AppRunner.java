package event;

import event.controller.EventController;
import event.controller.FileController;
import event.controller.UserController;
import event.model.Event;
import event.model.User;
import  event.model.File;

import javax.jws.soap.SOAPBinding;
import java.awt.*;

public class AppRunner {


    public static void main(String[]args){
   FileController fileController = new FileController();

        File f = new File();
        f.setPath("ddddd");

        System.out.
                println(f);

        fileController.save(f.getPath());

        System.out.println(fileController.getById(1l));
     System.out.println(fileController.getAll());

     // fileController.deleteById(2l);

        System.out.println(fileController.getAll());

        fileController.update(1l, "sss");

        System.out.println(fileController.getAll());

       UserController userController = new UserController();

        User user = new User();
        user.setName("AAA");

        userController.save(user.getName());

        System.out.println(userController.getAll());

        System.out.println(userController.getById(3l));

        User user1 = userController.getById(3l);
        user1.setName("ddd00");
        userController.update(user1.getId(),user1.getName());

      //  userController.deleteById(2l);
       System.out.println(userController.getAll());

        EventController eventController = new EventController();

        Event event = new Event();

        event.setUser(userController.getById(1l));
        event.setFile(fileController.getById(1l));
        event.setAction("открытие");
        eventController.save(event.getAction(),event.getFile(),event.getUser());

       System.out.println("! "+eventController.getAll());
 //  eventController.deleteById(3l);
        System.out.println("!! "+eventController.getAll());

      Event event1 = eventController.getById(5l);
      event1.setAction("закрытие");
      eventController.update(event1.getId(),event1.getAction(),event1.getFile(),event1.getUser());
        System.out.println("!!! "+eventController.getAll());

//        System.out.println(userController.getAll());
//        System.out.println(fileController.getAll());
//
        System.out.println(eventController.getById(4l));

        System.exit(0);
    }
}