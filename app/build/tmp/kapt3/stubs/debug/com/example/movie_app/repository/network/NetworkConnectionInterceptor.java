package com.example.movie_app.repository.network;

import java.lang.System;

@android.annotation.TargetApi(value = 23)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/movie_app/repository/network/NetworkConnectionInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "kotlin.jvm.PlatformType", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isInternetAvailable", "", "app_debug"})
public final class NetworkConnectionInterceptor implements okhttp3.Interceptor {
    private final android.content.Context applicationContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final boolean isInternetAvailable() {
        return false;
    }
    
    public NetworkConnectionInterceptor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}