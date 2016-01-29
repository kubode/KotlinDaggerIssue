Kotlin with Dagger issue
===

Kotlin does not generate `XxxModule_ProvideXxxFactory` classes when using same type of `@Provides` annotated functions.


```java
@Module public class ApplicationModule {
    @Provides @ApplicationScope String provideString() { return "Application"; }
}

@Module public class ActivityModule {
    @Provides @ActivityScope String provideString() { return "Activity"; }
}
```

In pure java case, `ActivityModule_ProvideStringFactory` and `ApplicationModule_ProvideStringFactory` are created.
(`:java:build` task success.)

But pure kotlin case, `ActivityModule_ProvideStringFactory` and `ApplicationModule_ProvideStringFactory` are not created.
(`:kotlin:build` task fails.)


Using versions:
```gradle
    ext.kotlin_version = '1.0.0-beta-4589'
    ext.dagger_version = '2.1-SNAPSHOT'
```
