# Handson---Mockito-and-JUnit

```java
@Provides
MessageService provideEmailService() {
  String emailServiceEndpoint = "test.mailgun.com";
  boolean urlRewrite = false;
  boolean skipVerification = true;

  MessageService emailService = new EmailService(emailServiceEndpoint, urlRewrite, skipVerification);
    return  emailService;
}
```
