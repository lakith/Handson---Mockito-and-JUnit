# Handson---Mockito-and-JUnit

```java
public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Consumer.class).to(MyApplication.class);
        /*** bind to the provider ***/         
        bind(MessageService.class).annotatedWith(SMS.class).toProvider(SMSServiceProvider.class);
        bind(MessageService.class).annotatedWith(Email.class).toProvider(EmailServiceProvider.class);
        /******/
        bind(String.class).annotatedWith(EmailServiceEndpoint.class).toInstance("https://test.mailgun.com");
        bind(String.class).annotatedWith(SMSServiceEndpoint.class).toInstance("https://api.test.us1.twilio.com/");
        bind(String.class).annotatedWith(AccountId.class).toInstance("sample-id");
        bind(String.class).annotatedWith(AuthToken.class).toInstance("strong-token");
        bind(Boolean.class).annotatedWith(URLRewite.class).toInstance(false);
        bind(Boolean.class).annotatedWith(SkipVerification.class).toInstance(false);
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
