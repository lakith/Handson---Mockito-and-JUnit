# Handson---Mockito-and-JUnit

```java
@Inject
public EmailServiceProvider(
       @EmailServiceEndpoint String emailServiceEndpoint,
       @URLRewite boolean urlRewrite,
       @SkipVerification boolean skipVerification) {
   this.emailServiceEndpoint = emailServiceEndpoint;
   this.urlRewrite = urlRewrite;
   this.skipVerification = skipVerification;
}
```


```java
@Qualifier
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RUNTIME)
public @interface AuthToken {
}
```
