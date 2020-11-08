# Handson---Mockito-and-JUnit

```java
bind(Consumer.class).to(MyApplication.class);
bind(MessageService.class).to(EmailServiceProvider.class);
```


```java
@Qualifier
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RUNTIME)
public @interface AuthToken {
}
```
