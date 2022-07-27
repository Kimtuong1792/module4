package codegym.borrow_books.loger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
@Aspect
public class LogAspect {


    @Pointcut("execution(* codegym.borrow_books.controller.BookController.*(..))")
    public void allMethodCallPointCut() {
    }

    @Pointcut("execution(* codegym.borrow_books.controller.BookController.home(..))")
    public void allMethodListPointCut() {
    }

    @Before("allMethodCallPointCut()")
    public void beforeCallMethodList(JoinPoint joinPoint) {
        System.err.println(" Prepare to run method   : " +
                joinPoint.getSignature().getName() +
                ":  time : " + LocalDate.now());
    }

}
