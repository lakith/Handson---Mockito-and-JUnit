# Handson---Mockito-and-JUnit

```java
import com.guice.intro.annotations.Email;
import com.guice.intro.service.MessageService;

import javax.inject.Inject;

public class MyApplication implements Consumer {

    private MessageService emailService;

    @Inject
    public  MyApplication (@Email MessageService messageService) {
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
    @Provides
    @Singleton
    @Email
    MessageService provideEmailService(
            @EmailServiceEndpoint String emailServiceEndpoint,
            @URLRewite Boolean urlRewrite,
            @SkipVerification Boolean skipVerification
            ) {
        MessageService emailService = new EmailService(emailServiceEndpoint, urlRewrite, skipVerification);
        return  emailService;
    }
```
