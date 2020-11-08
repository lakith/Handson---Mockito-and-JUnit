# Handson---Mockito-and-JUnit

```java
public class MyApplication implements Consumer {

    private MessageService emailService;

    @Inject
    public  MyApplication (MessageService messageService) {
        this.emailService = messageService;
    }

    @Override
    public void processMessages(String message, String receiver) {
        //do some msg validation, manipulation logic etc
        this.emailService.sendMessage(message, receiver);
    }
}
```


```java
@Qualifier
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RUNTIME)
public @interface AuthToken {
}
```
